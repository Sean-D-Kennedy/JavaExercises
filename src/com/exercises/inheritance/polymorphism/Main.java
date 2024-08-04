package com.exercises.inheritance.polymorphism;

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        // BankAccount ref -> SavingsAccount object
        accounts[0] = new SavingsAccount("S001", 1000.0, 5.0, 200.0);

        // BankAccount ref -> CurrentAccount object
        accounts[1] = new CurrentAccount("C001", 500.0, 1000.0);

        // BankAccount ref -> SavingsAccount object
        accounts[2] = new SavingsAccount("S002", 2000.0, 4.0, 300.0);

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            account.deposit(100.0);
            System.out.println("Balance after deposit: " + account.getBalance());
            account.withdraw(600.0); // polymorphic call; code executed will depend on object being referred to
            System.out.println("Balance after withdrawal: " + account.getBalance());
            System.out.println();
        }
    }
}