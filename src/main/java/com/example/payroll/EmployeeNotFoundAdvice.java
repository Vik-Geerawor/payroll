package com.example.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice       // data written straight into response body
public class EmployeeNotFoundAdvice {
    /**
     * Handles the EmployeeNotFoundException exception
     * by calling the method below
     * @param ex
     * @return HTTP 404 Error message
     */

    @ExceptionHandler(EmployeeNotFoundException.class)      // triggers only when the exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND)                   // issues a HTTP 404 error
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        System.out.println("***" + ex.getMessage() + "***");
        return ex.getMessage();
    }
}
