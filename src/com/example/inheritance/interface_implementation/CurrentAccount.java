package com.example.inheritance.interface_implementation;

// CurrentAccount class implementing Taxable
public class CurrentAccount extends BankAccount implements Taxable {
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

    @Override
    public double calculateTax() {
        return getBalance() * 0.15; // 15% tax on balance for CurrentAccount
    }
}
