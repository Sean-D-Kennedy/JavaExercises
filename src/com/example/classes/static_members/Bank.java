package com.example.classes.static_members;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private static int totalCustomers = 0;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        totalCustomers++;
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        totalCustomers--;
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.customerId);
            System.out.println("Name: " + customer.name);
            System.out.println("Address: " + customer.address);
        }
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("C001", "John Doe", "123 Main St");
        Customer customer2 = new Customer("C002", "Jane Smith", "456 Oak Ave");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.printCustomers();
        System.out.println("Total Customers: " + Bank.getTotalCustomers());
    }
}

class Customer {
    public String customerId;
    public String name;
    public String address;

    Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}