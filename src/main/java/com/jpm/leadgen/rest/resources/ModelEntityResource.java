package com.jpm.leadgen.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by rmathew on 6/17/2015.
 */
public class ModelEntityResource extends ResourceSupport {
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
