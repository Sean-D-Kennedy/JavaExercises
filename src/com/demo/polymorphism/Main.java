package com.demo.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Mammal m = new Mammal(); // does not compile.
        Mammal[] mammals = {new Dolphin(), new Elephant(), new Mouse()};

        for(Mammal m:mammals){
            m.eat(); // reference determines the methods you can call
        }
    }
}
