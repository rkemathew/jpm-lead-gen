package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.repositories.CustomerGoalRepo;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.repositories.ProposalSessionRepo;
import com.jpm.leadgen.core.services.ProposalSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ronnie on 6/11/15.
 */
@Service
@Transactional
public class ProposalSessionServiceImpl implements ProposalSessionService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerGoalRepo customerGoalRepo;
    @Autowired
    private ProposalSessionRepo proposalSessionRepo;

    @Override
    public ProposalSession createProposalSession(ProposalSession proposalSessionDTO) {
        CustomerGoal customerGoalDTO = proposalSessionDTO.getCustomerGoal();
        Customer customer = customerRepo.findCustomer(customerGoalDTO.getCustomer().getId());

        customerGoalDTO.setCustomer(customer);
        CustomerGoal customerGoal = customerGoalRepo.createCustomerGoal(customerGoalDTO);

        proposalSessionDTO.setCustomerGoal(customerGoal);
        return proposalSessionRepo.createProposalSession(proposalSessionDTO);
    }

    @Override
    public ProposalSession updateProposalSession(Long id, ProposalSession proposalSession) {
        return null;
    }
}
