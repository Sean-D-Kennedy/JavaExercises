package com.exercises.interfaces.functional_interfaces;

// Functional Interface InterestCalculator
@FunctionalInterface
public interface InterestCalculator {
    // A functional interface can have only one abstract method.
    // As there is only one abstract method, a lambda expression can be used:
    //     InterestCalculator calculator = (balance, rate) -> balance * rate / 100;
    //     System.out.println(calculator.calculateInterest(1000,5)); // hardcoded values
    double calculateInterest(double balance, double interestRate);
}
