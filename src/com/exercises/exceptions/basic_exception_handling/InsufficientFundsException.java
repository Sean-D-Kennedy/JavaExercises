package com.exercises.exceptions.basic_exception_handling;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}