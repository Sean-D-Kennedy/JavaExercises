package com.exercises.inheritance.interface_implementation;

// BankAccount class inheriting from Account
public class BankAccount extends Account {
    public BankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
