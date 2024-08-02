# Collections and Lists/Maps

## 1. ArrayList
Create a list of `BankAccount` objects. Write a program to add, remove, and iterate through the list.

### a. BankAccount Class:
- Contains private fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- Overrides the `toString` method to provide a string representation of the object.

### b. Main Class (BankApp):
- Imports necessary classes from the `java.util` package.
- Defines the `main` method to execute the program.
- Creates an `ArrayList` to store `BankAccount` objects.
- Adds three `BankAccount` objects to the list.
- Prints the list of accounts.
- Removes one `BankAccount` object from the list.
- Prints the list of accounts after removal.
- Iterates through the list, performs a deposit operation, and prints the updated account details.

## 2. HashMap
Create a map to store `Customer` objects with their `customerId` as the key. Write methods to add, remove, and retrieve customers.

### a. Customer Class:
- Contains private fields `customerId`, `name`, and `address`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `customerId`, `name`, and `address`.
- Overrides the `toString` method to provide a string representation of the object.

### b. CustomerApp Class:
- Imports necessary classes from the `java.util` package.
- Defines a `HashMap` named `customerMap` to store `Customer` objects with `customerId` as the key.
- Implements methods to add, remove, and retrieve customers from the `HashMap`.
    - `addCustomer(Customer customer)`: Adds a customer to the `HashMap`.
    - `removeCustomer(String customerId)`: Removes a customer from the `HashMap` by their `customerId`.
    - `getCustomer(String customerId)`: Retrieves a customer from the `HashMap` by their `customerId`.
- The `main` method demonstrates the functionality by creating `Customer` objects, adding them to the `HashMap`, retrieving a customer, removing a customer, and attempting to retrieve a removed customer.

## 3. Sorting
Implement `Comparable` in `BankAccount` to sort accounts based on balance. Demonstrate sorting a list of accounts.

### a. BankAccount Class:
- Implements the `Comparable<BankAccount>` interface.
- Contains private fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- Overrides the `compareTo` method to compare `BankAccount` objects based on their balance.
- Overrides the `toString` method to provide a string representation of the object.

### b. BankApp Class:
- Imports necessary classes from the `java.util` package.
- Defines the `main` method to execute the program.
- Creates a list of `BankAccount` objects.
- Adds several `BankAccount` objects to the list.
- Prints the list of accounts before sorting.
- Sorts the list of accounts based on balance using `Collections.sort`.
- Prints the list of accounts after sorting.

## 4. Custom Comparator
Create a custom comparator to sort `Customer` objects based on their name. Demonstrate sorting using this comparator.

### a. Customer Class:
- Contains private fields `customerId`, `name`, and `address`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `customerId`, `name`, and `address`.
- Overrides the `toString` method to provide a string representation of the object.

### b. CustomerNameComparator Class:
- Implements the `Comparator<Customer>` interface.
- Overrides the `compare` method to compare `Customer` objects based on their name using `String`'s `compareTo` method.

### c. CustomerApp Class:
- Imports necessary classes from the `java.util` package.
- Defines the `main` method to execute the program.
- Creates a list of `Customer` objects.
- Adds several `Customer` objects to the list.
- Prints the list of customers before sorting.
- Sorts the list of customers based on their name using `Collections.sort` and the custom comparator `CustomerNameComparator`.
    - Advanced: Use `Comparator.comparing(Function)` and a lambda expression instead of `CustomerNameComparator`.
    - Advanced: Use a method reference instead of a lambda expression for the above.
- Prints the list of customers after sorting.

## 5. Advanced Collection Operations
Use Java Streams to filter and sort `BankAccount` objects based on different criteria, such as balance greater than a specified amount.

### a. BankAccount Class:
- Contains private fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- Overrides the `toString` method to provide a string representation of the object.

### b. BankApp Class:
- Imports necessary classes from the `java.util` and `java.util.stream` packages.
- Defines the `main` method to execute the program.
- Creates a list of `BankAccount` objects.
- Adds several `BankAccount` objects to the list.
- Uses Java Streams to filter and sort the list of `BankAccount` objects based on balance greater than 1000.
- Collects the filtered and sorted list and prints the results.
- Further filters the list to accounts with balance greater than 1500 and sorts by account number, then prints the results.
