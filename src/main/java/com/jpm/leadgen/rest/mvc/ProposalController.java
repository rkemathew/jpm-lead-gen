package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.ProposalService;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import com.jpm.leadgen.core.services.util.CustomerList;
import com.jpm.leadgen.rest.resources.CustomerListResource;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.asm.CustomerListResourceAsm;
import com.jpm.leadgen.rest.resources.asm.CustomerResourceAsm;
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
//@Controller
//@RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE, value="/rest/proposal")
public class ProposalController {
    private ProposalService proposalService;

    @Autowired
    public ProposalController(ProposalService proposalService) {
        this.proposalService = proposalService;
    }


}
