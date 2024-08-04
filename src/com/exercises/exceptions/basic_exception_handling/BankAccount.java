package com.exercises.exceptions.basic_exception_handling;

public class BankAccount {
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

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Insufficient funds for account number " + accountNumber);
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}