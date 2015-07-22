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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
    public ProposalSession findProposalSession(Long id) {
        return proposalSessionRepo.findProposalSession(id);
    }

    @Override
    public ProposalSession createProposalSession(ProposalSession proposalSessionDTO) {
        CustomerGoal customerGoalDTO = proposalSessionDTO.getCustomerGoal();
        Customer customer = customerGoalDTO.getCustomer();

        CustomerGoal customerGoal = customerGoalRepo.createCustomerGoal(customerGoalDTO);

        Date today = new Date();
        proposalSessionDTO.setCustomerGoal(customerGoal);
        proposalSessionDTO.setCreatedBy("");
        proposalSessionDTO.setCreatedOn(today);
        proposalSessionDTO.setModifiedBy("");
        proposalSessionDTO.setModifiedOn(today);

        return proposalSessionRepo.createProposalSession(proposalSessionDTO);
    }

    @Override
    public ProposalSession updateProposalSession(Long proposalSessionId, ProposalSession proposalSessionDTO) throws Exception {
        ProposalSession proposalSession = proposalSessionRepo.findProposalSession(proposalSessionId);
        ProposalSession proposalSessionPristine = (ProposalSession) BeanUtils.cloneBean(proposalSession);

        updateCustomerGoalIfChanged(proposalSession, proposalSessionDTO);

        if (!proposalSession.shallowEquals(proposalSessionPristine)) {
            proposalSession.setModifiedBy("");
            proposalSession.setModifiedOn(new Date());
            proposalSession = proposalSessionRepo.updateProposalSession(proposalSessionId, proposalSession);
        }

        return proposalSession;
    }

    protected void updateCustomerGoalIfChanged(ProposalSession proposalSession, ProposalSession proposalSessionDTO) throws Exception {
        CustomerGoal customerGoal = proposalSession.getCustomerGoal();
        CustomerGoal customerGoalDTO = proposalSessionDTO.getCustomerGoal();

        if (!customerGoal.shallowEquals(customerGoalDTO)) {
            long customerGoalId = customerGoal.getId();
            BeanUtils.copyProperties(customerGoal, customerGoalDTO);
            customerGoal.setCustomer(customerGoalDTO.getCustomer());
            customerGoal.setId(customerGoalId);
        }
    }

    @Override
    public CustomerGoal findCustomerGoal(Long id) {
        return proposalSessionRepo.findCustomerGoal(id);
    }
}
