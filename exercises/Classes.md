# Classes

## 1. Simple Class
Create a `Customer` class with properties: `customerId`, `name`, and `address`. Write a program to create a `Customer` object and print its details.

### a. Define the Class:
- Declare a `public` class named `Customer`.

### b. Declare Fields:
- Define three `private` fields: `customerId`, `name`, and `address`.

### c. Create a Constructor:
- Define a constructor that takes three parameters (`customerId`, `name`, `address`) and initializes the corresponding fields.

### d. Implement the Main Method:
- Inside the `main` method, create an instance of the `Customer` class using the constructor.
- Print the values of the `customerId`, `name`, and `address` fields to the console.

## 2. Aggregation
Note: Aggregation is a _HAS-A_ relationship where the child object can exist independently of the parent (Book and Library). Composition, on the other hand, whilst also a _HAS-A_ relationship, is much stronger: the child cannot exist without the parent e.g. House and Room.
\
\
Create a `Bank` class that contains a list of `Customer` objects. Write methods to add and remove customers from the bank.

### a. Import Necessary Libraries:
- At the top of your file, import the `ArrayList` and `List` classes from the `java.util` package. This allows you to use these data structures in your code.

### b. Define the Customer Class:
- Define a `Customer` class with three `private` fields: `customerId`, `name`, and `address`.
- Provide a constructor to initialize these fields.
- Provide getter methods to enable access to the `private` data.

### c. Define the Bank Class:
- Define a `Bank` class with a `private` field `customers` that is a list of `Customer` objects as in: `private List<Customer> customers;`
- Initialize the `customers` list in the constructor, as in: `customers = new ArrayList<>();`
- Provide methods to add and remove customers from the list (`add()` and `remove()` respectively); and to print customer details.

### d. Main Method:
- In the `Bank` class, define a `main` method to demonstrate adding and printing customers.
- Create instances of the `Customer` class.
- Add the customers to the bank and, using an enhanced-for loop, print their details.

## 3. More Aggregation
Create a `Loan` class that includes a `Customer` and `BankAccount` as properties. Write a method to print loan details along with customer and account information.

### a. Define the _Customer_ Class:
- Define a public class named `Customer`.
- Add three `private` fields: `customerId`, `name`, and `address`.
- Create a constructor that initializes these fields.
- Provide getter methods to enable access to the `private` data.

### b. Define the _BankAccount_ Class:
- Define a public class named `BankAccount`.
- Add `private` fields `accountNumber` and `balance`.
- Create a constructor that initializes these fields.
- Add `public` methods `getAccountNumber()`, `getBalance()`, `deposit(double amount)`, and `withdraw(double amount)`.

### c. Define the _Loan_ Class:
- Define a `public` class named `Loan`.
- Add `private` fields `customer`, `account`, and `loanAmount`.
- Create a constructor that initializes these fields.
- Add a public method `printLoanDetails()` to print the loan details. These details include the loan amount; the customer ID and name; and the account number and balance.

### d. Main Method in Loan Class:
- Define a `main` method inside the `Loan` class to demonstrate the functionality.
- Create an instance of the `Customer` class.
- Create an instance of the `BankAccount` class.
- Create an instance of the `Loan` class using the `Customer` and `BankAccount` instances.
- Call the `printLoanDetails()` method to print the loan details.

## 4. Static Members
Add a `static` field and method to the `Bank` class to keep track of the total number of customers.

### a. Define the _Customer_ Class:
- Define a public class named `Customer`.
- Add three `private` fields: `customerId`, `name`, and `address`.
- Create a constructor that initializes these fields.
- Provide getter methods to enable access to the `private` data.

### b. Define the _Bank_ Class:
- Define a `public` class named `Bank`.
- Add a `private` field `customers` which is a list of `Customer` objects.
- Add a `private static` field `totalCustomers` to keep track of the total number of customers.
- Initialize the `customers` list in the constructor and set `totalCustomers` to 0.
- Provide methods `addCustomer(Customer customer)` and `removeCustomer(Customer customer)` to add and remove customers from the list and update `totalCustomers`.
- Add a method `printCustomers()`, which uses an enhanced-for loop to print the details of all customers.
- Add a `static` method `getTotalCustomers()` to return the total number of customers.

### c. Main Method in Bank Class:
- Define a `main` method inside the `Bank` class to demonstrate the functionality.
- Create an instance of the `Bank` class.
- Create instances of the `Customer` class.
- Add the customers to the bank.
- Print the details of all customers and the total number of customers.
