package com.exercises.exceptions.multiple_exceptions;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 1000.0);
        BankAccount account2 = new BankAccount("654321", 2000.0);
        BankAccount account3 = new BankAccount("111111", 500.0);

        // Demonstrating deposit
        account1.deposit(500.0);
        System.out.println("After depositing 500.0 to account1: " + account1);

        // Demonstrating successful transfer
        try {
            account1.transferFunds(account2, 300.0);
            System.out.println("After transferring 300.0 from account1 to account2:");
            System.out.println(account1);
            System.out.println(account2);
        } catch (InsufficientFundsException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        // Demonstrating transfer to invalid account
        try {
            account1.transferFunds(null, 100.0);
        } catch (InsufficientFundsException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        // Demonstrating transfer with insufficient funds
        try {
            account3.transferFunds(account2, 1000.0);
        } catch (InsufficientFundsException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        // Demonstrating transfer with invalid amount
        try {
            account1.transferFunds(account2, -50.0);
        } catch (InsufficientFundsException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}