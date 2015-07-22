package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.CustomerGoalResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class CustomerGoalResourceAsm extends ResourceAssemblerSupport<CustomerGoal, CustomerGoalResource> {
    public CustomerGoalResourceAsm() {
        super(ProposalSessionController.class, CustomerGoalResource.class);
    }

    @Override
    public CustomerGoalResource toResource(CustomerGoal customerGoal) {
        CustomerGoalResource res = new CustomerGoalResource();
        res.setRid(customerGoal.getId());
        res.setCustomer(new CustomerResourceAsm().toResource(customerGoal.getCustomer()));
        res.setCurrentValuation(customerGoal.getCurrentValuation());
        res.setRevenueGoalYear1(customerGoal.getRevenueGoalYear1());
        res.setRevenueGoalYear2(customerGoal.getRevenueGoalYear2());
        res.setRevenueGoalYear3(customerGoal.getRevenueGoalYear3());
        res.setRevenueGoalYear4(customerGoal.getRevenueGoalYear4());
        res.setRevenueGoalYear5(customerGoal.getRevenueGoalYear5());
        res.setUpfrontFees(customerGoal.getUpfrontFees());
        res.setLagTime(customerGoal.getLagTime());
        Link self = linkTo(CustomerController.class).slash(customerGoal.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
