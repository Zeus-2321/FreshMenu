import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class App {

    // Parent class
    static class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    // Child class inheriting from BankAccount
    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void applyInterest() {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
            System.out.println("Interest applied: " + interest);
        }
    }

    public static void main(String[] args) throws Exception {

    // Example of exception handling
    try {
        int dividend = 10;
        int divisor = 0;
        int result = dividend / divisor;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Error: Division by zero");
    } finally {
        System.out.println("Finally block executed");
        // future chirag rememeber to not put return in this block 
    }
        // Map example
        Map<Integer, String> students = new HashMap<>();

        // Adding entries to the map
        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");

        // Accessing values in the map
        System.out.println(students.get(1));  // Output: John
        System.out.println(students.get(2));  // Output: Alice

        // Checking if a key exists in the map
        System.out.println(students.containsKey(3));  // Output: true

        // Removing an entry from the map
        students.remove(2);

        // Iterating over the map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println("ID: " + id + ", Name: " + name);
        }

        // Set example
        Set<String> fruits = new HashSet<>();

        // Adding elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Checking if an element exists in the set
        System.out.println(fruits.contains("Apple"));  // Output: true

        // Removing an element from the set
        fruits.remove("Banana");

        // Iterating over the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // List example
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Accessing elements in the list
        System.out.println(numbers.get(0));  // Output: 1
        System.out.println(numbers.get(1));  // Output: 2

        // Iterating over the list
        for (int number : numbers) {
            System.out.println(number);
        }

        // Annotation example
        @SuppressWarnings("unused")
        // Primitive variable declarations and assignments
        byte myByte = 10;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L; // Note the 'L' suffix for long values
        float myFloat = 3.14f; // Note the 'f' suffix for float values
        double myDouble = 3.14159;
        char myChar = 'A';
        boolean myBoolean = true;

        // Control flow example
        int num = 10;

        // Example of if-else statement
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example of switch statement
        switch (num) {
            case 0:
                System.out.println("The number is zero.");
                break;
            case 10:
                System.out.println("The number is ten.");
                break;
            default:
                System.out.println("The number is neither zero nor ten.");
                break;
        }

        // Example of a for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Example of a while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        // Example of a do-while loop
        int j = 1;
        do {
            System.out.println("Iteration: " + j);
            j++;
        } while (j <= 5);

        // Creating objects of BankAccount and SavingsAccount
        BankAccount account1 = new BankAccount("BA001", 1000);
        SavingsAccount account2 = new SavingsAccount("SA001", 2000, 5.0);

        // Accessing attributes and methods of BankAccount
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
        account1.deposit(500);
        account1.withdraw(200);

        System.out.println();

        // Accessing attributes and methods of SavingsAccount
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Balance: " + account2.getBalance());
        account2.deposit(1000);
        account2.withdraw(500);
        account2.applyInterest();

        // Stream creation and operations example
        List<String> names = List.of("John", "Alice", "Bob", "Mary", "David");

        // Filtering names that start with 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Mapping names to uppercase
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + uppercaseNames);

        // Counting the number of names
        long count = names.stream().count();
        System.out.println("Count: " + count);

        // Parallel stream example
        List<String> fruitsUpperCase = fruits.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Parallel Stream Uppercase Fruits: " + fruitsUpperCase);
    }
}
