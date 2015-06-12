package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.util.CustomerList;

/**
 * Created by Chris on 6/27/14.
 */
public interface CustomerService {
    public CustomerList findAllCustomers();
    public Customer findCustomer(Long id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Long id, Customer customer);
    public Customer deleteCustomer(Long id);
}
