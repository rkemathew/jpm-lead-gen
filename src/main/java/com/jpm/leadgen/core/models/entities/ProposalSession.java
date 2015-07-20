package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Super User on 6/11/2015.
 */
@Entity
public class ProposalSession {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private CustomerGoal customerGoal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerGoal getCustomerGoal() {
        return customerGoal;
    }

    public void setCustomerGoal(CustomerGoal customerGoal) {
        this.customerGoal = customerGoal;
    }

    public boolean shallowEquals(Object other) {
        if (this == other) return true;

        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }

        ProposalSession proposalSession = (ProposalSession) other;

        return this.customerGoal.shallowEquals(proposalSession.customerGoal);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;

        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }

        ProposalSession proposalSession = (ProposalSession) other;
        return (this.id == proposalSession.id) && shallowEquals(other);
    }

    @Override
    public int hashCode() {
        int retVal = 0;

        retVal = retVal + id.intValue();
        retVal = retVal + customerGoal.hashCode();

        return retVal;
    }
}
