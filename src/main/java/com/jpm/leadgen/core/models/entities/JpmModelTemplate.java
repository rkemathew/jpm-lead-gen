package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by rmathew on 7/31/2015.
 */
@Entity
public class JpmModelTemplate {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private AssumedSalesPerWeekTemplate assumedSalesPerWeekTemplate;
    @OneToOne
    private InvestmentAndExpensesTemplate investmentAndExpensesTemplate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssumedSalesPerWeekTemplate getAssumedSalesPerWeekTemplate() {
        return assumedSalesPerWeekTemplate;
    }

    public void setAssumedSalesPerWeekTemplate(AssumedSalesPerWeekTemplate assumedSalesPerWeekTemplate) {
        this.assumedSalesPerWeekTemplate = assumedSalesPerWeekTemplate;
    }

    public InvestmentAndExpensesTemplate getInvestmentAndExpensesTemplate() {
        return investmentAndExpensesTemplate;
    }

    public void setInvestmentAndExpensesTemplate(InvestmentAndExpensesTemplate investmentAndExpensesTemplate) {
        this.investmentAndExpensesTemplate = investmentAndExpensesTemplate;
    }
}
