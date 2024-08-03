# Exceptions

## 1. Basic Exception Handling
Add basic exception handling to the `withdraw` method in `BankAccount` to handle insufficient funds.

### a. `InsufficientFundsException` Class:
- A custom exception class that `extends Exception`.
- Includes a constructor that accepts a message and passes it to the superclass constructor.

### b. `BankAccount` Class:
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- The `withdraw` method throws an `InsufficientFundsException` if the balance is insufficient to cover the withdrawal amount.
- Overrides the `toString` method to provide a string representation of the object.

### c. `BankApp` Class:
- Defines the `main` method to execute the program:
  - Creates an instance of the `BankAccount` class.
  - Demonstrates depositing money into the account.
  - Demonstrates withdrawing money with sufficient funds, handling the potential `InsufficientFundsException`.
  - Demonstrates attempting to withdraw money with insufficient funds, catching and handling the `InsufficientFundsException`.

## 2. Multiple Exceptions
Handle multiple exceptions in the `transferFunds` method of `BankAccount` when transferring funds between accounts.

### a. Custom Exception Classes:
- `InsufficientFundsException`: Thrown when there are not enough funds to complete a transaction.
- `InvalidAccountException`: Thrown when attempting to transfer to an invalid account or when the transfer amount is invalid.

### b. `BankAccount` Class:
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit`, `withdraw`, and `transferFunds` methods to modify the balance and transfer funds between accounts.
- The `withdraw` method throws an `InsufficientFundsException` if the balance is insufficient to cover the withdrawal amount.
- The `transferFunds` method throws `InsufficientFundsException` and `InvalidAccountException` for various error scenarios.
  - `InsufficientFundsException` is thrown via the call to `withdraw`
  - `InvalidAccountException` is thrown if the account is `null` or the amount <= 0

### c. `BankApp` Class:
- Defines the `main` method to execute the program:
  - Creates instances of the `BankAccount` class.
  - Demonstrates transferring funds between accounts, handling potential exceptions using `try-catch` blocks.

## 3. Try-with-Resources
Demonstrate the use of try-with-resources by writing a method to read customer data from a file.

### a. `Customer` Class:
- Contains `private` fields `customerId`, `name`, and `address`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `customerId`, `name`, and `address`.
- Overrides the `toString` method to provide a string representation of the object.

### b. `CustomerApp` Class:
- Imports necessary classes from the `java.io` and `java.util` packages.
- Defines the `readCustomersFromFile` method to read customer data from a file using try-with-resources:
  -     try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    Customer customer = new Customer(details[0], details[1], details[2]);
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

  - Uses `BufferedReader` and `FileReader` to read the file line by line.
  - Splits each line into customer details and creates `Customer` objects.
  - Adds the `Customer` objects to a list.
  - Catches and handles `IOException` to handle any file reading errors.
- The `main` method specifies the file path, calls the `readCustomersFromFile` method, and prints the customers read from the file.

## 4. Exception Propagation
Write a method in `Bank` that calls various `BankAccount` methods and handles exceptions at different levels of the call stack.

### a. Custom Exception Classes:
- `InsufficientFundsException`: Thrown when there are not enough funds to complete a transaction.
- `InvalidAccountException`: Thrown when attempting to transfer to an invalid account (`null`) or when the transfer amount <= 0.

### b. `BankAccount` Class:
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit`, `withdraw`, and `transferFunds` methods to modify the balance and transfer funds between accounts.
- The `withdraw` method throws an `InsufficientFundsException` if the balance is insufficient to cover the withdrawal amount.
- The `transferFunds` method throws `InsufficientFundsException` and `InvalidAccountException` for various error scenarios (see above).

### c. `Bank` Class:
- Contains instances of `BankAccount` for demonstration.
- Defines the `performOperations` method to handle exceptions at a higher level in the call stack.
- Calls methods to deposit, withdraw, and transfer funds, handling exceptions at appropriate levels.
- Demonstrates exception propagation by catching and handling exceptions at different levels.
  - `performOperations()` calls `withdrawFromAccount()` which calls `withdraw()`
    - `withdraw()` generates an exception which is passed back to `withdrawFromAccount()` which simply passes the exception back up to `performOperations()` in the call stack.
  - `performOperations()` calls `transferFundsBetweenAccounts()` which calls `transferFunds()`
    - `transferFunds()` generates an exception which is passed back to `transferFundsBetweenAccounts()` which simply passes the exception back up to `performOperations()` in the call stack.
- The `main` method creates an instance of the `Bank` class and calls `performOperations` to demonstrate the functionality.
