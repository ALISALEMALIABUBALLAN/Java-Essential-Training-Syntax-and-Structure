package java_essential_training;

import java.util.Random;

/**
 * Roll the Die Game: A board game simulation.
 * The player has 5 rolls to reach exactly space 20.
 */
public class RollTheDieGame {
    public static void main(String[] args) {
        // Game Constants
        int lastSpace = 20;
        int maxRolls = 5;
        int currentSpace = 0;

        Random random = new Random();

        System.out.println("--- Welcome to Roll the Die! ---");
        System.out.println("Goal: Reach space 20 in exactly 5 rolls.");

        // Game Loop: Player gets exactly 5 attempts
        for (int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1; // Generates a number between 1 and 6
            currentSpace += die;

            System.out.println(String.format("Roll #%d: You rolled a %d. Current space: %d", i, die, currentSpace));

            // Check Win/Loss conditions
            if (currentSpace == lastSpace) {
                System.out.println(String.format("You're on space %d. Congrats, you win!", currentSpace));
                break; // Exit the loop if the player wins early
            }
            else if (currentSpace > lastSpace) {
                System.out.println(String.format("You've exceeded %d spaces. Sorry, you lose!", lastSpace));
                break; // Exit if they overshoot
            }
            else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println(String.format("You're only on space %d. Sorry, you lose!", currentSpace));
            } else {
                // Inform the user how many spaces are left
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You have " + spacesToGo + " more spaces to go.");
            }
            System.out.println("---------------------------------------");
        }
    }
}