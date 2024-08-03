package com.example.exceptions.exception_propagation;

public class Bank {

    private BankAccount account1;
    private BankAccount account2;

    public Bank() {
        account1 = new BankAccount("123456", 1000.0);
        account2 = new BankAccount("654321", 500.0);
    }

    public void performOperations() {
        try {
            depositToAccount(account1, 200.0);
            withdrawFromAccount(account1, 1500.0);  // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Handled at performOperations: " + e.getMessage());
        }

        try {
            transferFundsBetweenAccounts(account1, null, 300.0);  // This will throw an exception
        } catch (InvalidAccountException e) {
            System.out.println("Handled at performOperations: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Handled at performOperations: " + e.getMessage());
        }
    }

    public void depositToAccount(BankAccount account, double amount) {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
    }

    public void withdrawFromAccount(BankAccount account, double amount) throws InsufficientFundsException {
        account.withdraw(amount); // exception generated but not handled here, handled in caller method: performOperations
        System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
    }

    public void transferFundsBetweenAccounts(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundsException, InvalidAccountException {
        fromAccount.transferFunds(toAccount, amount); // exception generated but not handled here, handled in caller method: performOperations
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.performOperations();
    }
}