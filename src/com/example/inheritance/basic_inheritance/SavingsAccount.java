package com.example.inheritance.basic_inheritance;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
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
}

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 1000.0, 5.0);
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Interest: " + savingsAccount.calculateInterest());
    }
}