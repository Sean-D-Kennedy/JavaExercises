package com.demo.polymorphism;

public class Dolphin extends Mammal{
    @Override
    public void eat(){
        System.out.println("Dolphins eat fish.");
    }
    public void swim(){
        System.out.println("Dolphins swim!");
    }
}
