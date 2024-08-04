package com.exercises.collections_lists_maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CustomerApp {

    private Map<String, Customer> customerMap;

    public CustomerApp() {
        customerMap = new HashMap<>();
    }

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customerMap.put(customer.getCustomerId(), customer);
        System.out.println("Customer added: " + customer);
    }

    // Method to remove a customer by customerId
    public void removeCustomer(String customerId) {
        Customer removedCustomer = customerMap.remove(customerId);
        if (removedCustomer != null) {
            System.out.println("Customer removed: " + removedCustomer);
        } else {
            System.out.println("Customer ID not found: " + customerId);
        }
    }

    // Method to retrieve a customer by customerId
    public Customer getCustomer(String customerId) {
        return customerMap.get(customerId);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        CustomerApp app = new CustomerApp();

        // Create and add customers
        Customer customer1 = new Customer("C001", "John Doe", "123 Main St");
        Customer customer2 = new Customer("C002", "Jane Smith", "456 Oak Ave");

        app.addCustomer(customer1);
        app.addCustomer(customer2);

        // Retrieve and print a customer
        System.out.println("\nRetrieving Customer with ID C001:");
        Customer retrievedCustomer = app.getCustomer("C001");
        System.out.println(retrievedCustomer);

        // Remove a customer
        System.out.println("\nRemoving Customer with ID C002:");
        app.removeCustomer("C002");

        // Attempt to retrieve a removed customer
        System.out.println("\nAttempting to retrieve removed Customer with ID C002:");
        Customer removedCustomer = app.getCustomer("C002");
        if (removedCustomer == null) {
            System.out.println("Customer ID C002 not found.");
        }
    }
}