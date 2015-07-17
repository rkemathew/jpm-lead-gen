package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Super User on 6/11/2015.
 */
public class ProposalSessionResource extends ResourceSupport {
    private Long rid;
    private CustomerGoalResource customerGoal;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public CustomerGoalResource getCustomerGoal() {
        return customerGoal;
    }

    public void setCustomerGoal(CustomerGoalResource customerGoal) {
        this.customerGoal = customerGoal;
    }

    public ProposalSession toProposalSession() {
        ProposalSession proposalSession = new ProposalSession();
        proposalSession.setCustomerGoal(customerGoal.toCustomerGoal());
        return proposalSession;
    }
}
