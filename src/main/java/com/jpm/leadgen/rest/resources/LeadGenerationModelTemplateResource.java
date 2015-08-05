package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelTemplate;
import com.jpm.leadgen.core.models.entities.LeadGenerationModelType;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Created by Super User on 6/11/2015.
 */
public class LeadGenerationModelTemplateResource extends ResourceSupport {
    private Long rid;
    private int callsPerWeek;
    private BigDecimal pctConversations;
    private BigDecimal pctApptConversions;
    private BigDecimal pctShowRatio;
    private BigDecimal pctOrderCommitments;
    private BigDecimal pctFinalSales;
    private BigDecimal costToGenerateLead;
    private BigDecimal retentionRate;
    private LeadGenerationModelType leadGenerationModelType;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public int getCallsPerWeek() {
        return callsPerWeek;
    }

    public void setCallsPerWeek(int callsPerWeek) {
        this.callsPerWeek = callsPerWeek;
    }

    public BigDecimal getPctConversations() {
        return pctConversations;
    }

    public void setPctConversations(BigDecimal pctConversations) {
        this.pctConversations = pctConversations;
    }

    public BigDecimal getPctApptConversions() {
        return pctApptConversions;
    }

    public void setPctApptConversions(BigDecimal pctApptConversions) {
        this.pctApptConversions = pctApptConversions;
    }

    public BigDecimal getPctShowRatio() {
        return pctShowRatio;
    }

    public void setPctShowRatio(BigDecimal pctShowRatio) {
        this.pctShowRatio = pctShowRatio;
    }

    public BigDecimal getPctOrderCommitments() {
        return pctOrderCommitments;
    }

    public void setPctOrderCommitments(BigDecimal pctOrderCommitments) {
        this.pctOrderCommitments = pctOrderCommitments;
    }

    public BigDecimal getPctFinalSales() {
        return pctFinalSales;
    }

    public void setPctFinalSales(BigDecimal pctFinalSales) {
        this.pctFinalSales = pctFinalSales;
    }

    public BigDecimal getCostToGenerateLead() {
        return costToGenerateLead;
    }

    public void setCostToGenerateLead(BigDecimal costToGenerateLead) {
        this.costToGenerateLead = costToGenerateLead;
    }

    public BigDecimal getRetentionRate() {
        return retentionRate;
    }

    public void setRetentionRate(BigDecimal retentionRate) {
        this.retentionRate = retentionRate;
    }

    public LeadGenerationModelType getLeadGenerationModelType() {
        return leadGenerationModelType;
    }

    public void setLeadGenerationModelType(LeadGenerationModelType leadGenerationModelType) {
        this.leadGenerationModelType = leadGenerationModelType;
    }

    public LeadGenerationModelTemplate toLeadGenerationModelTemplate() {
        LeadGenerationModelTemplate leadGenerationModelTemplate = new LeadGenerationModelTemplate();
        leadGenerationModelTemplate.setCallsPerWeek(callsPerWeek);
        leadGenerationModelTemplate.setPctConversations(pctConversations);
        leadGenerationModelTemplate.setPctApptConversions(pctApptConversions);
        leadGenerationModelTemplate.setPctShowRatio(pctShowRatio);
        leadGenerationModelTemplate.setPctOrderCommitments(pctOrderCommitments);
        leadGenerationModelTemplate.setPctFinalSales(pctFinalSales);
        leadGenerationModelTemplate.setCostToGenerateLead(costToGenerateLead);
        leadGenerationModelTemplate.setRetentionRate(retentionRate);
        leadGenerationModelTemplate.setLeadGenerationModelType(leadGenerationModelType);
        return leadGenerationModelTemplate;
    }
}
