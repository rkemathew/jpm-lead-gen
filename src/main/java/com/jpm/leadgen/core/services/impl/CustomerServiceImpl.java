package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.util.CustomerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

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
        return new CustomerList((ArrayList<Customer>)customerRepo.findAllCustomers());
    }

    @Override
    public Customer findCustomer(Long id) {
        return customerRepo.findCustomer(id);
    }

    @Override
    public Customer createCustomer(Customer data) {
        return customerRepo.createCustomer(data);
    }

    @Override
    public Customer updateCustomer(Long id, Customer data) {
        return customerRepo.updateCustomer(id, data);
    }

    @Override
    public Customer deleteCustomer(Long id) {
        return customerRepo.deleteCustomer(id);
    }
}
