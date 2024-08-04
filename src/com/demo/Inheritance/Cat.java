package com.demo.Inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{ name is " + getName()+" }";  // getName() is inherited
    }

    public static void main(String[] args) {
        Cat zia = new Cat("Zia");
        System.out.println(zia.getName()); // getName() is inherited

        System.out.println(zia);
    }
}
