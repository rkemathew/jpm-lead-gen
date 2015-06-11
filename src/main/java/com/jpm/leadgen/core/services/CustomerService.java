package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.services.util.CustomerList;

import java.util.List;

/**
 * Created by Chris on 6/27/14.
 */
public interface CustomerService {
    public Customer findCustomer(Long id); // Returns the Customer or null if it can't be found
    public Customer deleteCustomer(Long id); // Deletes the found Customer or returns null if it can't be found

    /**
     * @param id the id of the Customer to updateCustomer
     * @param data the Customer containing the data to be used for the updateCustomer
     * @return the updated Customer or null if the Customer with the id cannot be found
     */
    public Customer updateCustomer(Long id, Customer data);
    public List<Customer> findAllCustomers();
}
