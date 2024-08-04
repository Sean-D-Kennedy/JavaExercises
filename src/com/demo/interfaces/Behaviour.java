package com.demo.interfaces;

public interface Behaviour {
    // Default method
    default void eat() {
        System.out.println("This animal is eating.");
    }
}