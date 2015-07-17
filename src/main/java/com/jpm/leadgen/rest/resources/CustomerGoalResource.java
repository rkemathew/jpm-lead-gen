package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Created by Super User on 6/11/2015.
 */
public class CustomerGoalResource extends ResourceSupport {
    private Long rid;
    private Long customerRid;
    private String contactName;
    private String companyName;
    private BigDecimal currentValuation;
    private BigDecimal revenueGoalYear1;
    private BigDecimal revenueGoalYear2;
    private BigDecimal revenueGoalYear3;
    private BigDecimal revenueGoalYear4;
    private BigDecimal revenueGoalYear5;
    private BigDecimal upfrontFees;
    private int lagTime;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getCustomerRid() {
        return customerRid;
    }

    public void setCustomerRid(Long customerRid) {
        this.customerRid = customerRid;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getCurrentValuation() {
        return currentValuation;
    }

    public void setCurrentValuation(BigDecimal currentValuation) {
        this.currentValuation = currentValuation;
    }

    public BigDecimal getRevenueGoalYear1() {
        return revenueGoalYear1;
    }

    public void setRevenueGoalYear1(BigDecimal revenueGoalYear1) {
        this.revenueGoalYear1 = revenueGoalYear1;
    }

    public BigDecimal getRevenueGoalYear2() {
        return revenueGoalYear2;
    }

    public void setRevenueGoalYear2(BigDecimal revenueGoalYear2) {
        this.revenueGoalYear2 = revenueGoalYear2;
    }

    public BigDecimal getRevenueGoalYear3() {
        return revenueGoalYear3;
    }

    public void setRevenueGoalYear3(BigDecimal revenueGoalYear3) {
        this.revenueGoalYear3 = revenueGoalYear3;
    }

    public BigDecimal getRevenueGoalYear4() {
        return revenueGoalYear4;
    }

    public void setRevenueGoalYear4(BigDecimal revenueGoalYear4) {
        this.revenueGoalYear4 = revenueGoalYear4;
    }

    public BigDecimal getRevenueGoalYear5() {
        return revenueGoalYear5;
    }

    public void setRevenueGoalYear5(BigDecimal revenueGoalYear5) {
        this.revenueGoalYear5 = revenueGoalYear5;
    }

    public BigDecimal getUpfrontFees() {
        return upfrontFees;
    }

    public void setUpfrontFees(BigDecimal upfrontFees) {
        this.upfrontFees = upfrontFees;
    }

    public int getLagTime() {
        return lagTime;
    }

    public void setLagTime(int lagTime) {
        this.lagTime = lagTime;
    }

    public CustomerGoal toCustomerGoal() {
        Customer customer = new Customer();
        customer.setId(customerRid);

        CustomerGoal customerGoal = new CustomerGoal();
        customerGoal.setCustomer(customer);
        customerGoal.setCurrentValuation(currentValuation);
        customerGoal.setRevenueGoalYear1(revenueGoalYear1);
        customerGoal.setRevenueGoalYear2(revenueGoalYear2);
        customerGoal.setRevenueGoalYear3(revenueGoalYear3);
        customerGoal.setRevenueGoalYear4(revenueGoalYear4);
        customerGoal.setRevenueGoalYear5(revenueGoalYear5);
        customerGoal.setUpfrontFees(upfrontFees);
        customerGoal.setLagTime(lagTime);
        return customerGoal;
    }
}
