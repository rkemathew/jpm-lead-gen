package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.services.util.CustomerList;

/**
 * Created by Ronnie on 7/17/15.
 */
public interface ProposalSessionService {
/*
    public CustomerList findAllCustomers();
    public Customer findCustomer(Long id);
    public Customer findCustomerByCompanyName(String companyName);
*/
    public ProposalSession createProposalSession(ProposalSession proposalSession);
    public ProposalSession updateProposalSession(Long id, ProposalSession proposalSession);
//    public Customer deleteCustomer(Long id);
}
