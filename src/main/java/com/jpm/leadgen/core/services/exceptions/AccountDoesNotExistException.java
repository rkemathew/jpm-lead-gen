package com.jpm.leadgen.core.services.exceptions;

/**
 * Created by Chris on 6/30/14.
 */
public class AccountDoesNotExistException extends RuntimeException {
    public AccountDoesNotExistException(Throwable cause) {
        super(cause);
    }

    public AccountDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountDoesNotExistException(String message) {
        super(message);
    }

    public AccountDoesNotExistException() {
    }
}
