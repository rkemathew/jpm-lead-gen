package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.JpmModelTemplate;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Created by Super User on 6/11/2015.
 */
public class JpmModelTemplateResource extends ResourceSupport {
    private Long rid;
    private AssumedSalesPerWeekTemplateResource assumedSalesPerWeekTemplate;
    private InvestmentAndExpensesTemplateResource investmentAndExpensesTemplate;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public AssumedSalesPerWeekTemplateResource getAssumedSalesPerWeekTemplate() {
        return assumedSalesPerWeekTemplate;
    }

    public void setAssumedSalesPerWeekTemplate(AssumedSalesPerWeekTemplateResource assumedSalesPerWeekTemplate) {
        this.assumedSalesPerWeekTemplate = assumedSalesPerWeekTemplate;
    }

    public InvestmentAndExpensesTemplateResource getInvestmentAndExpensesTemplate() {
        return investmentAndExpensesTemplate;
    }

    public void setInvestmentAndExpensesTemplate(InvestmentAndExpensesTemplateResource investmentAndExpensesTemplate) {
        this.investmentAndExpensesTemplate = investmentAndExpensesTemplate;
    }

    public JpmModelTemplate toJpmModelTemplate() {
        JpmModelTemplate jpmModelTemplate = new JpmModelTemplate();

        if (assumedSalesPerWeekTemplate != null)
            jpmModelTemplate.setAssumedSalesPerWeekTemplate(assumedSalesPerWeekTemplate.toAssumedSalesPerWeekTemplate());

        if (investmentAndExpensesTemplate != null)
            jpmModelTemplate.setInvestmentAndExpensesTemplate(investmentAndExpensesTemplate.toInvestmentAndExpensesTemplate());

        return jpmModelTemplate;
    }
}
