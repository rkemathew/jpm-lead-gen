package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;

/**
 * Created by Ronnie on 7/17/15.
 */
public interface ProposalSessionService {
    public ProposalSession findProposalSession(Long id);
    public ProposalSession createProposalSession(ProposalSession proposalSession);
    public ProposalSession updateProposalSession(Long id, ProposalSession proposalSession) throws Exception;
    public CustomerGoal findCustomerGoal(Long id);
}
