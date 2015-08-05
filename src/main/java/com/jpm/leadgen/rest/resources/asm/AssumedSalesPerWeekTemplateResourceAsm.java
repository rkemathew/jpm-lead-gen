package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.AssumedSalesPerWeekTemplate;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelTemplate;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.AssumedSalesPerWeekTemplateResource;
import com.jpm.leadgen.rest.resources.CustomerGoalResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class AssumedSalesPerWeekTemplateResourceAsm extends ResourceAssemblerSupport<AssumedSalesPerWeekTemplate, AssumedSalesPerWeekTemplateResource> {
    public AssumedSalesPerWeekTemplateResourceAsm() {
        super(ProposalSessionController.class, AssumedSalesPerWeekTemplateResource.class);
    }

    @Override
    public AssumedSalesPerWeekTemplateResource toResource(AssumedSalesPerWeekTemplate assumedSalesPerWeekTemplate) {
        AssumedSalesPerWeekTemplateResource res = new AssumedSalesPerWeekTemplateResource();
        res.setRid(assumedSalesPerWeekTemplate.getId());
        res.setColdCallingModelTemplate((new LeadGenerationModelTemplateResourceAsm().toResource(assumedSalesPerWeekTemplate.getColdCallingModelTemplate())));
        res.setInternetLeadsModelTemplate((new LeadGenerationModelTemplateResourceAsm().toResource(assumedSalesPerWeekTemplate.getInternetLeadsModelTemplate())));
        res.setReferralsModelTemplate((new LeadGenerationModelTemplateResourceAsm().toResource(assumedSalesPerWeekTemplate.getReferralsModelTemplate())));
        Link self = linkTo(ProposalSessionController.class).slash(assumedSalesPerWeekTemplate.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
