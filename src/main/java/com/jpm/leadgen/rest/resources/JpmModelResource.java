package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.JpmModel;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelType;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Super User on 6/11/2015.
 */
public class JpmModelResource extends ResourceSupport {
    private Long rid;
    private JpmModelTemplateResource jpmModelTemplate;
    private LeadGenerationModelType leadGenerationModelType;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public JpmModelTemplateResource getJpmModelTemplate() {
        return jpmModelTemplate;
    }

    public void setJpmModelTemplate(JpmModelTemplateResource jpmModelTemplate) {
        this.jpmModelTemplate = jpmModelTemplate;
    }

    public LeadGenerationModelType getLeadGenerationModelType() {
        return leadGenerationModelType;
    }

    public void setLeadGenerationModelType(LeadGenerationModelType leadGenerationModelType) {
        this.leadGenerationModelType = leadGenerationModelType;
    }

    public JpmModel toJpmModel() {
        JpmModel jpmModel = new JpmModel();
        jpmModel.setJpmModelTemplate(jpmModelTemplate.toJpmModelTemplate());
        jpmModel.setLeadGenerationModel(leadGenerationModelType);
        return jpmModel;
    }
}
