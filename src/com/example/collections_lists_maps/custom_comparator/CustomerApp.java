package com.example.collections_lists_maps.custom_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerApp {

    public static void main(String[] args) {
        // Create a list to hold Customer objects
        List<Customer> customers = new ArrayList<>();

        // Add Customer objects to the list
        customers.add(new Customer("C001", "John Doe", "123 Main St"));
        customers.add(new Customer("C002", "Jane Smith", "456 Oak Ave"));
        customers.add(new Customer("C003", "Alice Johnson", "789 Pine Rd"));
        customers.add(new Customer("C004", "Bob Brown", "101 Maple St"));

        // Print the list of customers before sorting
        System.out.println("Customers before sorting:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // Sort the list of customers based on their name using the custom comparator
        Collections.sort(customers, new CustomerNameComparator());
//        customers.sort(Comparator.comparing(c -> c.getName())); // lambda version
//        customers.sort(Comparator.comparing(Customer::getName)); // method reference version

        // Print the list of customers after sorting
        System.out.println("\nCustomers after sorting by name:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}