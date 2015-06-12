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
    private String addressStreet1;
    private String addressStreet2;
    private String city;
    private String state;
    private String zip;
    private String phone1;
    private String phone2;
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

    public String getAddressStreet1() {
        return addressStreet1;
    }

    public void setAddressStreet1(String addressStreet1) {
        this.addressStreet1 = addressStreet1;
    }

    public String getAddressStreet2() {
        return addressStreet2;
    }

    public void setAddressStreet2(String addressStreet2) {
        this.addressStreet2 = addressStreet2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
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
        customer.setAddressStreet1(addressStreet1);
        customer.setAddressStreet2(addressStreet2);
        customer.setCity(city);
        customer.setState(state);
        customer.setZip(zip);
        customer.setPhone1(phone1);
        customer.setPhone2(phone2);
        customer.setEmail(email);
        return customer;
    }
}
