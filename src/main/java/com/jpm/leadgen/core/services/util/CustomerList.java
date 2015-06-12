package com.jpm.leadgen.core.services.util;

import com.jpm.leadgen.core.models.entities.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ronnie on 6/11/15.
 */
public class CustomerList {
    private List<Customer> customers = new ArrayList<Customer>();
    private Long customerId;

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
