package com.example.classes.more_aggregation;

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
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Name: " + customer.getName());
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

