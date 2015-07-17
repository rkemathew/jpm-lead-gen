package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.services.ProposalSessionService;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.ProposalSessionResource;
import com.jpm.leadgen.rest.resources.asm.CustomerResourceAsm;
import com.jpm.leadgen.rest.resources.asm.ProposalSessionResourceAsm;
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

    @Autowired
    public ProposalSessionController(ProposalSessionService proposalSessionService) {
        this.proposalSessionService = proposalSessionService;
    }

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    public ResponseEntity<ProposalSessionResource> createProposalSession(
            @RequestBody ProposalSessionResource sentProposalSession
    ) {
        ProposalSession proposalSession = proposalSessionService.createProposalSession(sentProposalSession.toProposalSession());
        ProposalSessionResource res = new ProposalSessionResourceAsm().toResource(proposalSession);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(res.getLink("self").getHref()));
        return new ResponseEntity<ProposalSessionResource>(res, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value="/{proposalSessionId}", method = RequestMethod.PUT)
    @PreAuthorize("permitAll")
    public ResponseEntity<ProposalSessionResource> updateCustomer(
            @PathVariable Long proposalSessionId, @RequestBody ProposalSessionResource sentProposalSession
    ) {
        ProposalSession updatedProposalSession = proposalSessionService.updateProposalSession(proposalSessionId, sentProposalSession.toProposalSession());
        if(updatedProposalSession != null) {
            ProposalSessionResource res = new ProposalSessionResourceAsm().toResource(updatedProposalSession);
            return new ResponseEntity<ProposalSessionResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProposalSessionResource>(HttpStatus.NOT_FOUND);
        }
    }
}
