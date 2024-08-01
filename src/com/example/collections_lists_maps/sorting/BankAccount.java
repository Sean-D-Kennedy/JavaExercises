package com.example.collections_lists_maps.sorting;

public class BankAccount implements Comparable<BankAccount> {
    private String accountNumber;
    private double balance;

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

    @Override
    public int compareTo(BankAccount other) {
        return Double.compare(this.balance, other.balance);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}