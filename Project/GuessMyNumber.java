import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random number generator
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the player guesses the number
        while (!hasGuessedCorrectly) {
            // Prompt the player for a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            // Check if the guess is correct
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
