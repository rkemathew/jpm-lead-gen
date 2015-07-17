package com.jpm.leadgen.core.repositories.jpa;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import com.jpm.leadgen.core.repositories.ProposalSessionRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Chris on 7/10/14.
 */
@Repository
public class JpaProposalSessionRepo implements ProposalSessionRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public ProposalSession createProposalSession(ProposalSession data) {
        em.persist(data);
        return data;
    }

    @Override
    public ProposalSession updateProposalSession(Long id, ProposalSession data) {
        ProposalSession proposalSession = em.find(ProposalSession.class, id);
        proposalSession.setCustomerGoal(data.getCustomerGoal());
        return proposalSession;
    }
}
