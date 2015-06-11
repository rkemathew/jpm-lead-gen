package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chris on 7/10/14.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer findCustomer(Long id) {
        return customerRepo.findCustomer(id);
    }

    @Override
    public Customer deleteCustomer(Long id) {
        return customerRepo.deleteCustomer(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer data) {
        return customerRepo.updateCustomer(id, data);
    }

    @Override
    public List<Customer> findAllCustomers() { return customerRepo.findAllCustomers(); }
}
