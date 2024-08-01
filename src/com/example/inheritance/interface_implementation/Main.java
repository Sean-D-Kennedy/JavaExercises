package com.example.inheritance.interface_implementation;

// Interface Taxable
interface Taxable {
    double calculateTax();
}

// Abstract class Account
abstract class Account {
    private String accountNumber;
    private double balance;

    Account(String accountNumber, double balance) {
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

// BankAccount class inheriting from Account
class BankAccount extends Account {
    BankAccount(String accountNumber, double balance) {
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

// SavingsAccount class implementing Taxable
class SavingsAccount extends BankAccount implements Taxable {
    private double interestRate;
    private double minimumBalance;

    SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
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

// CurrentAccount class implementing Taxable
class CurrentAccount extends BankAccount implements Taxable {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
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

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("S001", 1000.0, 5.0, 200.0);
        CurrentAccount currentAccount = new CurrentAccount("C001", 500.0, 1000.0);

        System.out.println("Savings Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Savings Account Tax: " + savingsAccount.calculateTax());

        System.out.println();

        System.out.println("Current Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Current Account Tax: " + currentAccount.calculateTax());
    }
}