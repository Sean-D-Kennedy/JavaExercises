package com.exercises.inheritance.polymorphism;

// SavingsAccount class
public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal would bring balance below minimum balance. Transaction denied.");
        }
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
