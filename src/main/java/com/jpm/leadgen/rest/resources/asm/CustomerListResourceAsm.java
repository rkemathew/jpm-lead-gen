package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.services.util.CustomerList;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.resources.CustomerListResource;
import com.jpm.leadgen.rest.resources.CustomerResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Chris on 6/28/14.
 */
public class CustomerListResourceAsm extends ResourceAssemblerSupport<CustomerList, CustomerListResource> {
    public CustomerListResourceAsm() {
        super(CustomerController.class, CustomerListResource.class);
    }

    @Override
    public CustomerListResource toResource(CustomerList list) {
        List<CustomerResource> resources = new CustomerResourceAsm().toResources(list.getCustomers());
        CustomerListResource listResource = new CustomerListResource();
        listResource.setCustomers(resources);
        listResource.add(linkTo(methodOn(CustomerController.class).findAllCustomers()).withSelfRel());
        return listResource;
    }
}
