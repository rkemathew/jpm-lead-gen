package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.JpmModelTemplate;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.JpmModelTemplateResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class JpmModelTemplateResourceAsm extends ResourceAssemblerSupport<JpmModelTemplate, JpmModelTemplateResource> {
    public JpmModelTemplateResourceAsm() {
        super(ProposalSessionController.class, JpmModelTemplateResource.class);
    }

    @Override
    public JpmModelTemplateResource toResource(JpmModelTemplate jpmModelTemplate) {
        JpmModelTemplateResource res = new JpmModelTemplateResource();
        res.setRid(jpmModelTemplate.getId());
        res.setAssumedSalesPerWeekTemplate(new AssumedSalesPerWeekTemplateResourceAsm().toResource(jpmModelTemplate.getAssumedSalesPerWeekTemplate()));
        res.setInvestmentAndExpensesTemplate(new InvestmentAndExpensesTemplateResourceAsm().toResource(jpmModelTemplate.getInvestmentAndExpensesTemplate()));
        Link self = linkTo(ProposalSessionController.class).slash(jpmModelTemplate.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
