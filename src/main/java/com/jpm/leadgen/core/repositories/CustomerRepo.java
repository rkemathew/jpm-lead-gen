package com.jpm.leadgen.core.repositories;

import com.jpm.leadgen.core.models.entities.Customer;

import java.util.List;

/**
 * Created by Ronnie on 6/11/15.
 */
public interface CustomerRepo {
    public List<Customer> findAllCustomers();
    public Customer findCustomer(Long id);
    public Customer createCustomer(Customer data);
    public Customer updateCustomer(Long id, Customer data);
    public Customer deleteCustomer(Long id);
}
