package com.example.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    /**
     * Personalized exception handling using this class
     * and the EmployeeNotFoundAdvice class
     * @param id
     */

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
