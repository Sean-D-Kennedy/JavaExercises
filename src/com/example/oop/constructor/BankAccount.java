package com.example.oop.constructor;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

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
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("123456", 1000.0);
        System.out.println("Account1 Balance: " + account1.getBalance());
        System.out.println("Account2 Balance: " + account2.getBalance());
    }
}