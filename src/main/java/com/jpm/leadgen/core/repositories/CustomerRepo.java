package com.jpm.leadgen.core.repositories;

import com.jpm.leadgen.core.models.entities.BlogEntry;
import com.jpm.leadgen.core.models.entities.Customer;

import java.util.List;

/**
 * Created by Chris on 7/10/14.
 */
public interface CustomerRepo {
    public Customer findCustomer(Long id); // Returns the Customer or null if it can't be found
    public Customer deleteCustomer(Long id); // Deletes the found Customer or returns null if it can't be found

    /**
     * @param id the id of the Customer to updateCustomer
     * @param data the Customer containing the data to be used for the updateCustomer
     * @return the updated Customer or null if the Customer with the id cannot be found
     */
    public Customer updateCustomer(Long id, Customer data);

    public Customer createCustomer(Customer data);

    public List<Customer> findByCustomerId(Long customerId);

    public List<Customer> findAllCustomers();
}
