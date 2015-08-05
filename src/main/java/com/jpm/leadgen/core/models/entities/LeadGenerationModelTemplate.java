package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by rmathew on 7/31/2015.
 */
@Entity
public class LeadGenerationModelTemplate {
    @Id @GeneratedValue
    private Long id;
    private int callsPerWeek;
    private BigDecimal pctConversations;
    private BigDecimal pctApptConversions;
    private BigDecimal pctShowRatio;
    private BigDecimal pctOrderCommitments;
    private BigDecimal pctFinalSales;
    private BigDecimal costToGenerateLead;
    private BigDecimal retentionRate;
    private LeadGenerationModelType leadGenerationModelType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
