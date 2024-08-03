package com.example.interfaces.functional_interfaces;

// SavingsAccount class
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateAndApplyInterest(InterestCalculator calculator) {
        double interest = calculator.calculateInterest(getBalance(), interestRate);
        deposit(interest);
        System.out.println("Interest of " + interest + " applied to account " + getAccountNumber());
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 1000.0, 5.0);

        // This is the lambda expression on the right hand side of the =
        // It defines the code for the method 'calculateInterest'. As the interface,
        // is a functional interface, the compiler knows that the code relates to
        // the (one and only) abstract method 'calculateInterest'.
        InterestCalculator calculator = (balance, rate) -> balance * rate / 100;
        savingsAccount.calculateAndApplyInterest(calculator);

        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance after interest: " + savingsAccount.getBalance());
    }
}