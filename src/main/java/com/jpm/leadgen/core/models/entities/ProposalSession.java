package com.jpm.leadgen.core.models.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Super User on 6/11/2015.
 */
//@Entity
public class ProposalSession {
    @Id @GeneratedValue
    private Long id;
    private CustomerGoal customerGoal;
}
