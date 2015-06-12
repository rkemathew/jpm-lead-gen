package com.jpm.leadgen.core.services.exceptions;

/**
 * Created by Ronnie on 7/12/15.
 */
public class CustomerExistsException extends RuntimeException {
    public CustomerExistsException() {
    }

    public CustomerExistsException(String message) {
        super(message);
    }

    public CustomerExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerExistsException(Throwable cause) {
        super(cause);
    }
}
