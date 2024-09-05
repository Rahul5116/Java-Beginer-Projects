//package Github;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operati on (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Sum: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Difference: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Product: " + result);
        } else if (operator == '/') {
            // Handle division by zero
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid Operator.");
        }

        scanner.close();
    }
}
