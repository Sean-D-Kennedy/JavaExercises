package com.example.oop.introduction_to_objects;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = "123456";
        account.balance = 1000.0;
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);
    }
}