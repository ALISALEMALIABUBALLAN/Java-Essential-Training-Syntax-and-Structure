package java_essential_training;

import java.util.Scanner;

/**
 * Dollar Game: A simple logic game to practice basic Java syntax.
 * The goal is to enter coins that add up to exactly $1.00.
 */

public class DollarGame {
    public static void main(String[] args) {
        // Define coin values as constants
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        Scanner scanner = new Scanner(System.in);

        // Collect input from the user
        System.out.println("--- Welcome to Change for a Dollar! ---");

        System.out.println("Enter number of pennies: ");
        double numOfPennies = scanner.nextDouble();

        System.out.println("Enter number of nickels: ");
        double numOfNickels = scanner.nextDouble();

        System.out.println("Enter number of dimes: ");
        double numOfDimes = scanner.nextDouble();

        System.out.println("Enter number of quarters: ");
        double numOfQuarters = scanner.nextDouble();

        scanner.close(); // Recommended practice to close the scanner

        boolean won = false;
        // Calculate the total sum of entered coins
        double total = (numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter);

        // Check the winning condition
        if (total == dollar) {
            System.out.println("Win! You reached exactly $1.00.");
        } else if (total > dollar) {
            double overAmount = total - dollar;
            System.out.println("Too much! You were over by $" + String.format("%.2f", overAmount));
        } else {
            double shortAmount = dollar - total;
            System.out.println("Not enough! You were short by $" + String.format("%.2f", shortAmount));
        }
    }
}
