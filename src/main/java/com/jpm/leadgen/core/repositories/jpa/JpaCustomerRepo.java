package com.jpm.leadgen.core.repositories.jpa;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.repositories.CustomerRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Chris on 7/10/14.
 */
@Repository
public class JpaCustomerRepo implements CustomerRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAllCustomers() {
        Query query = em.createQuery("SELECT c FROM Customer c");
        return query.getResultList();
    }

    @Override
    public Customer findCustomer(Long id) {
        return em.find(Customer.class, id);
    }

    @Override
    public List<Customer> findCustomersByCompanyName(String companyName) {
        Query query = em.createQuery("SELECT c FROM Customer c WHERE c.companyName LIKE ?1");
        query.setParameter(1, companyName + "%");
        return query.getResultList();
    }

    @Override
    public Customer createCustomer(Customer data) {
        em.persist(data);
        return data;
    }

    @Override
    public Customer updateCustomer(Long id, Customer data) {
        Customer customer = em.find(Customer.class, id);
        customer.setContactName(data.getContactName());
        customer.setCompanyName(data.getCompanyName());
        customer.setAddressStreet1(data.getAddressStreet1());
        customer.setAddressStreet2(data.getAddressStreet2());
        customer.setCity(data.getCity());
        customer.setState(data.getState());
        customer.setZip(data.getZip());
        customer.setPhone1(data.getPhone1());
        customer.setPhone2(data.getPhone2());
        customer.setEmail(data.getEmail());
        return customer;
    }

    @Override
    public Customer deleteCustomer(Long id) {
        Customer customer = em.find(Customer.class, id);
        em.remove(customer);
        return customer;
    }
}
