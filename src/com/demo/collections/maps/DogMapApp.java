package com.demo.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class DogMapApp {
    public static void main(String[] args) {
        // Create a HashMap to store Dog objects with their names as keys
        // A map cannot contain duplicate keys; each key can map to at most one value.
        Map<String, Dog> dogMap = new HashMap<>();

        // Add Dog objects to the HashMap
        dogMap.put("Buddy", new Dog("Buddy"));
        dogMap.put("Charlie", new Dog("Charlie"));
        dogMap.put("Max", new Dog("Max"));
        dogMap.put("Bella", new Dog("Bella"));

        // Print the HashMap
        System.out.println("HashMap of dogs after adding:");
        for (Map.Entry<String, Dog> entry : dogMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Retrieve a Dog object from the HashMap
        Dog retrievedDog = dogMap.get("Charlie");
        System.out.println("\nRetrieved dog: " + retrievedDog);

        // Remove a Dog object from the HashMap
        dogMap.remove("Max");

        // Print the HashMap after removal
        System.out.println("\nHashMap of dogs after removing 'Max':");
        for (Map.Entry<String, Dog> entry : dogMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}