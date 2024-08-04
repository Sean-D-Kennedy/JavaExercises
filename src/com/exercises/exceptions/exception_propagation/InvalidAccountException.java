package com.exercises.exceptions.exception_propagation;

public class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}