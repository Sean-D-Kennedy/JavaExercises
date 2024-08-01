Object-Oriented Programming (OOP)

	1.	Introduction to Objects: Create a BankAccount class with properties: accountNumber and balance. Write a simple program to create an instance of BankAccount and print its details.
        a.	Define the Class:
            •	Define a public class named BankAccount.
        b.	Declare Fields:
            •	Add two public fields: accountNumber and balance.
        c.	Main Method:
          •	Define a main method inside the BankAccount class.
          •	Create an instance of the BankAccount class.
          •	Assign values to the accountNumber and balance fields.
          •	Print the values of the accountNumber and balance fields to the console.

	2.	Methods in OOP: Add methods to the BankAccount class: deposit(double amount) and withdraw(double amount). Write a program to demonstrate the use of these methods.
        a.	Define the Class:
            •	Define a public class named BankAccount.
        b.	Declare Fields:
            •	Add two public fields: accountNumber and balance.
        c.	Implement the deposit Method:
            •	Define a public method deposit that takes a double amount as a parameter and adds it to the balance.
        d.	Implement the withdraw Method:
          •	Define a public method withdraw that takes a double amount as a parameter.
          •	Check if the balance is sufficient to cover the withdrawal amount.
          •	If sufficient, subtract the amount from the balance.
          •	If not sufficient, print an “Insufficient funds” message.
        e.	Main Method:
          •	Define a main method inside the BankAccount class.
          •	Create an instance of the BankAccount class.
          •	Assign values to the accountNumber and balance fields.
          •	Call the deposit method to add money to the account.
          •	Call the withdraw method to withdraw money from the account.
          •	Print the final balance to the console.

	3.	Encapsulation: Modify the BankAccount class to use private fields and provide public getter and setter methods. Ensure balance cannot be set directly.
        a.	Define the Class:
            •	Define a public class named BankAccount.
        b.	Declare Fields:
            •	Add two private fields: accountNumber and balance.
        c.	Implement Getter and Setter Methods:
          •	Define public getter and setter methods for the accountNumber field.
          •	Define a public getter method for the balance field.
        d.	Implement the deposit Method:
            •	Define a public method deposit that takes a double amount as a parameter and adds it to the balance.
        e.	Implement the withdraw Method:
          •	Define a public method withdraw that takes a double amount as a parameter.
          •	Check if the balance is sufficient to cover the withdrawal amount.
          •	If sufficient, subtract the amount from the balance.
          •	If not sufficient, print an “Insufficient funds” message.
        f.	Main Method:
          •	Define a main method inside the BankAccount class.
          •	Create an instance of the BankAccount class.
          •	Use the setter method to assign a value to the accountNumber field.
          •	Call the deposit method to add money to the account.
          •	Call the withdraw method to withdraw money from the account.
          •	Print the final balance to the console using the getter method.

    4.	Constructor: Add constructors to the BankAccount class: one default constructor and one parameterized constructor to initialize accountNumber and balance.
        a.	Define the Class:
            •	Define a public class named BankAccount.
        b.	Declare Fields:
            •	Add two private fields: accountNumber and balance.
        c.	Implement Constructors:
          •	Define a default constructor that initializes accountNumber to an empty string and balance to 0.0.
          •	Define a parameterized constructor that initializes accountNumber and balance with given values.
        d.	Implement Getter Methods:
            •	Define public getter methods for the accountNumber and balance fields.
        e.	Implement the deposit Method:
            •	Define a public method deposit that takes a double amount as a parameter and adds it to the balance.
        f.	Implement the withdraw Method:
          •	Define a public method withdraw that takes a double amount as a parameter.
          •	Check if the balance is sufficient to cover the withdrawal amount.
          •	If sufficient, subtract the amount from the balance.
          •	If not sufficient, print an “Insufficient funds” message.
        g.	Main Method:
          •	Define a main method inside the BankAccount class.
          •	Create instances of the BankAccount class using both constructors.
          •	Print the balances of the created accounts to demonstrate the functionality.

	5.	Overloading Methods: Add overloaded methods to the BankAccount class for deposit and withdraw that accept different parameters (e.g., deposit(int amount) and deposit(double amount)).
        a.	Define the Class:
          •	Define a public class named BankAccount.
        b.	Declare Fields:
          •	Add two private fields: accountNumber and balance.
        c.	Implement Constructor:
          •	Define a parameterized constructor that initializes accountNumber and balance with given values.
        d.	Implement Overloaded deposit Methods:
          •	Define a public method deposit that takes a double amount as a parameter and adds it to the balance.
          •	Define another public method deposit that takes an int amount as a parameter and adds it to the balance.
        e.	Implement Overloaded withdraw Methods:
          •	Define a public method withdraw that takes a double amount as a parameter.
          •	Check if the balance is sufficient to cover the withdrawal amount.
          •	If sufficient, subtract the amount from the balance.
          •	If not sufficient, print an “Insufficient funds” message.
          •	Define another public method withdraw that takes an int amount as a parameter and follows the same logic.
        f.	Main Method:
          •	Define a main method inside the BankAccount class.
          •	Create an instance of the BankAccount class using the parameterized constructor.
          •	Call the deposit method to add money to the account.
          •	Call the withdraw method to withdraw money from the account.
          •	Print the final balance to the console.

Classes

	1.	Simple Class: Create a Customer class with properties: customerId, name, and address. Write a program to create a Customer object and print its details.
        a.	Define the Class:
            •	Declare a public class named Customer.
        b.	Declare Fields:
            •	Define three public fields: customerId, name, and address.
        c.	Create a Constructor:
            •	Define a constructor that takes three parameters (customerId, name, address) and initializes the corresponding fields.
        d.	Implement the Main Method:
          •	Inside the main method, create an instance of the Customer class using the constructor.
          •	Print the values of the customerId, name, and address fields to the console.	
    
    2.	Aggregation: Create a Bank class that contains a list of Customer objects. Write methods to add and remove customers from the bank.
        a.	Import Necessary Libraries:
          •	At the top of your file, import the ArrayList and List classes from the java.util package. This allows you to use these data structures in your code.
        b.	Define the Customer Class:
          •	Define a Customer class with three public fields: customerId, name, and address.
          •	Provide a constructor to initialize these fields.
        c.	Define the Bank Class:
          •	Define a Bank class with a private field customers that is a list of Customer objects.
          •	Initialize the customers list in the constructor.
          •	Provide methods to add and remove customers from the list, and to print customer details.
        d.	Main Method:
          •	In the Bank class, define a main method to demonstrate adding and printing customers.
          •	Create instances of the Customer class.
          •	Add the customers to the bank and print their details.
    3.	Composition: Create a Loan class that includes a Customer and BankAccount as properties. Write a method to print loan details along with customer and account information.
        a.	Define the Customer Class:
          •	Define a public class named Customer.
          •	Add three public fields: customerId, name, and address.
          •	Create a constructor that initializes these fields.
        b.	Define the BankAccount Class:
          •	Define a public class named BankAccount.
          •	Add private fields accountNumber and balance.
          •	Create a constructor that initializes these fields.
          •	Add public methods getAccountNumber(), getBalance(), deposit(double amount), and withdraw(double amount).
        c.	Define the Loan Class:
          •	Define a public class named Loan.
          •	Add private fields customer, account, and loanAmount.
          •	Create a constructor that initializes these fields.
          •	Add a public method printLoanDetails() to print the loan details.
        d.	Main Method in Loan Class:
          •	Define a main method inside the Loan class to demonstrate the functionality.
          •	Create an instance of the Customer class.
          •	Create an instance of the BankAccount class.
          •	Create an instance of the Loan class using the Customer and BankAccount instances.
          •	Call the printLoanDetails() method to print the loan details.
    
    4.	Static Members: Add a static field and method to the Bank class to keep track of the total number of customers.
        a.	Define the Customer Class:
          •	Define a public class named Customer.
          •	Add three public fields: customerId, name, and address.
          •	Create a constructor that initializes these fields.
        b.	Define the Bank Class:
          •	Define a public class named Bank.
          •	Add a private field customers which is a list of Customer objects.
          •	Add a private static field totalCustomers to keep track of the total number of customers.
          •	Initialize the customers list in the constructor and set totalCustomers to 0.
          •	Provide methods addCustomer(Customer customer) and removeCustomer(Customer customer) to add and remove customers from the list and update totalCustomers.
          •	Add a method printCustomers() to print the details of all customers.
          •	Add a static method getTotalCustomers() to return the total number of customers.
        c.	Main Method in Bank Class:
          •	Define a main method inside the Bank class to demonstrate the functionality.
          •	Create an instance of the Bank class.
          •	Create instances of the Customer class.
          •	Add the customers to the bank.
          •	Print the details of all customers and the total number of customers.

Inheritance

	1.	Basic Inheritance: Create a SavingsAccount class that inherits from BankAccount. Add an interest rate property and a method to calculate interest.
        a.	BankAccount Class:
          •	This is the base class with properties accountNumber and balance.
          •	It has methods for depositing and withdrawing money.
        b.	SavingsAccount Class:
          •	This class inherits from BankAccount.
          •	It adds a new property interestRate.
          •	It includes a method calculateInterest() that calculates the interest based on the current balance and the interest rate.
        c.	Main Method:
          •	The main method creates an instance of SavingsAccount, deposits some money, and calculates the interest.
          •	It then prints the account number, balance, and calculated interest.	
    2.	Overriding Methods: Override the withdraw method in SavingsAccount to ensure balance never goes below a minimum balance.
        a.	BankAccount Class:
          •	This is the base class with properties accountNumber and balance.
          •	It has methods for depositing and withdrawing money.
        b.	SavingsAccount Class:
          •	This class inherits from BankAccount.
          •	It adds new properties interestRate and minimumBalance.
          •	The withdraw method is overridden to ensure that the balance does not fall below the specified minimumBalance.
          •	The calculateInterest method calculates the interest based on the current balance and the interest rate.
        c.	Main Method:
          •	The main method creates an instance of SavingsAccount, prints the account details, attempts a valid withdrawal, and prints the balance.
          •	It then attempts an invalid withdrawal that would bring the balance below the minimum balance, which should be denied, and prints the balance again to confirm no change.	
    3.	Polymorphism: Create a CurrentAccount class that also inherits from BankAccount. Demonstrate polymorphism by creating an array of BankAccount objects and performing various operations.
        a.	BankAccount Class:
          •	This is the base class with properties accountNumber and balance.
          •	It has methods for depositing and withdrawing money.
        b.	SavingsAccount Class:
          •	Inherits from BankAccount.
          •	Adds new properties interestRate and minimumBalance.
          •	Overrides the withdraw method to ensure that the balance does not fall below the specified minimumBalance.
          •	Includes a calculateInterest method to calculate interest based on the current balance and interest rate.
        c.	CurrentAccount Class:
          •	Inherits from BankAccount.
          •	Adds a new property overdraftLimit.
          •	Overrides the withdraw method to allow withdrawals up to the overdraft limit.
        d.	Main Class:
          •	Demonstrates polymorphism by creating an array of BankAccount objects that includes both SavingsAccount and CurrentAccount instances.
          •	Iterates through the array and performs various operations (deposit and withdraw) on each account, showcasing the polymorphic behavior.
          •	The overridden withdraw methods in SavingsAccount and CurrentAccount are called appropriately based on the actual object type at runtime.	
    4.	Abstract Class: Create an abstract class Account with abstract methods deposit and withdraw. Make BankAccount inherit from Account.
        a.	Account Abstract Class:
          •	An abstract class with abstract methods deposit and withdraw.
          •	Contains properties accountNumber and balance with a constructor to initialize them.
          •	Provides getters for accountNumber and balance.
        b.	BankAccount Class:
          •	Inherits from the abstract class Account.
          •	Implements the abstract methods deposit and withdraw.
          •	Uses a private helper method setBalance to update the balance because the balance field in Account is private.
          •	The setBalance method uses reflection to bypass the access restriction for demonstration purposes. In a real-world scenario, a protected setter for balance in the Account class would be more appropriate.
        c.	Main Method:
          •	Demonstrates the creation of a BankAccount instance, performing deposit and withdrawal operations, and printing the account details before and after the transactions.	
    5.	Interface Implementation: Create an interface Taxable with a method calculateTax. Implement this interface in SavingsAccount and CurrentAccount to calculate tax based on different rules.
        a.	Taxable Interface:
          •	Defines a method calculateTax() that returns a double value.
        b.	Account Abstract Class:
          •	The base class with common properties accountNumber and balance.
          •	Abstract methods deposit and withdraw.
          •	Protected setBalance method to update the balance.
        c.	BankAccount Class:
          •	Inherits from Account.
          •	Implements the deposit and withdraw methods.
        d.	SavingsAccount Class:
          •	Inherits from BankAccount and implements the Taxable interface.
          •	Adds properties interestRate and minimumBalance.
          •	Overrides the withdraw method to ensure balance does not fall below the minimum balance.
          •	Implements the calculateTax method to calculate a 10% tax on the balance.
        e.	CurrentAccount Class:
          •	Inherits from BankAccount and implements the Taxable interface.
          •	Adds a property overdraftLimit.
          •	Overrides the withdraw method to allow withdrawals up to the overdraft limit.
          •	Implements the calculateTax method to calculate a 15% tax on the balance.
        f.	Main Class:
          •	Demonstrates the functionality by creating instances of SavingsAccount and CurrentAccount.
          •	Prints the account details and calculated tax for each account.

Interfaces

	1.	Simple Interface: Create an interface Transferable with a method transferFunds. Implement this interface in BankAccount.
        a.	Transferable Interface:
            •	Defines a method transferFunds(BankAccount toAccount, double amount) for transferring funds between accounts.
        b.	Account Abstract Class:
            •	The base class with common properties accountNumber and balance.
            •	Abstract methods deposit and withdraw.
            •	Protected setBalance method to update the balance.
        c.	BankAccount Class:
            •	Inherits from Account and implements the Transferable interface.
            •	Implements the deposit and withdraw methods.
            •	Implements the transferFunds method to transfer funds from the current account to another BankAccount.
        d.	Main Method:
            •	Demonstrates the functionality by creating two instances of BankAccount.
            •	Prints the balance of both accounts before and after transferring funds from one account to the other.
    2.	Multiple Interfaces: Create another interface Reportable with a method generateReport. Implement both Transferable and Reportable in BankAccount.
	    a.	Transferable Interface:
	        •	Defines a method transferFunds(BankAccount toAccount, double amount) for transferring funds between accounts.
	    b.	Reportable Interface:
	        •	Defines a method generateReport() that returns a string report of the account details.
	    c.	Account Abstract Class:
            •	The base class with common properties accountNumber and balance.
            •	Abstract methods deposit and withdraw.
            •	Protected setBalance method to update the balance.
	    d.	BankAccount Class:
            •	Inherits from Account and implements both the Transferable and Reportable interfaces.
            •	Implements the deposit and withdraw methods.
            •	Implements the transferFunds method to transfer funds from the current account to another BankAccount.
            •	Implements the generateReport method to return a string report of the account details.
	    e.	Main Method:
            •	Demonstrates the functionality by creating two instances of BankAccount.
            •	Prints the report for both accounts before and after transferring funds from one account to the other.
    3.	Interface Inheritance: Create an interface PremiumAccount that extends Transferable and adds a method offerPremiumBenefits. Implement this in a PremiumBankAccount class.
        a.	Transferable Interface:
            •	Defines a method transferFunds(BankAccount toAccount, double amount) for transferring funds between accounts.
        b.	PremiumAccount Interface:
            •	Extends Transferable and adds a method offerPremiumBenefits().
        c.	Account Abstract Class:
          •	The base class with common properties accountNumber and balance.
          •	Abstract methods deposit and withdraw.
          •	Protected setBalance method to update the balance.
        d.	BankAccount Class:
          •	Inherits from Account.
          •	Implements the deposit and withdraw methods.
        e.	PremiumBankAccount Class:
          •	Inherits from BankAccount and implements the PremiumAccount interface.
          •	Implements the transferFunds method from Transferable to transfer funds from the current account to another BankAccount.
          •	Implements the offerPremiumBenefits method to provide premium benefits to the account holder.
        f.	Main Method:
          •	Demonstrates the functionality by creating instances of PremiumBankAccount and BankAccount.
          •	Prints the premium account details, offers premium benefits, and performs a fund transfer from the premium account to the regular account.
          •	Prints the balances of both accounts before and after the transfer.	
    4.	Default Methods: Add a default method logTransaction in Transferable and demonstrate its use in BankAccount.
	    a.	Transferable Interface:
	        •	Defines a method transferFunds(BankAccount toAccount, double amount).
	        •	Provides a default method logTransaction(String transactionDetail) that logs the transaction details.
	    b.	Account Abstract Class:
	        •	The base class with common properties accountNumber and balance.
	        •	Abstract methods deposit and withdraw.
	        •	Protected setBalance method to update the balance.
	    c.	BankAccount Class:
            •	Inherits from Account and implements the Transferable interface.
            •	Implements the deposit and withdraw methods, using logTransaction to log each transaction.
            •	Implements the transferFunds method, using logTransaction to log the transfer and any failed attempts due to insufficient funds.
	    d.	Main Method:
            •	Demonstrates the functionality by creating two instances of BankAccount.
            •	Performs various operations (deposit, withdraw, transfer) and logs each transaction using the default method logTransaction.
            •	Prints the balances of both accounts after the transactions.
    5.	Functional Interfaces: Create a functional interface InterestCalculator with a method calculateInterest. Use it with a lambda expression to calculate interest in SavingsAccount.
        a.	InterestCalculator Functional Interface:
          •	Annotated with @FunctionalInterface to indicate that it’s a functional interface.
          •	Defines a single abstract method calculateInterest(double balance, double interestRate).
        b.	Account Abstract Class:
          •	The base class with common properties accountNumber and balance.
          •	Abstract methods deposit and withdraw.
          •	Protected setBalance method to update the balance.
        c.	BankAccount Class:
          •	Inherits from Account.
          •	Implements the deposit and withdraw methods.
        d.	SavingsAccount Class:
          •	Inherits from BankAccount.
          •	Adds a new property interestRate.
          •	Includes a method calculateAndApplyInterest that takes an InterestCalculator as a parameter, calculates the interest using the provided calculator, and applies the interest to the balance.
        e.	Main Method:
          •	Creates an instance of SavingsAccount.
          •	Uses a lambda expression to implement the calculateInterest method of the InterestCalculator functional interface.
          •	Calls the calculateAndApplyInterest method to calculate and apply the interest to the SavingsAccount instance.
          •	Prints the account number and balance after applying the interest.

Collections and Lists/Maps

	1.	ArrayList: Create a list of BankAccount objects. Write a program to add, remove, and iterate through the list.
        a.	BankAccount Class:
          •	Contains private fields accountNumber and balance.
          •	Includes a constructor to initialize these fields.
          •	Provides getter methods for accountNumber and balance.
          •	Provides deposit and withdraw methods to modify the balance.
          •	Overrides the toString method to provide a string representation of the object.
        b.	Main Class (BankApp):
          •	Imports necessary classes from the java.util package.
          •	Defines the main method to execute the program.
          •	Creates an ArrayList to store BankAccount objects.
          •	Adds three BankAccount objects to the list.
          •	Prints the list of accounts.
          •	Removes one BankAccount object from the list.
          •	Prints the list of accounts after removal.
          •	Iterates through the list, performs a deposit operation, and prints the updated account details.

	2.	HashMap: Create a map to store Customer objects with their customerId as the key. Write methods to add, remove, and retrieve customers.
        a.	Customer Class:
          •	Contains private fields customerId, name, and address.
          •	Includes a constructor to initialize these fields.
          •	Provides getter methods for customerId, name, and address.
          •	Overrides the toString method to provide a string representation of the object.
        b.	CustomerApp Class:
          •	Imports necessary classes from the java.util package.
          •	Defines a HashMap named customerMap to store Customer objects with customerId as the key.
          •	Implements methods to add, remove, and retrieve customers from the HashMap.
          •	addCustomer(Customer customer): Adds a customer to the HashMap.
          •	removeCustomer(String customerId): Removes a customer from the HashMap by their customerId.
          •	getCustomer(String customerId): Retrieves a customer from the HashMap by their customerId.
          •	The main method demonstrates the functionality by creating Customer objects, adding them to the HashMap, retrieving a customer, removing a customer, and attempting to retrieve a removed customer.

	3.	Sorting: Implement Comparable in BankAccount to sort accounts based on balance. Demonstrate sorting a list of accounts.
        a.	BankAccount Class:
          •	Implements the Comparable<BankAccount> interface.
          •	Contains private fields accountNumber and balance.
          •	Includes a constructor to initialize these fields.
          •	Provides getter methods for accountNumber and balance.
          •	Provides deposit and withdraw methods to modify the balance.
          •	Overrides the compareTo method to compare BankAccount objects based on their balance.
          •	Overrides the toString method to provide a string representation of the object.
        b.	BankApp Class:
          •	Imports necessary classes from the java.util package.
          •	Defines the main method to execute the program.
          •	Creates a list of BankAccount objects.
          •	Adds several BankAccount objects to the list.
          •	Prints the list of accounts before sorting.
          •	Sorts the list of accounts based on balance using Collections.sort.
          •	Prints the list of accounts after sorting.

	4.	Custom Comparator: Create a custom comparator to sort Customer objects based on their name. Demonstrate sorting using this comparator.
        a.	Customer Class:
          •	Contains private fields customerId, name, and address.
          •	Includes a constructor to initialize these fields.
          •	Provides getter methods for customerId, name, and address.
          •	Overrides the toString method to provide a string representation of the object.
        b.	CustomerNameComparator Class:
          •	Implements the Comparator<Customer> interface.
          •	Overrides the compare method to compare Customer objects based on their name using String’s compareTo method.
        c.	CustomerApp Class:
          •	Imports necessary classes from the java.util package.
          •	Defines the main method to execute the program.
          •	Creates a list of Customer objects.
          •	Adds several Customer objects to the list.
          •	Prints the list of customers before sorting.
          •	Sorts the list of customers based on their name using Collections.sort and the custom comparator CustomerNameComparator.
            •	Advanced: Use Comparator.comparing(Function) and a lambda expression instead of CustomerNameComparator.
            •	Advanced: Use a method reference instead of a lambda expression for the above. 
          •	Prints the list of customers after sorting.

   5.	Advanced Collection Operations: Use Java Streams to filter and sort BankAccount objects based on different criteria, such as balance greater than a specified amount.
      a.	BankAccount Class:
            •	Contains private fields accountNumber and balance.
            •	Includes a constructor to initialize these fields.
            •	Provides getter methods for accountNumber and balance.
            •	Provides deposit and withdraw methods to modify the balance.
            •	Overrides the toString method to provide a string representation of the object.
      b.	BankApp Class:
            •	Imports necessary classes from the java.util and java.util.stream packages.
            •	Defines the main method to execute the program.
            •	Creates a list of BankAccount objects.
            •	Adds several BankAccount objects to the list.
            •	Uses Java Streams to filter and sort the list of BankAccount objects based on balance greater than 1000.
            •	Collects the filtered and sorted list and prints the results.
            •	Further filters the list to accounts with balance greater than 1500 and sorts by account number, then prints the results.

Exceptions

	1.	Basic Exception Handling: Add basic exception handling to the withdraw method in BankAccount to handle insufficient funds.
	2.	Custom Exceptions: Create a custom exception InsufficientFundsException and use it in BankAccount’s withdraw method.
	3.	Multiple Exceptions: Handle multiple exceptions in the transferFunds method of BankAccount when transferring funds between accounts.
	4.	Try-with-Resources: Demonstrate the use of try-with-resources by writing a method to read customer data from a file.
	5.	Exception Propagation: Write a method in Bank that calls various BankAccount methods and handles exceptions at different levels of the call stack.