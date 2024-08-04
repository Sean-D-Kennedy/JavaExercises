package com.exercises.exceptions.try_with_resources;

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
        String fileName = "customers.txt"; // generates an exception (no file present)

        // File would be comma-separated as follows (put in project root folder):
        //    C001,Sean,Ireland
        //    C002,Maaike,Holland

        // Read customers from the file
        List<Customer> customers = readCustomersFromFile(fileName);

        // Print the customers read from the file
        System.out.println("Customers read from file:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}