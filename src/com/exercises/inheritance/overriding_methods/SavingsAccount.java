package com.exercises.inheritance.overriding_methods;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal would bring balance below minimum balance. Transaction denied.");
        }
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 1000.0, 5.0, 200.0);
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());

        // Trying to withdraw an amount that keeps the balance above minimum balance
        savingsAccount.withdraw(700.0);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        // Trying to withdraw an amount that would bring the balance below minimum balance
        savingsAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal attempt: " + savingsAccount.getBalance());
    }
}