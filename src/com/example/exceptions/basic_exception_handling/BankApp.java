package com.example.exceptions.basic_exception_handling;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0);

        // Demonstrating deposit
        account.deposit(500.0);
        System.out.println("After depositing 500.0: " + account);

        // Demonstrating withdrawal with sufficient funds
        try {
            account.withdraw(200.0);
            System.out.println("After withdrawing 200.0: " + account);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Demonstrating withdrawal with insufficient funds
        try {
            account.withdraw(2000.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}