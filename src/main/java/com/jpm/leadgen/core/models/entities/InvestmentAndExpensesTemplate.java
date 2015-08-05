package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by rmathew on 7/31/2015.
 */
@Entity
public class InvestmentAndExpensesTemplate {
    @Id @GeneratedValue
    private Long id;
    private BigDecimal recruitingCost;
    private BigDecimal adminSalary;
    private BigDecimal tempOfficeSpaceRent;
    private BigDecimal trainPresToolsAnnualCost;
    private BigDecimal middleMgmtComp;
    private BigDecimal incentiveBonus;
    private BigDecimal salesPersonInvestment;
    private BigDecimal selfEmpTaxSSMedDisab;
    private BigDecimal travel;
    private BigDecimal utilities;
    private BigDecimal benefits;
    private BigDecimal businessIns;
    private BigDecimal autoExpense;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getRecruitingCost() {
        return recruitingCost;
    }

    public void setRecruitingCost(BigDecimal recruitingCost) {
        this.recruitingCost = recruitingCost;
    }

    public BigDecimal getAdminSalary() {
        return adminSalary;
    }

    public void setAdminSalary(BigDecimal adminSalary) {
        this.adminSalary = adminSalary;
    }

    public BigDecimal getTempOfficeSpaceRent() {
        return tempOfficeSpaceRent;
    }

    public void setTempOfficeSpaceRent(BigDecimal tempOfficeSpaceRent) {
        this.tempOfficeSpaceRent = tempOfficeSpaceRent;
    }

    public BigDecimal getTrainPresToolsAnnualCost() {
        return trainPresToolsAnnualCost;
    }

    public void setTrainPresToolsAnnualCost(BigDecimal trainPresToolsAnnualCost) {
        this.trainPresToolsAnnualCost = trainPresToolsAnnualCost;
    }

    public BigDecimal getMiddleMgmtComp() {
        return middleMgmtComp;
    }

    public void setMiddleMgmtComp(BigDecimal middleMgmtComp) {
        this.middleMgmtComp = middleMgmtComp;
    }

    public BigDecimal getIncentiveBonus() {
        return incentiveBonus;
    }

    public void setIncentiveBonus(BigDecimal incentiveBonus) {
        this.incentiveBonus = incentiveBonus;
    }

    public BigDecimal getSalesPersonInvestment() {
        return salesPersonInvestment;
    }

    public void setSalesPersonInvestment(BigDecimal salesPersonInvestment) {
        this.salesPersonInvestment = salesPersonInvestment;
    }

    public BigDecimal getSelfEmpTaxSSMedDisab() {
        return selfEmpTaxSSMedDisab;
    }

    public void setSelfEmpTaxSSMedDisab(BigDecimal selfEmpTaxSSMedDisab) {
        this.selfEmpTaxSSMedDisab = selfEmpTaxSSMedDisab;
    }

    public BigDecimal getTravel() {
        return travel;
    }

    public void setTravel(BigDecimal travel) {
        this.travel = travel;
    }

    public BigDecimal getUtilities() {
        return utilities;
    }

    public void setUtilities(BigDecimal utilities) {
        this.utilities = utilities;
    }

    public BigDecimal getBenefits() {
        return benefits;
    }

    public void setBenefits(BigDecimal benefits) {
        this.benefits = benefits;
    }

    public BigDecimal getBusinessIns() {
        return businessIns;
    }

    public void setBusinessIns(BigDecimal businessIns) {
        this.businessIns = businessIns;
    }

    public BigDecimal getAutoExpense() {
        return autoExpense;
    }

    public void setAutoExpense(BigDecimal autoExpense) {
        this.autoExpense = autoExpense;
    }
}
