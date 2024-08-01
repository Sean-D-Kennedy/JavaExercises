package com.example.interfaces.functional_interfaces;

// Functional Interface InterestCalculator
@FunctionalInterface
interface InterestCalculator {
    double calculateInterest(double balance, double interestRate);
}

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

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// BankAccount class
class BankAccount extends Account {
    BankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

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

        InterestCalculator calculator = (balance, rate) -> balance * rate / 100;

        savingsAccount.calculateAndApplyInterest(calculator);

        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance after interest: " + savingsAccount.getBalance());
    }
}