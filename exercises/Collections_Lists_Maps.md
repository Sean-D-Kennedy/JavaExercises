# Collections and Lists/Maps

## 1. `ArrayList`
Create a list of `BankAccount` objects. Write a program to add, remove, and iterate through the list.

### a. `BankAccount` Class:
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- Overrides the `toString` method to provide a `String` representation of the object.

### b. `BankApp` Class:
- Imports `List` and `ArrayList` from the `java.util` package.
- Defines the `main` method to execute the program:
  - A `List` of `BankAccount`'s implemented by an `ArrayList` for storing `BankAccount` objects.
  - Adds three `BankAccount` objects to the list.
  - Using an enhanced-for loop, outputs (with implicit calls to `toString()`) the details of the accounts.
  - After the loop, remove any one `BankAccount` object from the list.
  - Outputs the list again (using an enhanced-for loop).
  - Iterates through the list, performs a deposit operation, and prints the updated account details.

## 2. HashMap
Create a map to store `Customer` objects with their `customerId` as the key. Write methods to add, remove, and retrieve customers.

### a. `Customer` Class:
- Contains `private` fields `customerId`, `name`, and `address` (all are `String`'s).
- Includes a constructor to initialize these fields.
- Provides getter methods for `customerId`, `name`, and `address`.
- Overrides the `toString` method to provide a `String` representation of the object.

### b. CustomerApp Class:
- Imports necessary interfaces/classes from the `java.util` package, namely `Map` and `HashMap`.
- Defines a `HashMap` instance variable named `customerMap` to store `Customer` objects with `customerId` as the key.
- Implements methods to add, remove, and retrieve customers from the `HashMap`.
    - `addCustomer(Customer customer)`: Adds a customer to the `HashMap`.
    - `removeCustomer(String customerId)`: Removes a customer from the `HashMap` by their `customerId`.
    - `getCustomer(String customerId)`: Retrieves a customer from the `HashMap` by their `customerId`.
- The `main` method demonstrates the functionality by creating `Customer` objects, adding them to the `HashMap`, retrieving a customer, removing a customer, and attempting to retrieve a removed customer.

## 3. Sorting
Implement `Comparable` in `BankAccount` to sort accounts based on balance. Demonstrate sorting a list of accounts.

### a. `BankAccount` Class:
- Implements the `Comparable<BankAccount>` interface.
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance. 
- Overrides the `compareTo` method to compare `BankAccount` objects based on their balance. 
  -     @Override public int compareTo(BankAccount other) {
           return Double.compare(this.balance, other.balance);}

- Overrides the `toString` method to provide a string representation of the object.

### b. BankApp Class:
- Imports necessary interfaces/classes from the `java.util` package, namely `List`, `ArrayList` and `Collections`.
- Defines the `main` method to execute the program.
- Creates a list of `BankAccount` objects.
- Adds several `BankAccount` objects to the list.
- Prints the list of accounts before sorting (enhanced-for loop).
- Sorts the list of accounts based on balance using the static utility method `Collections.sort`.
- Prints the list of accounts after sorting (enhanced-for loop).

## 4. Custom Comparator
Create a custom comparator to sort `Customer` objects based on their name. Demonstrate sorting using this comparator.

### a. `Customer` Class:
- Contains `private` fields `customerId`, `name`, and `address`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `customerId`, `name`, and `address`.
- Overrides the `toString` method to provide a string representation of the object.

### b. `CustomerNameComparator` Class:
- Implements the `Comparator<Customer>` interface.
- Overrides the `compare` method to compare `Customer` objects based on their name using `String`'s `compareTo` method.
  -     ` @Override public int compare(Customer c1, Customer c2) { return c1.getName().compareTo(c2.getName()); }`

### c. CustomerApp Class:
- Imports necessary classes from the `java.util` package.
- Defines the `main` method to execute the program.
- Creates a list of `Customer` objects.
- Adds several `Customer` objects to the list.
- Outputs the list of customers before sorting (enhanced-for loop).
- Sorts the list of customers based on their name using `Collections.sort` and the custom comparator `CustomerNameComparator`.
    - Bonus: Use `Comparator.comparing(Function)` and a lambda expression instead of `CustomerNameComparator`.
    - Bonus: Use a method reference instead of a lambda expression for the above.
- Outputs the list of customers after sorting (enhanced-for loop).

## 5. Advanced Collection Operations
Use Java Streams to filter and sort `BankAccount` objects based on different criteria, such as balance greater than a specified amount.

### a. `BankAccount` Class:
- Contains `private` fields `accountNumber` and `balance`.
- Includes a constructor to initialize these fields.
- Provides getter methods for `accountNumber` and `balance`.
- Provides `deposit` and `withdraw` methods to modify the balance.
- Overrides the `toString` method to provide a string representation of the object.

### b. `BankApp` Class:
- Imports necessary classes from the `java.util` and `java.util.stream` packages.
- Defines the `main` method to execute the program:
  - Creates a list of `BankAccount` objects.
  - Adds several `BankAccount` objects to the list.
  - Uses Java Streams to filter and sort the list of `BankAccount` objects based on balance greater than 1000.
    -         List<BankAccount> filteredAndSortedAccounts = accounts.stream()
                .filter(account -> account.getBalance() > 1000.0)
                .sorted(Comparator.comparing(BankAccount::getBalance))
                .collect(Collectors.toList());

  - Collects the filtered and sorted list and prints the results.
  - Further filter the list to accounts with balance greater than 1500 and sort by account number, then prints the results.
    -         List<BankAccount> furtherFilteredAccounts = filteredAndSortedAccounts.stream()
                .filter(account -> account.getBalance() > 1500.0)
                .sorted(Comparator.comparing(BankAccount::getAccountNumber))
                .collect(Collectors.toList());

