package com.exercises.inheritance.abstract_class;


// BankAccount class inheriting from Account
public class BankAccount extends Account {

    public BankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        System.out.println("Depositing " + amount + " to account " + getAccountNumber());
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