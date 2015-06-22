package com.jpm.leadgen.rest.mvc;

import com.jpm.leadgen.core.models.entities.ErrorInfo;
import com.jpm.leadgen.core.services.exceptions.CustomerExistsException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rmathew on 6/22/2015.
 */
@ControllerAdvice
public class GlobalRestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({RuntimeException.class })
    protected ResponseEntity<Object> handleRuntimeException(RuntimeException e, WebRequest request) {
        ErrorInfo errorInfo = getErrorInfo(e, request);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return handleExceptionInternal(e, errorInfo, headers, HttpStatus.CONFLICT, request);
    }

    private ErrorInfo getErrorInfo(RuntimeException e, WebRequest request) {
        return new ErrorInfo(getCode(e), getErrorMessage(e), getURI(request));
    }

    private String getCode(RuntimeException e) {
        return e.getClass().getSimpleName().replaceAll("Exception", "");
    }

    private String getErrorMessage(RuntimeException e) {
        return e.getLocalizedMessage();
    }

    private String getURI(WebRequest request) {
        return request.getDescription(false).split("=")[1];
    }
}
