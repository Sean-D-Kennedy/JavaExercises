package com.example.interfaces.interface_inheritance;

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
        System.out.println("Regular Account Number: " + regularAccount.getAccountNumber());
        System.out.println("Regular Account Balance: " + regularAccount.getBalance());
        premiumAccount.offerPremiumBenefits();

        premiumAccount.transferFunds(regularAccount, 1500.0);

        System.out.println("After Transfer:");
        System.out.println("Premium Account Balance: " + premiumAccount.getBalance());
        System.out.println("Regular Account Balance: " + regularAccount.getBalance());
    }
}