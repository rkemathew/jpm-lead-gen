package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.JpmModel;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.JpmModelResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class JpmModelResourceAsm extends ResourceAssemblerSupport<JpmModel, JpmModelResource> {
    public JpmModelResourceAsm() {
        super(ProposalSessionController.class, JpmModelResource.class);
    }

    @Override
    public JpmModelResource toResource(JpmModel jpmModel) {
        JpmModelResource res = new JpmModelResource();
        res.setRid(jpmModel.getId());
        res.setJpmModelTemplate(new JpmModelTemplateResourceAsm().toResource(jpmModel.getJpmModelTemplate()));
        res.setLeadGenerationModelType(jpmModel.getLeadGenerationModel());
        Link self = linkTo(CustomerController.class).slash(jpmModel.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
