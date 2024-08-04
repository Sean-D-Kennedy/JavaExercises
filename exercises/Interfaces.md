# Interfaces

## 1. Interface Implementation
Create an interface `Taxable` with a method `calculateTax`. Implement this interface in `SavingsAccount` and `CurrentAccount` to calculate tax based on different rules.

### a. Taxable Interface:
- Defines a method `calculateTax()` that returns a double value.

### b. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Provides a `protected` `setBalance` method to update the balance.

### c. `BankAccount` Class:
- Inherits from `Account`.
- Implements the `deposit` and `withdraw` methods.

### d. `SavingsAccount` Class:
- Inherits from `BankAccount` and implements the `Taxable` interface.
- Adds properties `interestRate` and `minimumBalance`.
- Overrides the `withdraw` method to ensure balance does not fall below the minimum balance.
- Implements the `calculateTax` method to calculate a 10% tax on the balance.

### e. `CurrentAccount` Class:
- Inherits from `BankAccount` and implements the `Taxable` interface.
- Adds a property `overdraftLimit`.
- Overrides the `withdraw` method to allow withdrawals up to the overdraft limit.
- Implements the `calculateTax` method to calculate a 15% tax on the balance.

### f. `Main` Class:
- Demonstrates the functionality by creating instances of `SavingsAccount` and `CurrentAccount`.
- Prints the account details and calculated tax for each account.

## 2. Simple Interface
Create an interface `Transferable` with a method `transferFunds`. Implement this interface in `BankAccount`.

### a. `Transferable` Interface:
- Defines a method `transferFunds(BankAccount toAccount, double amount)` for transferring funds between accounts.

### b. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### c. `BankAccount` Class:
- Inherits from `Account` and implements the `Transferable` interface.
- Implements the `deposit` and `withdraw` methods.
- Implements the `transferFunds` method to transfer funds from the current (this) account to another `BankAccount`.

### d. Main Method (in `BankAccount`):
- Demonstrates the functionality by creating two instances of `BankAccount`.
- Prints the balance of both accounts before and after transferring funds from one account to the other.

## 3. Multiple Interfaces
Create another interface `Reportable` with a method `generateReport`. Implement both `Transferable` and `Reportable` in `BankAccount`.

### a. `Transferable` Interface:
- Defines a method `transferFunds(BankAccount toAccount, double amount)` for transferring funds between accounts.

### b. `Reportable` Interface:
- Defines a method `generateReport()` that returns a `String` report of the account details.

### c. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### d. `BankAccount` Class:
- Inherits from `Account` and implements both the `Transferable` and `Reportable` interfaces.
- Implements the `deposit` and `withdraw` methods.
- Implements the `transferFunds` method to transfer funds from the current account to another `BankAccount`.
- Implements the `generateReport` method to return a `String` report of the account details.

### e. Main Method (in `BankAccount`):
- Demonstrates the functionality by creating two instances of `BankAccount`.
- Prints the report for both accounts before and after transferring funds from one account to the other.

## 4. Interface Inheritance
Create an interface `PremiumAccount` that extends `Transferable` and adds a method `offerPremiumBenefits`. Implement this in a `PremiumBankAccount` class.

### a. `Transferable` Interface:
- Defines a method `transferFunds(BankAccount toAccount, double amount)` for transferring funds between accounts.

### b. `PremiumAccount` Interface:
- Extends `Transferable` and adds a method `offerPremiumBenefits()`.

### c. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### d. `BankAccount` Class:
- Inherits from `Account`.
- Implements the `deposit` and `withdraw` methods.

### e. `PremiumBankAccount` Class:
- Inherits from `BankAccount` and implements the `PremiumAccount` interface.
- Implements the `transferFunds` method from `Transferable` to transfer funds from the current (this) account to another `BankAccount`.
- Implements the `offerPremiumBenefits` method to provide premium benefits to the account holder.

### f. Main Method (in `PremiumBankAccount`):
- Demonstrates the functionality by creating instances of `PremiumBankAccount` and `BankAccount`.
- Prints the premium account details, offers premium benefits, and performs a fund transfer from the premium account to the regular account.
- Prints the balances of both accounts before and after the transfer.

## 5. Default Methods
Add a `default` method `logTransaction` in `Transferable` and demonstrate its use in `BankAccount`.

### a. `Transferable` Interface:
- Defines a method `transferFunds(BankAccount toAccount, double amount)`.
- Provides a `default` method `logTransaction(String transactionDetail)` that logs the transaction details.

### b. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### c. `BankAccount` Class:
- Inherits from `Account` and implements the `Transferable` interface.
- Implements the `deposit` method using `logTransaction` to log each transaction.
- Implements the `transferFunds` and `withdraw` methods, using `logTransaction` to log the transfers/withdrawals and any failed attempts due to insufficient funds.

### d. Main Method (in `BankAccount`):
- Demonstrates the functionality by creating two instances of `BankAccount`.
- Performs various operations (deposit, withdraw, transfer) and logs each transaction using the `default` method `logTransaction`.
- Prints the balances of both accounts after the transactions.

## Bonus 
## 6. Functional Interfaces
Create a functional interface `InterestCalculator` with a method `calculateInterest`. Use it with a lambda expression to calculate interest in `SavingsAccount`.

### a. `InterestCalculator` Functional Interface:
- Annotated with `@FunctionalInterface` to indicate that it’s a functional interface.
- Defines a single abstract method `calculateInterest(double balance, double interestRate)`.

### b. `Account` Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### c. `BankAccount` Class:
- Inherits from `Account`.
- Implements the `deposit` and `withdraw` methods.

### d. `SavingsAccount` Class:
- Inherits from `BankAccount`.
- Adds a new property `interestRate`.
- Includes a method `calculateAndApplyInterest` that takes an `InterestCalculator` as a parameter, calculates the interest using the provided calculator, and applies the interest to the balance (using the `deposit` method).

### e. Main Method (in `SavingsAccount`):
- Creates an instance of `SavingsAccount`.
- Defines a lambda expression to implement the `calculateInterest` method of the `InterestCalculator` functional interface.
- Calls the `calculateAndApplyInterest` method (passing in the `InterestCalculator`) to calculate and apply the interest to the `SavingsAccount` instance.
- Prints the account number and balance after applying the interest.
