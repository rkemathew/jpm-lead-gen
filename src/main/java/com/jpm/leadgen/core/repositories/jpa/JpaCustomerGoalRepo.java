package com.jpm.leadgen.core.repositories.jpa;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.core.models.entities.CustomerGoal;
import com.jpm.leadgen.core.repositories.CustomerGoalRepo;
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
public class JpaCustomerGoalRepo implements CustomerGoalRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public CustomerGoal createCustomerGoal(CustomerGoal data) {
        em.persist(data);
        return data;
    }
}
