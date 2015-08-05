package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.models.entities.InvestmentAndExpensesTemplate;
import com.jpm.leadgen.rest.mvc.CustomerController;
import com.jpm.leadgen.rest.mvc.ProposalSessionController;
import com.jpm.leadgen.rest.resources.CustomerGoalResource;
import com.jpm.leadgen.rest.resources.InvestmentAndExpensesTemplateResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by Ronnie on 6/11/15.
 */
public class InvestmentAndExpensesTemplateResourceAsm extends ResourceAssemblerSupport<InvestmentAndExpensesTemplate, InvestmentAndExpensesTemplateResource> {
    public InvestmentAndExpensesTemplateResourceAsm() {
        super(ProposalSessionController.class, InvestmentAndExpensesTemplateResource.class);
    }

    @Override
    public InvestmentAndExpensesTemplateResource toResource(InvestmentAndExpensesTemplate investmentAndExpensesTemplate) {
        InvestmentAndExpensesTemplateResource res = new InvestmentAndExpensesTemplateResource();
        res.setRecruitingCost(investmentAndExpensesTemplate.getRecruitingCost());
        res.setAdminSalary(investmentAndExpensesTemplate.getAdminSalary());
        res.setTempOfficeSpaceRent(investmentAndExpensesTemplate.getTempOfficeSpaceRent());
        res.setTrainPresToolsAnnualCost(investmentAndExpensesTemplate.getTrainPresToolsAnnualCost());
        res.setMiddleMgmtComp(investmentAndExpensesTemplate.getMiddleMgmtComp());
        res.setIncentiveBonus(investmentAndExpensesTemplate.getIncentiveBonus());
        res.setSalesPersonInvestment(investmentAndExpensesTemplate.getSalesPersonInvestment());
        res.setSelfEmpTaxSSMedDisab(investmentAndExpensesTemplate.getSelfEmpTaxSSMedDisab());
        res.setTravel(investmentAndExpensesTemplate.getTravel());
        res.setUtilities(investmentAndExpensesTemplate.getUtilities());
        res.setBenefits(investmentAndExpensesTemplate.getBenefits());
        res.setBusinessIns(investmentAndExpensesTemplate.getBusinessIns());
        res.setAutoExpense(investmentAndExpensesTemplate.getAutoExpense());
        Link self = linkTo(ProposalSessionController.class).slash(investmentAndExpensesTemplate.getId()).withSelfRel();
        res.add(self);
        return res;
    }
}
