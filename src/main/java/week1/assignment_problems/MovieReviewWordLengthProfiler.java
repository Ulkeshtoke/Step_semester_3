

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {

        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short Words (1-4): " + shortWords);
        System.out.println("Medium Words (5-8): " + mediumWords);
        System.out.println("Long Words (9+): " + longWords);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = scanner.nextLine();

        classifyWordLengths(review);

        scanner.close();
    }
}