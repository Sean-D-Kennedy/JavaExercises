package com.example.interfaces.default_methods;

// BankAccount class implementing Transferable
public class BankAccount extends Account implements Transferable {

    public BankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        logTransaction("Deposited " + amount + " to account " + getAccountNumber());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            logTransaction("Withdrew " + amount + " from account " + getAccountNumber());
        } else {
            System.out.println("Insufficient funds");
            logTransaction("Failed withdrawal of " + amount + " from account " + getAccountNumber() + " due to insufficient funds");
        }
    }

    @Override
    public void transferFunds(BankAccount toAccount, double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            toAccount.deposit(amount);
            logTransaction("Transferred " + amount + " from account " + getAccountNumber() + " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds to transfer");
            logTransaction("Failed transfer of " + amount + " from account " + getAccountNumber() + " to account " + toAccount.getAccountNumber() + " due to insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 1000.0);
        BankAccount account2 = new BankAccount("654321", 500.0);

        account1.deposit(200.0);
        account1.withdraw(150.0);
        account1.transferFunds(account2, 300.0);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}