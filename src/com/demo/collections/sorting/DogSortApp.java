package com.demo.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DogSortApp {
    public static void main(String[] args) {
        // Create a list of Dog objects
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Buddy", 3));
        dogList.add(new Dog("Charlie",1));
        dogList.add(new Dog("Max",9));
        dogList.add(new Dog("Bella",7));

        // Print the list of dogs before sorting
        System.out.println("List of dogs before sorting:");
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        // Sort the list of dogs by their names using a Comparator
        Collections.sort(dogList);

        // Print the list of dogs after sorting
        System.out.println("\nList of dogs after sorting:");
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        // Alternatively, using lambda expression for the comparator
        Collections.sort(dogList, Comparator.comparing(dog-> dog.getAge()));

        // Print the list of dogs after sorting with lambda
        System.out.println("\nList of dogs after sorting with lambda:");
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
    }
}