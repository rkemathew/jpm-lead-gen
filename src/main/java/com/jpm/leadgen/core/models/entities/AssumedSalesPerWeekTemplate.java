package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by rmathew on 7/31/2015.
 */
@Entity
public class AssumedSalesPerWeekTemplate {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private LeadGenerationModelTemplate coldCallingModelTemplate;
    @OneToOne
    private LeadGenerationModelTemplate internetLeadsModelTemplate;
    @OneToOne
    private LeadGenerationModelTemplate referralsModelTemplate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LeadGenerationModelTemplate getColdCallingModelTemplate() {
        return coldCallingModelTemplate;
    }

    public void setColdCallingModelTemplate(LeadGenerationModelTemplate coldCallingModelTemplate) {
        coldCallingModelTemplate.setLeadGenerationModelType(LeadGenerationModelType.COLD_CALLING);
        this.coldCallingModelTemplate = coldCallingModelTemplate;
    }

    public LeadGenerationModelTemplate getInternetLeadsModelTemplate() {
        return internetLeadsModelTemplate;
    }

    public void setInternetLeadsModelTemplate(LeadGenerationModelTemplate internetLeadsModelTemplate) {
        coldCallingModelTemplate.setLeadGenerationModelType(LeadGenerationModelType.INTERNET_GENERATED);
        this.internetLeadsModelTemplate = internetLeadsModelTemplate;
    }

    public LeadGenerationModelTemplate getReferralsModelTemplate() {
        return referralsModelTemplate;
    }

    public void setReferralsModelTemplate(LeadGenerationModelTemplate referralsModelTemplate) {
        coldCallingModelTemplate.setLeadGenerationModelType(LeadGenerationModelType.REFERRALS);
        this.referralsModelTemplate = referralsModelTemplate;
    }
}
