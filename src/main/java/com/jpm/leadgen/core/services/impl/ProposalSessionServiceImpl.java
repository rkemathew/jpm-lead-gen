package com.jpm.leadgen.core.services.impl;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.repositories.CustomerGoalRepo;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.repositories.ProposalSessionRepo;
import com.jpm.leadgen.core.services.ProposalSessionService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    public ProposalSession updateProposalSession(Long proposalSessionId, ProposalSession proposalSessionDTO) {
        ProposalSession proposalSession = proposalSessionRepo.findProposalSession(proposalSessionId);
        ProposalSession proposalSessionPristine = null;

        try {
            proposalSessionPristine = (ProposalSession) BeanUtils.cloneBean(proposalSession);
        } catch(Exception e) {
            //TODO: RKEM: Need to handle this exception
        }

        updateCustomerGoalIfChanged(proposalSession, proposalSessionDTO);

        if (!proposalSession.shallowEquals(proposalSessionPristine)) {
            proposalSession = proposalSessionRepo.updateProposalSession(proposalSessionId, proposalSession);
        }

        return proposalSession;
    }

    protected void updateCustomerGoalIfChanged(ProposalSession proposalSession, ProposalSession proposalSessionDTO) {
        CustomerGoal customerGoal = proposalSession.getCustomerGoal();
        CustomerGoal customerGoalDTO = proposalSessionDTO.getCustomerGoal();

        if (!customerGoal.shallowEquals(customerGoalDTO)) {
            try {
                long customerGoalId = customerGoal.getId();
                BeanUtils.copyProperties(customerGoal, customerGoalDTO);
                customerGoal.setId(customerGoalId);
            } catch(Exception e) {
                // TODO: RKEM: Need to handle this exception
            }

            Customer customer = customerRepo.findCustomer(customerGoal.getCustomer().getId());
            customerGoal.setCustomer(customer);
        }
    }
}
