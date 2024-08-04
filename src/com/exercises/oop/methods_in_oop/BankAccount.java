package com.exercises.oop.methods_in_oop;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = "123456";
        account.balance = 1000.0;
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Balance: " + account.balance);
    }
}