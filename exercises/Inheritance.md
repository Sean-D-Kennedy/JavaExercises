# Inheritance

## 1. Basic Inheritance
Create a `SavingsAccount` class that inherits from `BankAccount`. Add an interest rate property and a method to calculate interest.

### a. BankAccount Class:
- This is the base class with properties `accountNumber` and `balance`.
- It has methods for depositing and withdrawing money.

### b. SavingsAccount Class:
- This class inherits from `BankAccount`.
- It adds a new property `interestRate`.
- It includes a method `calculateInterest()` that calculates the interest based on the current balance and the interest rate.

### c. Main Method:
- The main method creates an instance of `SavingsAccount`, deposits some money, and calculates the interest.
- It then prints the account number, balance, and calculated interest.

## 2. Overriding Methods
Override the `withdraw` method in `SavingsAccount` to ensure balance never goes below a minimum balance.

### a. BankAccount Class:
- This is the base class with properties `accountNumber` and `balance`.
- It has methods for depositing and withdrawing money.

### b. SavingsAccount Class:
- This class inherits from `BankAccount`.
- It adds new properties `interestRate` and `minimumBalance`.
- The `withdraw` method is overridden to ensure that the balance does not fall below the specified `minimumBalance`.
- The `calculateInterest` method calculates the interest based on the current balance and the interest rate.

### c. Main Method:
- The main method creates an instance of `SavingsAccount`, prints the account details, attempts a valid withdrawal, and prints the balance.
- It then attempts an invalid withdrawal that would bring the balance below the minimum balance, which should be denied, and prints the balance again to confirm no change.

## 3. Polymorphism
Create a `CurrentAccount` class that also inherits from `BankAccount`. Demonstrate polymorphism by creating an array of `BankAccount` objects and performing various operations.

### a. BankAccount Class:
- This is the base class with properties `accountNumber` and `balance`.
- It has methods for depositing and withdrawing money.

### b. SavingsAccount Class:
- Inherits from `BankAccount`.
- Adds new properties `interestRate` and `minimumBalance`.
- Overrides the `withdraw` method to ensure that the balance does not fall below the specified `minimumBalance`.
- Includes a `calculateInterest` method to calculate interest based on the current balance and interest rate.

### c. CurrentAccount Class:
- Inherits from `BankAccount`.
- Adds a new property `overdraftLimit`.
- Overrides the `withdraw` method to allow withdrawals up to the overdraft limit.

### d. Main Class:
- Demonstrates polymorphism by creating an array of `BankAccount` objects that includes both `SavingsAccount` and `CurrentAccount` instances.
- Iterates through the array and performs various operations (deposit and withdraw) on each account, showcasing the polymorphic behavior.
- The overridden `withdraw` methods in `SavingsAccount` and `CurrentAccount` are called appropriately based on the actual object type at runtime.

## 4. Abstract Class
Create an abstract class `Account` with abstract methods `deposit` and `withdraw`. Make `BankAccount` inherit from `Account`.

### a. Account Abstract Class:
- An abstract class with abstract methods `deposit` and `withdraw`.
- Contains properties `accountNumber` and `balance` with a constructor to initialize them.
- Provides getters for `accountNumber` and `balance`.

### b. BankAccount Class:
- Inherits from the abstract class `Account`.
- Implements the abstract methods `deposit` and `withdraw`.
- Uses a private helper method `setBalance` to update the balance because the balance field in `Account` is private.
- The `setBalance` method uses reflection to bypass the access restriction for demonstration purposes. In a real-world scenario, a protected setter for balance in the `Account` class would be more appropriate.

### c. Main Method:
- Demonstrates the creation of a `BankAccount` instance, performing deposit and withdrawal operations, and printing the account details before and after the transactions.

## 5. Interface Implementation
Create an interface `Taxable` with a method `calculateTax`. Implement this interface in `SavingsAccount` and `CurrentAccount` to calculate tax based on different rules.

### a. Taxable Interface:
- Defines a method `calculateTax()` that returns a double value.

### b. Account Abstract Class:
- The base class with common properties `accountNumber` and `balance`.
- Abstract methods `deposit` and `withdraw`.
- Protected `setBalance` method to update the balance.

### c. BankAccount Class:
- Inherits from `Account`.
- Implements the `deposit` and `withdraw` methods.

### d. SavingsAccount Class:
- Inherits from `BankAccount` and implements the `Taxable` interface.
- Adds properties `interestRate` and `minimumBalance`.
- Overrides the `withdraw` method to ensure balance does not fall below the minimum balance.
- Implements the `calculateTax` method to calculate a 10% tax on the balance.

### e. CurrentAccount Class:
- Inherits from `BankAccount` and implements the `Taxable` interface.
- Adds a property `overdraftLimit`.
- Overrides the `withdraw` method to allow withdrawals up to the overdraft limit.
- Implements the `calculateTax` method to calculate a 15% tax on the balance.

### f. Main Class:
- Demonstrates the functionality by creating instances of `SavingsAccount` and `CurrentAccount`.
- Prints the account details and calculated tax for each account.
