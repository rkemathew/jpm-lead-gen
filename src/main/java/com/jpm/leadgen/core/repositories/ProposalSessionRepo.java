package com.jpm.leadgen.core.repositories;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;

import java.util.List;

/**
 * Created by Ronnie on 6/11/15.
 */
public interface ProposalSessionRepo {
    public ProposalSession findProposalSession(Long id);
    public ProposalSession createProposalSession(ProposalSession data);
    public ProposalSession updateProposalSession(Long id, ProposalSession data) throws Exception;
    public CustomerGoal findCustomerGoal(Long id);
}
