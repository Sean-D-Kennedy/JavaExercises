package com.example.classes.composition;

public class Loan {
    private Customer customer;
    private BankAccount account;
    private double loanAmount;

    public Loan(Customer customer, BankAccount account, double loanAmount) {
        this.customer = customer;
        this.account = account;
        this.loanAmount = loanAmount;
    }

    public void printLoanDetails() {
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Customer ID: " + customer.customerId);
        System.out.println("Name: " + customer.name);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }

    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St");
        BankAccount account = new BankAccount("123456", 1000.0);
        Loan loan = new Loan(customer, account, 5000.0);

        loan.printLoanDetails();
    }
}

class Customer {
    public String customerId;
    public String name;
    public String address;

    Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}

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