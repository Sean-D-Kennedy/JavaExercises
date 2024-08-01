package com.example.classes.simple_class;

public class Customer {
    public String customerId;
    public String name;
    public String address;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId = "C001";
        customer.name = "John Doe";
        customer.address = "123 Main St";
        System.out.println("Customer ID: " + customer.customerId);
        System.out.println("Name: " + customer.name);
        System.out.println("Address: " + customer.address);
    }
}