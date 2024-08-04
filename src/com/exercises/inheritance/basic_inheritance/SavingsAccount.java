package com.exercises.inheritance.basic_inheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 1000.0, 5.0);
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Interest: " + savingsAccount.calculateInterest());
    }
}