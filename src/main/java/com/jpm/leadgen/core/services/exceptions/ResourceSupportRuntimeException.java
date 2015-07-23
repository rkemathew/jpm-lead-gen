package com.jpm.leadgen.core.services.exceptions;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by rmathew on 7/23/2015.
 */
public class ResourceSupportRuntimeException extends RuntimeException {
    ResourceSupport errorObject = null;

    public ResourceSupportRuntimeException() {
        super();
        this.errorObject = errorObject;
    }

    public ResourceSupportRuntimeException(String message, ResourceSupport errorObject) {
        super(message);
        this.errorObject = errorObject;
    }

    public ResourceSupport getErrorObject() {
        return errorObject;
    }

    public void setErrorObject(ResourceSupport errorObject) {
        this.errorObject = errorObject;
    }
}
