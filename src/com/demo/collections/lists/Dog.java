package com.demo.collections.lists;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}