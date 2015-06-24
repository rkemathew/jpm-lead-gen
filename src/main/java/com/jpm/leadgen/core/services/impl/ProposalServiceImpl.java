package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.services.CustomerService;
import com.jpm.leadgen.core.services.ProposalService;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import com.jpm.leadgen.core.services.util.CustomerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ronnie on 6/11/15.
 */
@Service
@Transactional
public class ProposalServiceImpl implements ProposalService {
    @Override
    public CustomerList findAllCustomers() {
        return null;
    }

    @Override
    public Customer findCustomer(Long id) {
        return null;
    }

    @Override
    public Customer findCustomerByCompanyName(String companyName) {
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public Customer deleteCustomer(Long id) {
        return null;
    }
}
