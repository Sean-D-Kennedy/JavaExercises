package com.example.collections_lists_maps.advanced_collections_operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankApp {

    public static void main(String[] args) {
        // Create a list to hold BankAccount objects
        List<BankAccount> accounts = new ArrayList<>();

        // Add BankAccount objects to the list
        accounts.add(new BankAccount("123456", 1000.0));
        accounts.add(new BankAccount("654321", 2000.0));
        accounts.add(new BankAccount("111111", 1500.0));
        accounts.add(new BankAccount("222222", 500.0));

        // Filter accounts with balance greater than 1000 and sort by balance
        List<BankAccount> filteredAndSortedAccounts = accounts.stream()
                .filter(account -> account.getBalance() > 1000.0)
                .sorted(Comparator.comparing(BankAccount::getBalance))
                .collect(Collectors.toList());

        // Print the filtered and sorted list of accounts
        System.out.println("Filtered and sorted accounts (balance > 1000):");
        for (BankAccount account : filteredAndSortedAccounts) {
            System.out.println(account);
        }

        // Further filter to accounts with balance greater than 1500 and sort by account number
        List<BankAccount> furtherFilteredAccounts = filteredAndSortedAccounts.stream()
                .filter(account -> account.getBalance() > 1500.0)
                .sorted(Comparator.comparing(BankAccount::getAccountNumber))
                .collect(Collectors.toList());

        // Print the further filtered list of accounts
        System.out.println("\nFurther filtered accounts (balance > 1500) sorted by account number:");
        for (BankAccount account : furtherFilteredAccounts) {
            System.out.println(account);
        }
    }
}