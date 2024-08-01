package com.example.inheritance.abstract_class;

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
}

// BankAccount class inheriting from Account
public class BankAccount extends Account {

    public BankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        System.out.println("Depositing " + amount + " to account " + getAccountNumber());
        // Since balance is private in Account, we need a way to set it
        setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance >= amount) {
            double newBalance = currentBalance - amount;
            System.out.println("Withdrawing " + amount + " from account " + getAccountNumber());
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Helper method to set the balance since the balance field is private in Account
    private void setBalance(double newBalance) {
        // Using reflection to bypass the access restriction for demonstration purposes
        // Ideally, the balance should have a protected setter in the Account class
        try {
            java.lang.reflect.Field balanceField = Account.class.getDeclaredField("balance");
            balanceField.setAccessible(true);
            balanceField.set(this, newBalance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}