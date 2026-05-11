package java_essential_training;

import java.util.Scanner;

/**
 * Enhanced Calculation Methods:
 * Demonstrates functional decomposition with dynamic user input
 * and support for floating-point (decimal) numbers.
 */
public class CreateMethodsToPerformCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Advanced Calculator (Methods Based) ---");

        // Allowing user to enter decimal numbers (double)
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        // Perform the chained calculation
        double finalResult = calculateNumbers(first, second);

        System.out.println("\n--- Results ---");
        System.out.println("Processing: ((" + first + " + " + second + ") - " + second + ") * " + first + " / " + second);
        System.out.println("The final result is: " + finalResult);

        scanner.close();
    }

    /**
     * Chains multiple arithmetic operations using 'double' for precision.
     */
    static double calculateNumbers(double firstNumber, double secondNumber) {
        double result;

        result = add(firstNumber, secondNumber);
        result = subtract(result, secondNumber);
        result = multiply(result, firstNumber);
        result = divide(result, secondNumber);

        return result;
    }

    // Mathematical Logic Methods
    static double add(double num1, double num2) {
        return num1 + num2;
    }

    static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Warning: Division by zero attempted!");
            return 0;
        }
        return num1 / num2;
    }
}