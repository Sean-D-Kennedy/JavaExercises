package com.sample;
public class Cat {
    private String name;
    private static int count;

    public Cat() {
        count++;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }
    
}
