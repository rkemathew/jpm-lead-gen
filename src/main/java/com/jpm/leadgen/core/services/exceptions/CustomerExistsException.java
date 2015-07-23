package com.jpm.leadgen.core.services.exceptions;

import com.jpm.leadgen.core.models.entities.Customer;
import com.jpm.leadgen.rest.resources.CustomerResource;
import com.jpm.leadgen.rest.resources.asm.CustomerResourceAsm;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Ronnie on 7/12/15.
 */
public class CustomerExistsException extends ResourceSupportRuntimeException {
    public CustomerExistsException() {
        super();
    }

    public CustomerExistsException(String message, Customer customer) {
        super(message, (new CustomerResourceAsm()).toResource(customer));
    }
}
