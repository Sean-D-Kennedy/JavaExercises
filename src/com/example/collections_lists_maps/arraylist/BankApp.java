package com.example.collections_lists_maps.arraylist;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

    public static void main(String[] args) {
        // Create an ArrayList to hold BankAccount objects
        List<BankAccount> accounts = new ArrayList<>();

        // Add BankAccount objects to the list
        accounts.add(new BankAccount("123456", 1000.0));
        accounts.add(new BankAccount("654321", 2000.0));
        accounts.add(new BankAccount("111111", 3000.0));

        // Print the list of accounts
        System.out.println("Accounts after adding:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // Remove a BankAccount object from the list
        accounts.remove(1);  // Removing the account at index 1 (second account)

        // Print the list of accounts after removal
        System.out.println("\nAccounts after removing second account:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // Iterate through the list and perform operations
        System.out.println("\nIterating through accounts:");
        for (BankAccount account : accounts) {
            account.deposit(100.0);
            System.out.println(account);
        }
    }
}