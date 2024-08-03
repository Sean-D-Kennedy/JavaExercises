package com.example.interfaces.default_methods;

// Interface Transferable
public interface Transferable {
    void transferFunds(BankAccount toAccount, double amount);

    default void logTransaction(String transactionDetail) {
        System.out.println("Transaction Log: " + transactionDetail);
    }
}
