# Java-Essential-Training-Syntax-and-Structure
### 1️⃣ Change for a Dollar Game
**Description:** 
A logic-based interactive game designed to help users understand currency calculations. The program prompts the user to enter a specific number of coins (pennies, nickels, dimes, and quarters) and determines if the total value equals exactly one dollar.

**Technical Features:**
*   **Input Validation:** Uses `Scanner` to capture user inputs.
*   **Precision Handling:** Demonstrates how to work with `double` data types for financial calculations.
*   **User Feedback:** Provides dynamic responses based on whether the user won, went over budget, or was short of the goal.
*   **Output Formatting:** Uses `String.format()` to ensure currency values are displayed with two decimal places.

**How to Run:**
1. Compile: `javac DollarGame.java`
2. Run: `java DollarGame`
   
### 2️⃣ Roll the Die Game
**Description:** 
A board game simulation where the player tries to reach exactly space 20 within 5 rolls of a die. This project demonstrates control flow management and randomized logic.

**Technical Features:**
*   **Randomization:** Uses `java.util.Random` to simulate die rolls (1-6).
*   **Iteration:** Implements a `for` loop to manage a limited number of player turns.
*   **Complex Conditionals:** Manages multiple game states (Win, Overshoot, Under-target).
*   **String Formatting:** Utilizes `String.format()` for clean, dynamic console messaging.

**How to Run:**
1. Compile: `javac RollTheDieGame.java`
2. Run: `java RollTheDieGame`

### 3️⃣ Advanced Interactive Calculator (Functional Decomposition)
**Description:** 
An upgraded arithmetic processing tool that demonstrates the transition from hard-coded values to dynamic user interaction. This project focuses on "Clean Code" principles by breaking down complex logic into specialized, reusable methods.

**Technical Features:**
*   **Dynamic Data Input:** Uses `Scanner` to accept real-time user input, making the application interactive.
*   **Double Precision:** Supports floating-point numbers (`double`) instead of just integers, allowing for more accurate scientific/financial calculations.
*   **Functional Decomposition:** Logic is split into modular methods (`add`, `subtract`, `multiply`, `divide`), showcasing the principle of "Single Responsibility."
*   **Method Chaining:** Demonstrates how data can flow sequentially through multiple functional blocks to produce a final result.
*   **Edge Case Handling:** Includes validation to prevent "Division by Zero" errors.

**How to Run:**
1. Compile: `javac CreateMethodsToPerformCalculations.java`
2. Run: `java CreateMethodsToPerformCalculations`
