package com.example.interfaces.interface_inheritance;

// Interface Transferable
interface Transferable {
    void transferFunds(BankAccount toAccount, double amount);
}

// Interface PremiumAccount extending Transferable
interface PremiumAccount extends Transferable {
    void offerPremiumBenefits();
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

// PremiumBankAccount class implementing PremiumAccount
public class PremiumBankAccount extends BankAccount implements PremiumAccount {

    public PremiumBankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void transferFunds(BankAccount toAccount, double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from account " + getAccountNumber() + " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds to transfer");
        }
    }

    @Override
    public void offerPremiumBenefits() {
        System.out.println("Offering premium benefits to account " + getAccountNumber());
    }

    public static void main(String[] args) {
        PremiumBankAccount premiumAccount = new PremiumBankAccount("789012", 5000.0);
        BankAccount regularAccount = new BankAccount("345678", 1000.0);

        System.out.println("Premium Account Number: " + premiumAccount.getAccountNumber());
        System.out.println("Premium Account Balance: " + premiumAccount.getBalance());
        premiumAccount.offerPremiumBenefits();

        premiumAccount.transferFunds(regularAccount, 1500.0);

        System.out.println("After Transfer:");
        System.out.println("Premium Account Balance: " + premiumAccount.getBalance());
        System.out.println("Regular Account Balance: " + regularAccount.getBalance());
    }
}