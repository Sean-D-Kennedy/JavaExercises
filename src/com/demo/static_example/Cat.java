package com.demo.static_example;
public class Cat {
    private String name;
    private static int count=0; // class variable, shared by all instances

    public Cat() {
        count++;
    }

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
    //    this.name = "SK";
        return count;
    }
    
}
