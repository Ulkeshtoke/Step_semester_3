package controlflow.assigment_problems;

import java.util.Scanner;

public class GuessTheNumberGame {

    public void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {

        int tries = 0;
        boolean guessed = false;

        while (tries < maxTries && !guessed) {

            int guess = guesses[tries];
            tries++;

            if (guess > secretNumber) {
                System.out.println("Too high");
            } else if (guess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            }
        }

        if (!guessed) {
            System.out.println("Out of tries — the number was " + secretNumber);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter secret number: ");
        int secretNumber = scanner.nextInt();

        System.out.print("Enter maximum number of tries: ");
        int maxTries = scanner.nextInt();

        int[] guesses = new int[maxTries];

        System.out.println("Enter your guesses:");

        for (int i = 0; i < maxTries; i++) {
            guesses[i] = scanner.nextInt();
        }

        GuessTheNumberGame game = new GuessTheNumberGame();
        game.guessTheNumber(secretNumber, maxTries, guesses);

        scanner.close();
    }
}