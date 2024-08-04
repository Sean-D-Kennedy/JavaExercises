package com.exercises.interfaces.simple_interface;

// Abstract class Account
public abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
