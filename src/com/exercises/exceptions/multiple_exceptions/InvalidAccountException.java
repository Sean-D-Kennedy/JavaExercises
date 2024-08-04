package com.exercises.exceptions.multiple_exceptions;

public class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}