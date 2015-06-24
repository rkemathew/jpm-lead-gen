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
}
