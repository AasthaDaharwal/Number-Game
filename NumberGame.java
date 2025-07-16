package NumberGame;
import java.util.*;
import java.util.Scanner;

public class NumberGame {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int totScore = 0;
        int round = 0;

        System.out.println("Welcome to the Number Guessing Game");

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(100)+1;
            int maxAttempts = 10;
            int attempts = 0;
            boolean guessedCorrectly = false;
            round++;  

        System.out.println("Round "+ round + " begins!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have "+maxAttempts+" attempts to guess it");

        while (attempts < maxAttempts) {
            System.out.println("Enter your guess");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Correct! you have guessed the number in "+ attempts+ " attempts.");
                int points = 10 - (attempts-1) * 2;
                if (points < 2)  {
                    points = 2;
                }
                totScore += points;
                System.out.println("You earned "+points+ " points this round");
                guessedCorrectly = true;
                break;
            } else if (userGuess < numberToGuess){
                System.out.println("To low!");
            } else {
                System.out.println("To high!");
            }
        }
        if (!guessedCorrectly) {
            System.out.println("You have used all your attempts. The correct number was: "+ numberToGuess);
        }
        System.out.print("Do you want to play another round? (yes/ no): ");
        sc.nextLine(); 
        String response = sc.nextLine().toLowerCase();

        if (!response.equals("yes")) {
            playAgain = false;
        }

        }
        System.out.println("Game Over!");
        System.out.println(" Total Rounds Played: " + round);
        System.out.println("Your Final Score: " + totScore);
        System.out.println("Thanks for playing!");
        
    }
    
}
