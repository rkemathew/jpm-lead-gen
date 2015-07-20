package com.jpm.leadgen.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * Created by Super User on 6/11/2015.
 */
@Entity
public class CustomerGoal {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private Customer customer;
    private BigDecimal currentValuation;
    private BigDecimal revenueGoalYear1;
    private BigDecimal revenueGoalYear2;
    private BigDecimal revenueGoalYear3;
    private BigDecimal revenueGoalYear4;
    private BigDecimal revenueGoalYear5;
    private BigDecimal upfrontFees;
    private int lagTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public boolean shallowEquals(Object other) {
        if (this == other) return true;

        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }

        CustomerGoal customerGoal = (CustomerGoal) other;

        return ((this.customer != null ? 0 : customer.getId()) == (customerGoal.customer != null ? 0 : customerGoal.customer.getId())) &&
               (this.currentValuation.compareTo(customerGoal.currentValuation) == 0) &&
               (this.revenueGoalYear1.compareTo(customerGoal.revenueGoalYear1) == 0) &&
               (this.revenueGoalYear2.compareTo(customerGoal.revenueGoalYear2) == 0) &&
               (this.revenueGoalYear3.compareTo(customerGoal.revenueGoalYear3) == 0) &&
               (this.revenueGoalYear4.compareTo(customerGoal.revenueGoalYear4) == 0) &&
               (this.revenueGoalYear5.compareTo(customerGoal.revenueGoalYear5) == 0) &&
               (this.upfrontFees.compareTo(customerGoal.upfrontFees) == 0) &&
               (this.lagTime == customerGoal.lagTime);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;

        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }

        CustomerGoal customerGoal = (CustomerGoal) other;
        return (this.id == customerGoal.id) && shallowEquals(other);
    }

    @Override
    public int hashCode() {
        int retVal = 0;

        retVal = retVal + id.intValue();
        retVal = retVal + customer.hashCode();
        retVal = retVal + currentValuation.intValue();
        retVal = retVal + revenueGoalYear1.intValue();
        retVal = retVal + revenueGoalYear2.intValue();
        retVal = retVal + revenueGoalYear3.intValue();
        retVal = retVal + revenueGoalYear4.intValue();
        retVal = retVal + revenueGoalYear5.intValue();
        retVal = retVal + upfrontFees.intValue();
        retVal = retVal + lagTime;

        return retVal;
    }
}
