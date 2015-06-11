package com.jpm.leadgen.core.services.util;

import com.jpm.leadgen.core.models.entities.BlogEntry;
import com.jpm.leadgen.core.models.entities.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 6/28/14.
 */
public class CustomerList {
    private List<Customer> customers = new ArrayList<Customer>();
    private Long customerId;

    public CustomerList(Long customerId, List<Customer> customers) {
        this.customerId = customerId;
        this.customers = customers;
    }

    public CustomerList(ArrayList<Customer> customers) {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
