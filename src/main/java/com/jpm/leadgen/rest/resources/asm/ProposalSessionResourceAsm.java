package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.ProposalSession;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.ProposalSessionResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class ProposalSessionResourceAsm extends ResourceAssemblerSupport<ProposalSession, ProposalSessionResource> {
    public ProposalSessionResourceAsm() {
        super(ProposalSessionController.class, ProposalSessionResource.class);
    }

    @Override
    public ProposalSessionResource toResource(ProposalSession proposalSession) {
        ProposalSessionResource res = new ProposalSessionResource();
        res.setRid(proposalSession.getId());
        res.setCustomerGoal(new CustomerGoalResourceAsm().toResource(proposalSession.getCustomerGoal()));
        Link self = linkTo(ProposalSessionController.class).slash(proposalSession.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
