package com.demo.interfaces;

public class Dog implements Behaviour, Action {
    // Implement the abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // The default method from the interface can be used directly
    // Optionally, you can override the default method if needed
    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();        // Outputs: The dog is eating dog food.

        // Using a lambda expression to implement the functional interface Action
        Action action = () -> System.out.println("Dogs bark...");
        action.makeSound();   // Outputs: Dogs bark...
    }
}