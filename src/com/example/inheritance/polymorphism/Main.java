package com.example.inheritance.polymorphism;

// Base class BankAccount
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

// SavingsAccount class
class SavingsAccount extends BankAccount {
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
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
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
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingsAccount("S001", 1000.0, 5.0, 200.0);
        accounts[1] = new CurrentAccount("C001", 500.0, 1000.0);
        accounts[2] = new SavingsAccount("S002", 2000.0, 4.0, 300.0);

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            account.deposit(100.0);
            System.out.println("Balance after deposit: " + account.getBalance());
            account.withdraw(600.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
            System.out.println();
        }
    }
}