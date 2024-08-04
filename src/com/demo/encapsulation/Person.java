package com.demo.encapsulation;

// Java uses block scope. A block is {}.
public class Person {
    private String name; // instance variable
    private int age;

    public Person() {
        name="";
        age=0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        String s = "The name is " + name; // local variable
        return s;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getAge() {
        return age;
    }
    // method overloading
    public String getAge(String prefix) {
        return prefix + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
