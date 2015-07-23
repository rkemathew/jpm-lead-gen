package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import com.jpm.leadgen.core.services.util.CustomerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Ronnie on 6/11/15.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public CustomerList findAllCustomers() {
        return new CustomerList(customerRepo.findAllCustomers());
    }

    @Override
    public Customer findCustomer(Long id) {
        return customerRepo.findCustomer(id);
    }

    @Override
    public CustomerList findCustomersLike(String companyName) {
        return new CustomerList(customerRepo.findCustomersByCompanyName(companyName));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        List<Customer> customerList = customerRepo.findCustomersByCompanyName(customer.getCompanyName());
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            Customer customerFromList = iterator.next();
            if (customerFromList.getCompanyName().equals(customer.getCompanyName())) {
                throw new CustomerExistsException("Customer with Company Name '" + customer.getCompanyName() + "' already exists", customerFromList);
            }
        }

        return customerRepo.createCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return customerRepo.updateCustomer(id, customer);
    }

    @Override
    public Customer deleteCustomer(Long id) {
        return customerRepo.deleteCustomer(id);
    }
}
