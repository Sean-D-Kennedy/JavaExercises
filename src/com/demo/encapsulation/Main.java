package com.demo.encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person p1 = new Person();
        Person p2 = new Person("Maaike", 28);
        System.out.println(p1.toString());
        System.out.println(p2.getAge());
        System.out.println(p2.getAge("Age is: "));

    }
}