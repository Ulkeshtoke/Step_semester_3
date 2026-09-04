

import java.util.Scanner;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int totalCharacters = original.length();

        int firstMismatchPosition = -1;

        for (int i = 0; i < totalCharacters; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i + 1;
            }
        }

        double accuracy = (matchedCharacters * 100.0) / totalCharacters;

        System.out.println("Matched Characters: " + matchedCharacters + "/" + totalCharacters);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatchPosition == -1) {
            System.out.println("No Mismatch Found");
        } else {
            System.out.println("First Mismatch Position: " + firstMismatchPosition);
            System.out.println("Original Character: " +
                    original.charAt(firstMismatchPosition - 1));
            System.out.println("Typed Character: " +
                    typed.charAt(firstMismatchPosition - 1));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Error: Both texts must have the same length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        scanner.close();
    }
}