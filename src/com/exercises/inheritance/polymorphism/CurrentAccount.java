package com.exercises.inheritance.polymorphism;

// CurrentAccount class
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded. Transaction denied.");
        }
    }
}
