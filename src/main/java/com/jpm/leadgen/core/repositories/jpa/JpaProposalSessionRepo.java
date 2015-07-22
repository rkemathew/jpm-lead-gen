package com.jpm.leadgen.core.repositories.jpa;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.repositories.ProposalSessionRepo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Ronnie on 7/20/15.
 */
@Repository
public class JpaProposalSessionRepo implements ProposalSessionRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public ProposalSession findProposalSession(Long id) {
        return em.find(ProposalSession.class, id);
    }

    @Override
    public ProposalSession createProposalSession(ProposalSession data) {
        em.persist(data);
        return data;
    }

    @Override
    public ProposalSession updateProposalSession(Long id, ProposalSession data) throws Exception {
        ProposalSession proposalSession = em.find(ProposalSession.class, id);
        BeanUtils.copyProperties(proposalSession, data);
        return proposalSession;
    }

    @Override
    public CustomerGoal findCustomerGoal(Long id) {
        return em.find(CustomerGoal.class, id);
    }
}
