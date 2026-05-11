package java_essential_training;

import java.util.Scanner;

/**
 * TextProcessor: A professional tool for dynamic text analysis.
 * Features: User input handling, Regex data cleaning, and Array-based search.
 */
public class TextProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Text Analysis System ---");
        System.out.print("Enter text to analyze: ");

        // Capturing the full line of text from the user
        String userInput = scanner.nextLine();

        if (userInput == null || userInput.trim().isEmpty()) {
            System.out.println("Error: No input provided.");
        } else {
            // Splitting string into an array based on whitespace (handles multiple spaces)
            String[] words = userInput.split("\\s+");

            System.out.println("\n--- Analysis Results ---");
            System.out.println("Total word count: " + words.length);

            // Processing array elements
            processWords(words);

            // Executing search functionality
            System.out.print("\nEnter a word to search for: ");
            String target = scanner.next();
            findWord(words, target);
        }

        scanner.close();
    }

    /**
     * Sanitizes words using Regex and calculates character length.
     * @param array The array of words to be processed.
     */
    static void processWords(String[] array) {
        System.out.println("Word breakdown (letters only):");
        for (String word : array) {
            // Removing all non-alphabetic characters using Regular Expressions
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (!cleanWord.isEmpty()) {
                System.out.println(String.format("- %s: %d chars", cleanWord, cleanWord.length()));
            }
        }
    }

    /**
     * Performs a case-insensitive search for a specific word within the array.
     * @param array The array to search.
     * @param target The word to look for.
     */
    static void findWord(String[] array, String target) {
        boolean isFound = false;
        // Sanitizing the search target
        String sanitizedTarget = target.replaceAll("[^a-zA-Z]", "");

        for (String s : array) {
            String cleanWord = s.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.equalsIgnoreCase(sanitizedTarget)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Search Result: Word '" + sanitizedTarget + "' found in the text.");
        } else {
            System.out.println("Search Result: Word not found.");
        }
    }
}