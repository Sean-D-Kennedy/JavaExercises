# Object-Oriented Programming (OOP)

## 1. Introduction to Objects
Create a `BankAccount` class with properties: `accountNumber` and `balance`. Write a simple program to create an instance of `BankAccount` and print its details.

### a. Define the Class:
- Define a `public` class named `BankAccount`.

### b. Declare Fields:
- Add two `public` fields: `accountNumber` and `balance`.

### c. Main Method:
- Define a `main` method inside the `BankAccount` class.
- Create an instance of the `BankAccount` class.
- Assign values to the `accountNumber` and `balance` fields.
- Print the values of the `accountNumber` and `balance` fields to the console.

## 2. Methods in OOP
Add methods to the `BankAccount` class: `deposit(double amount)` and `withdraw(double amount)`. Write a program to demonstrate the use of these methods.

### a. Define the Class:
- Define a `public` class named `BankAccount`.

### b. Declare Fields:
- Add two `public` fields: `accountNumber` and `balance`.

### c. Implement the _deposit_ Method:
- Define a `public` method `deposit` that takes a `double` amount as a parameter and adds it to the balance.

### d. Implement the _withdraw_ Method:
- Define a `public` method `withdraw` that takes a `double` amount as a parameter.
- Check if the balance is sufficient to cover the withdrawal amount.
- If sufficient, subtract the amount from the balance.
- If not sufficient, print an “Insufficient funds” message.

### e. Main Method:
- Define a `main` method inside the `BankAccount` class.
- Create an instance of the `BankAccount` class.
- Assign values to the `accountNumber` and `balance` fields.
- Call the `deposit` method to add money to the account.
- Call the `withdraw` method to withdraw money from the account.
- Print the final balance to the console.

## 3. Encapsulation
Modify the `BankAccount` class to use `private` fields and provide `public` getter and setter methods. Ensure balance cannot be set directly.

### a. Define the Class:
- Define a public class named `BankAccount`.

### b. Declare Fields:
- Add two private fields: `accountNumber` and `balance`.

### c. Implement Getter and Setter Methods:
- Define `public` getter and setter methods for the `accountNumber` field.
- Define a `public` getter method for the balance field. Once you know how to do this yourself; try it again, this time with the IDE helping you.

### d. Implement the _deposit_ Method:
- Define a `public` method `deposit` that takes a `double` amount as a parameter and adds it to the balance.

### e. Implement the _withdraw_ Method:
- Define a `public` method `withdraw` that takes a `double` amount as a parameter.
- Check if the balance is sufficient to cover the withdrawal amount.
- If sufficient, subtract the amount from the balance.
- If not sufficient, print an “Insufficient funds” message.

### f. Main Method:
- Define a `main` method inside the `BankAccount` class.
- Create an instance of the `BankAccount` class.
- Use the setter method to assign a value to the `accountNumber` field.
- Call the `deposit` method to add money to the account.
- Call the `withdraw` method to withdraw money from the account.
- Print the final balance to the console using the getter method.

## 4. Constructor
Add constructors to the `BankAccount` class: one default constructor and one parameterized constructor to initialize `accountNumber` and `balance`.

### a. Define the Class:
- Define a `public` class named `BankAccount`.

### b. Declare Fields:
- Add two `private` fields: `accountNumber` and `balance`.

### c. Implement Constructors:
- Define a default constructor that initializes `accountNumber` to an empty string and `balance` to 0.0.
- Define a parameterized constructor that initializes `accountNumber` and `balance` based on the values passed in. Name the parameters `accountNumber` and `balance` (the same as the instance variables).

### d. Implement Getter Methods:
- Define `public` getter methods for the `accountNumber` and `balance` fields.

### e. Implement the _deposit_ Method:
- Define a public method `deposit` that takes a `double` amount as a parameter and adds it to the balance.

### f. Implement the _withdraw_ Method:
- Define a `public` method `withdraw` that takes a `double` amount as a parameter.
- Check if the balance is sufficient to cover the withdrawal amount.
- If sufficient, subtract the amount from the balance.
- If not sufficient, print an “Insufficient funds” message.

### g. Main Method:
- Define a `main` method inside the `BankAccount` class.
- Create instances of the `BankAccount` class using both constructors.
- Print the balances of the created accounts to demonstrate the functionality. Make the output text friendly; for example: _Account1 balance is: 2000.16_

## 5. Overloading Methods
Add overloaded methods to the `BankAccount` class for `deposit` and `withdraw` that accept different parameters (e.g., `deposit(int amount)` and `deposit(double amount)`).

### a. Define the Class:
- Define a `public` class named `BankAccount`.

### b. Declare Fields:
- Add two private fields: `accountNumber` and `balance`.

### c. Implement Constructor:
- Define a parameterized constructor that initializes `accountNumber` and `balance` with given values.

### d. Implement Overloaded _deposit_ Methods:
- Define a public method `deposit` that takes a `double amount` as a parameter and adds it to the balance.
- Define another public method `deposit` that takes an `int amount` as a parameter and adds it to the balance.

### e. Implement Overloaded _withdraw_ Methods:
- Define a public method `withdraw` that takes a `double amount` as a parameter.
- Check if the balance is sufficient to cover the withdrawal amount.
- If sufficient, subtract the amount from the balance.
- If not sufficient, print an “Insufficient funds” message.
- Define another `public` method `withdraw` that takes an `int` amount as a parameter and follows the same logic.

### f. Main Method:
- Define a `main` method inside the `BankAccount` class.
- Create an instance of the `BankAccount` class using the parameterized constructor.
- Call the `deposit` method to add money to the account.
- Call the `withdraw` method to withdraw money from the account.
- Print the final balance to the console.

