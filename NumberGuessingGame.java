import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        int maxAttempts = 5;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (!guessedCorrectly) {
            System.out.println("😞 Sorry, you ran out of attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}
