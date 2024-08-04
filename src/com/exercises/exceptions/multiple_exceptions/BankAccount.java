package com.exercises.exceptions.multiple_exceptions;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
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

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Insufficient funds for account number " + accountNumber);
        }
    }

    public void transferFunds(BankAccount toAccount, double amount) throws InsufficientFundsException, InvalidAccountException {
        if (toAccount == null) {
            throw new InvalidAccountException("Invalid account: cannot transfer to a null account");
        }
        if (amount <= 0) {
            throw new InvalidAccountException("Invalid amount: transfer amount must be greater than zero");
        }

        this.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred " + amount + " from account " + this.accountNumber + " to account " + toAccount.getAccountNumber());
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}