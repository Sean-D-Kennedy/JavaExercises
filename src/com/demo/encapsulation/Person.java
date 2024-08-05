package com.demo.encapsulation;

// Java uses block scope. A block is {}.
public class Person {
    private String name; // instance variable
    private int age;

    public Person() { // no-args constructor
        name="";
        age=0;
    }

    public Person(String name, int age) { // overloaded constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { // instance (non-static) method
        String s = "The name is " + name; // local variable
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    // method overloading
    public String getAge(String prefix) {
        return prefix + age;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + age +
                '}';
    }
}






