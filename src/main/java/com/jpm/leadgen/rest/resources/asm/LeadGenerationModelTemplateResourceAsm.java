package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelTemplate;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.CustomerGoalResource;
import com.jpm.leadgen.rest.resources.LeadGenerationModelTemplateResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class LeadGenerationModelTemplateResourceAsm extends ResourceAssemblerSupport<LeadGenerationModelTemplate, LeadGenerationModelTemplateResource> {
    public LeadGenerationModelTemplateResourceAsm() {
        super(ProposalSessionController.class, LeadGenerationModelTemplateResource.class);
    }

    @Override
    public LeadGenerationModelTemplateResource toResource(LeadGenerationModelTemplate leadGenerationModelTemplate) {
        LeadGenerationModelTemplateResource res = new LeadGenerationModelTemplateResource();
        res.setRid(leadGenerationModelTemplate.getId());
        res.setCallsPerWeek(leadGenerationModelTemplate.getCallsPerWeek());
        res.setPctConversations(leadGenerationModelTemplate.getPctConversations());
        res.setPctApptConversions(leadGenerationModelTemplate.getPctApptConversions());
        res.setPctShowRatio(leadGenerationModelTemplate.getPctShowRatio());
        res.setPctOrderCommitments(leadGenerationModelTemplate.getPctOrderCommitments());
        res.setPctFinalSales(leadGenerationModelTemplate.getPctFinalSales());
        res.setCostToGenerateLead(leadGenerationModelTemplate.getCostToGenerateLead());
        res.setRetentionRate(leadGenerationModelTemplate.getRetentionRate());
        res.setLeadGenerationModelType(leadGenerationModelTemplate.getLeadGenerationModelType());
        Link self = linkTo(CustomerController.class).slash(leadGenerationModelTemplate.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
