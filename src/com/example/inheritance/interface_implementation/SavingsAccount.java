package com.example.inheritance.interface_implementation;

// SavingsAccount class implementing Taxable
public class SavingsAccount extends BankAccount implements Taxable {
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

    @Override
    public double calculateTax() {
        return getBalance() * 0.10; // 10% tax on balance for SavingsAccount
    }
}
