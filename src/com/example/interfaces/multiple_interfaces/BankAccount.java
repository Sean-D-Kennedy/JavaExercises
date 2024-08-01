package com.example.interfaces.multiple_interfaces;

// Interface Transferable
interface Transferable {
    void transferFunds(BankAccount toAccount, double amount);
}

// Interface Reportable
interface Reportable {
    String generateReport();
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

// BankAccount class implementing Transferable and Reportable
public class BankAccount extends Account implements Transferable, Reportable {

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

    @Override
    public void transferFunds(BankAccount toAccount, double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from account " + getAccountNumber() + " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds to transfer");
        }
    }

    @Override
    public String generateReport() {
        return "Account Number: " + getAccountNumber() + "\nBalance: " + getBalance();
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 1000.0);
        BankAccount account2 = new BankAccount("654321", 500.0);

        System.out.println("Account 1 Report:\n" + account1.generateReport());
        System.out.println("Account 2 Report:\n" + account2.generateReport());

        account1.transferFunds(account2, 300.0);

        System.out.println("After Transfer:");
        System.out.println("Account 1 Report:\n" + account1.generateReport());
        System.out.println("Account 2 Report:\n" + account2.generateReport());
    }
}