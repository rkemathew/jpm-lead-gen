package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.resources.CustomerResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class CustomerResourceAsm extends ResourceAssemblerSupport<Customer, CustomerResource> {
    public CustomerResourceAsm() {
        super(CustomerController.class, CustomerResource.class);
    }

    @Override
    public CustomerResource toResource(Customer customer) {
        CustomerResource res = new CustomerResource();
        res.setRid(customer.getId());
        res.setContactName(customer.getContactName());
        res.setCompanyName(customer.getCompanyName());
        Link self = linkTo(CustomerController.class).slash(customer.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
