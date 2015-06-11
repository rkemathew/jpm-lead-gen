package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.Customer;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Super User on 6/11/2015.
 */
public class CustomerResource extends ResourceSupport {
    private Long rid;
    private String contactName;
    private String companyName;
    private String email;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer toCustomer() {
        Customer customer = new Customer();
        customer.setContactName(contactName);
        customer.setCompanyName(companyName);
        customer.setEmail(email);
        return customer;
    }
}
