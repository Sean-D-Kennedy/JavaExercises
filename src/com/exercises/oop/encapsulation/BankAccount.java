package com.exercises.oop.encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456");
        account.deposit(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Balance: " + account.getBalance());
    }
}