package com.demo.interfaces;

public interface Behaviour {
    // Default method
    default void eat() {
        System.out.println("Behaviour is eat.");
    }
}