package com.demo.static_example;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Zia");
        System.out.println(c.getName());
        System.out.println(Cat.getCount());
        Cat c2 = new Cat();
        c2.setName("Fluffy");
        System.out.println(c2.getName());
        System.out.println(Cat.getCount());
    }
}