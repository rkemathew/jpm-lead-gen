package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.ProposalSessionService;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import com.jpm.leadgen.rest.resources.CustomerGoalResource;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.ProposalSessionResource;
import com.jpm.leadgen.rest.resources.asm.CustomerResourceAsm;
import com.jpm.leadgen.rest.resources.asm.ProposalSessionResourceAsm;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;

/**
 * Created by Ronnie on 6/11/15.
 */
@Controller
@RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE, value="/rest/proposalSession")
public class ProposalSessionController {
    private ProposalSessionService proposalSessionService;
    private CustomerService customerService;

    @Autowired
    public ProposalSessionController(ProposalSessionService proposalSessionService, CustomerService customerService) {
        this.proposalSessionService = proposalSessionService;
        this.customerService = customerService;
    }

    @RequestMapping(value="/{proposalSessionId}", method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public ResponseEntity<ProposalSessionResource> findProposalSession(
            @PathVariable Long proposalSessionId
    ) {
        ProposalSession proposalSession = proposalSessionService.findProposalSession(proposalSessionId);
        if(proposalSession != null) {
            ProposalSessionResource res = new ProposalSessionResourceAsm().toResource(proposalSession);
            return new ResponseEntity<ProposalSessionResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProposalSessionResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    public ResponseEntity<ProposalSessionResource> createProposalSession(
            @RequestBody ProposalSessionResource sentProposalSession
    ) throws Exception {
        long customerId = sentProposalSession.getCustomerGoal().getCustomer().getRid();
        Customer customer = customerService.findCustomer(customerId);

        long proposalSessionId = sentProposalSession.getRid();
        ProposalSession proposalSession = sentProposalSession.toProposalSession();
        proposalSession.getCustomerGoal().setCustomer(customer);
        if (proposalSessionId == -1) {
            proposalSession = proposalSessionService.createProposalSession(proposalSession);
        } else {
            proposalSession = proposalSessionService.updateProposalSession(proposalSessionId, proposalSession);
        }

        ProposalSessionResource res = new ProposalSessionResourceAsm().toResource(proposalSession);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(res.getLink("self").getHref()));
        return new ResponseEntity<ProposalSessionResource>(res, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value="/{proposalSessionId}", method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    public ResponseEntity<ProposalSessionResource> updateProposalSession(
            @PathVariable Long proposalSessionId, @RequestBody ProposalSessionResource proposalSessionDTO
    ) throws Exception {
        CustomerGoalResource customerGoalDTO = proposalSessionDTO.getCustomerGoal();
        long customerId = customerGoalDTO.getCustomer().getRid();
        long customerGoalId = customerGoalDTO.getRid();
        CustomerGoal customerGoal = proposalSessionService.findCustomerGoal(customerGoalId);

        BeanUtils.copyProperties(customerGoal, customerGoalDTO.toCustomerGoal());
        customerGoal.setId(customerGoalId);
        Customer customer = customerService.findCustomer(customerId);
        customerGoal.setCustomer(customer);

        ProposalSession proposalSession = proposalSessionDTO.toProposalSession();
        proposalSession.setCustomerGoal(customerGoal);

        ProposalSession updatedProposalSession = proposalSessionService.updateProposalSession(proposalSessionId, proposalSession);
        if(updatedProposalSession != null) {
            ProposalSessionResource res = new ProposalSessionResourceAsm().toResource(updatedProposalSession);
            return new ResponseEntity<ProposalSessionResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProposalSessionResource>(HttpStatus.NOT_FOUND);
        }
    }
}
