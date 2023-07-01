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

         // Primitive variable declarations and assignments
        byte myByte = 10;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L; // Note the 'L' suffix for long values
        float myFloat = 3.14f; // Note the 'f' suffix for float values
        double myDouble = 3.14159;
        char myChar = 'A';
        boolean myBoolean = true;
        


        // control flow 
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
    }
}
