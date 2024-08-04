package com.exercises.classes.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("C001", "John Doe", "123 Main St");
        Customer customer2 = new Customer("C002", "Jane Smith", "456 Oak Ave");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.printCustomers();
    }
}
