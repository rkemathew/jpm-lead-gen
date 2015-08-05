package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.AssumedSalesPerWeekTemplate;
import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelTemplate;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Super User on 6/11/2015.
 */
public class AssumedSalesPerWeekTemplateResource extends ResourceSupport {
    private Long rid;
    private LeadGenerationModelTemplateResource coldCallingModelTemplate;
    private LeadGenerationModelTemplateResource internetLeadsModelTemplate;
    private LeadGenerationModelTemplateResource referralsModelTemplate;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public LeadGenerationModelTemplateResource getColdCallingModelTemplate() {
        return coldCallingModelTemplate;
    }

    public void setColdCallingModelTemplate(LeadGenerationModelTemplateResource coldCallingModelTemplate) {
        this.coldCallingModelTemplate = coldCallingModelTemplate;
    }

    public LeadGenerationModelTemplateResource getInternetLeadsModelTemplate() {
        return internetLeadsModelTemplate;
    }

    public void setInternetLeadsModelTemplate(LeadGenerationModelTemplateResource internetLeadsModelTemplate) {
        this.internetLeadsModelTemplate = internetLeadsModelTemplate;
    }

    public LeadGenerationModelTemplateResource getReferralsModelTemplate() {
        return referralsModelTemplate;
    }

    public void setReferralsModelTemplate(LeadGenerationModelTemplateResource referralsModelTemplate) {
        this.referralsModelTemplate = referralsModelTemplate;
    }

    public AssumedSalesPerWeekTemplate toAssumedSalesPerWeekTemplate() {
        AssumedSalesPerWeekTemplate assumedSalesPerWeekTemplate = new AssumedSalesPerWeekTemplate();
        assumedSalesPerWeekTemplate.setColdCallingModelTemplate(coldCallingModelTemplate.toLeadGenerationModelTemplate());
        assumedSalesPerWeekTemplate.setInternetLeadsModelTemplate(internetLeadsModelTemplate.toLeadGenerationModelTemplate());
        assumedSalesPerWeekTemplate.setReferralsModelTemplate(referralsModelTemplate.toLeadGenerationModelTemplate());
        return assumedSalesPerWeekTemplate;
    }
}
