package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.InvestmentAndExpensesTemplate;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Created by Super User on 6/11/2015.
 */
public class InvestmentAndExpensesTemplateResource extends ResourceSupport {
    private Long rid;
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

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
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

    public InvestmentAndExpensesTemplate toInvestmentAndExpensesTemplate() {
        InvestmentAndExpensesTemplate investmentAndExpensesTemplate = new InvestmentAndExpensesTemplate();
        investmentAndExpensesTemplate.setRecruitingCost(recruitingCost);
        investmentAndExpensesTemplate.setAdminSalary(adminSalary);
        investmentAndExpensesTemplate.setTempOfficeSpaceRent(tempOfficeSpaceRent);
        investmentAndExpensesTemplate.setTrainPresToolsAnnualCost(trainPresToolsAnnualCost);
        investmentAndExpensesTemplate.setMiddleMgmtComp(middleMgmtComp);
        investmentAndExpensesTemplate.setIncentiveBonus(incentiveBonus);
        investmentAndExpensesTemplate.setSalesPersonInvestment(salesPersonInvestment);
        investmentAndExpensesTemplate.setSelfEmpTaxSSMedDisab(selfEmpTaxSSMedDisab);
        investmentAndExpensesTemplate.setTravel(travel);
        investmentAndExpensesTemplate.setUtilities(utilities);
        investmentAndExpensesTemplate.setBenefits(benefits);
        investmentAndExpensesTemplate.setBusinessIns(businessIns);
        investmentAndExpensesTemplate.setAutoExpense(autoExpense);
        return investmentAndExpensesTemplate;
    }
}
