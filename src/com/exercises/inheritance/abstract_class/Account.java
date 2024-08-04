package com.exercises.inheritance.abstract_class;

// Abstract class Account - this class cannot be new'ed
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

    protected void setBalance(double newBalance){
        balance = newBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
