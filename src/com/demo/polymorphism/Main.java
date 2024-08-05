package com.demo.polymorphism;

public class Main {
    public static void main(String[] args) {
  //      Mammal m = new Mammal(); // does not compile.
        Mammal[] mammals = {new Dolphin(), new Elephant(), new Mouse()};

        // Mammal m = new Dolphin();

        for(Mammal m:mammals){
            m.eat(); // reference determines the methods you can call
//            m.swim();
            if(m instanceof Dolphin){
//                m.swim(); // does not compile
                ((Dolphin) m).swim(); // have to have a Dolphin ref. in order to call swim()
            }
        }
    }
}
