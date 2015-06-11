package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.Account;
import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.util.AccountList;
import com.jpm.leadgen.core.services.util.CustomerList;
import com.jpm.leadgen.rest.resources.AccountListResource;
import com.jpm.leadgen.rest.resources.CustomerListResource;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.asm.AccountListResourceAsm;
import com.jpm.leadgen.rest.resources.asm.CustomerListResourceAsm;
import com.jpm.leadgen.rest.resources.asm.CustomerResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chris on 6/5/14.
 */
@Controller
@RequestMapping("/rest/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public ResponseEntity<CustomerListResource> findAllCustomers() {
        List<Customer> list = customerService.findAllCustomers();
        CustomerList customerList = new CustomerList();

        CustomerListResource res = new CustomerListResourceAsm().toResource(list);
        return new ResponseEntity<CustomerListResource>(res, HttpStatus.OK);
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<CustomerResource> getCustomer(
            @PathVariable Long customerId
    ) {
        Customer customer = customerService.findCustomer(customerId);
        if(customer != null)
        {
            CustomerResource res = new CustomerResourceAsm().toResource(customer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.DELETE)
    public ResponseEntity<CustomerResource> deleteCustomer(
            @PathVariable Long customerId
    ) {
        Customer customer = customerService.deleteCustomer(customerId);
        if(customer != null)
        {
            CustomerResource res = new CustomerResourceAsm().toResource(customer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{customerId}", method = RequestMethod.PUT)
    public ResponseEntity<CustomerResource> updateCustomer(
            @PathVariable Long customerId, @RequestBody CustomerResource sentCustomer
    ) {
        Customer updatedCustomer = customerService.updateCustomer(customerId, sentCustomer.toCustomer());
        if(updatedCustomer != null)
        {
            CustomerResource res = new CustomerResourceAsm().toResource(updatedCustomer);
            return new ResponseEntity<CustomerResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<CustomerResource>(HttpStatus.NOT_FOUND);
        }
    }
}
