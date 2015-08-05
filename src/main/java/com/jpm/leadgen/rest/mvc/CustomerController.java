package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.CustomerService;
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
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/**
 * Created by Ronnie on 6/11/15.
 */
@Controller
@RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE, value="/rest/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerListResource> findAllCustomers() {
        CustomerList customerList = customerService.findAllCustomers();
        CustomerListResource res = new CustomerListResourceAsm().toResource(customerList);
        return new ResponseEntity<CustomerListResource>(res, HttpStatus.OK);
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerResource> findCustomer(
            @PathVariable Long customerId
    ) {
        Customer customer = customerService.findCustomer(customerId);
        if(customer != null) {
            CustomerResource res = new CustomerResourceAsm().toResource(customer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(params = { "paramCompanyName" }, method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerListResource> findCustomersWithCompanyNameLike(
            @RequestParam(value = "paramCompanyName") String paramCompanyName
    ) {
        CustomerList customerList = customerService.findCustomersLike(paramCompanyName);
        CustomerListResource res = new CustomerListResourceAsm().toResource(customerList);
        return new ResponseEntity<CustomerListResource>(res, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerResource> createCustomer(
            @RequestBody CustomerResource sentCustomer
    ) throws CustomerExistsException {
        Customer customer = customerService.createCustomer(sentCustomer.toCustomer());
        CustomerResource res = new CustomerResourceAsm().toResource(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(res.getLink("self").getHref()));
        return new ResponseEntity<CustomerResource>(res, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerResource> updateCustomer(
            @PathVariable Long customerId, @RequestBody CustomerResource sentCustomer
    ) throws CustomerExistsException {
        Customer updatedCustomer = customerService.updateCustomer(customerId, sentCustomer.toCustomer());
        if(updatedCustomer != null) {
            CustomerResource res = new CustomerResourceAsm().toResource(updatedCustomer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.DELETE)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerResource> deleteCustomer(
            @PathVariable Long customerId
    ) {
        Customer customer = customerService.deleteCustomer(customerId);
        if(customer != null) {
            CustomerResource res = new CustomerResourceAsm().toResource(customer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }
}
