package com.demo.collections.lists;

import java.util.ArrayList; // has an add() which Iterator does not
import java.util.List;
import java.util.ListIterator;

public class DogListApp {
    public static void main(String[] args) {
        // Create an ArrayList to store Dog objects
        List<Dog> dogs = new ArrayList<>(); // type inference

        // Add Dog objects to the ArrayList
        Dog charlie = new Dog("Charlie");
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Charlie"));
//        dogs.add(charlie);
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Bella"));

        // Print the list of dogs
        System.out.println("List of dogs after adding:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
//        dogs.forEach(dog -> System.out.println(dog)); // lambda

        // Remove a Dog object from the ArrayList by index
        dogs.remove(2); // Removes "Max"

        // Remove a Dog object from the ArrayList by object
        dogs.remove(new Dog("Charlie")); // This won't remove "Charlie" because it's a different object
//        dogs.remove(charlie); // This won't remove "Charlie" because it's a different object

        // Print the list of dogs after removal
        System.out.println("\nList of dogs after removing by index:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        // https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java
        ListIterator<Dog> li = dogs.listIterator();
        while (li.hasNext()) {
            Dog dog = li.next(); // must be called before you can call li.remove()
            // Do something
            if (dog.getName().equals("Charlie")) {
                System.out.println("here");
                li.remove();
                li.add(new Dog("Spot"));
            }
        }

        // Print the final list of dogs
        System.out.println("\nFinal list of dogs after removing by name:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}