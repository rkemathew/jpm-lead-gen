package com.jpm.leadgen.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 7/22/14.
 */
public class CustomerListResource extends ResourceSupport {
    private List<CustomerResource> customers = new ArrayList<CustomerResource>();

    public List<CustomerResource> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerResource> customers) {
        this.customers = customers;
    }
}
