package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Super User on 6/11/2015.
 */
@Entity
public class JpmModel {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private JpmModelTemplate jpmModelTemplate;
    private LeadGenerationModelType leadGenerationModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JpmModelTemplate getJpmModelTemplate() {
        return jpmModelTemplate;
    }

    public void setJpmModelTemplate(JpmModelTemplate jpmModelTemplate) {
        this.jpmModelTemplate = jpmModelTemplate;
    }

    public LeadGenerationModelType getLeadGenerationModel() {
        return leadGenerationModel;
    }

    public void setLeadGenerationModel(LeadGenerationModelType leadGenerationModel) {
        this.leadGenerationModel = leadGenerationModel;
    }
}
