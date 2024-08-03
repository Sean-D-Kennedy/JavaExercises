package com.example.inheritance.interface_implementation;

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("S001", 1000.0, 5.0, 200.0);
        CurrentAccount currentAccount = new CurrentAccount("C001", 500.0, 1000.0);

        System.out.println("Savings Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Savings Account Tax: " + savingsAccount.calculateTax());

        System.out.println();

        System.out.println("Current Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Current Account Tax: " + currentAccount.calculateTax());
    }
}