package com.jpm.leadgen.core.models.entities;

import org.springframework.hateoas.ResourceSupport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Super User on 6/11/2015.
 */
public class ErrorInfo {
    private String code;
    private String errorMessage;
    private String uri;
    private ResourceSupport errorObject;

    public ErrorInfo(String code, String errorMessage, String uri, ResourceSupport errorObject) {
        this.code = code;
        this.errorMessage = errorMessage;
        this.uri = uri;
        this.errorObject = errorObject;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ResourceSupport getErrorObject() {
        return errorObject;
    }

    public void setErrorObject(ResourceSupport errorObject) {
        this.errorObject = errorObject;
    }
}
