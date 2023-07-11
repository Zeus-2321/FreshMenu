public class ExampleProgram {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int age = 25;
        boolean isStudent = true;
        double height = 1.75;

        // Control flow with if-else statement
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        // Control flow with switch statement
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Keep improving!");
                break;
            default:
                System.out.println("Need more effort!");
        }

        // Arithmetic operations
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Control flow with for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }

        // Control flow with while loop
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Control flow with do-while loop
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);

        // Ternary operator
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
    }
}
