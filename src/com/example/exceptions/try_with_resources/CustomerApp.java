package com.example.exceptions.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerApp {

    public static List<Customer> readCustomersFromFile(String fileName) {
        List<Customer> customers = new ArrayList<>();

        // Using try-with-resources to ensure resources are closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    Customer customer = new Customer(details[0], details[1], details[2]);
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return customers;
    }

    public static void main(String[] args) {
        // Specify the file path
        String fileName = "customers.txt";

        // Read customers from the file
        List<Customer> customers = readCustomersFromFile(fileName);

        // Print the customers read from the file
        System.out.println("Customers read from file:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}