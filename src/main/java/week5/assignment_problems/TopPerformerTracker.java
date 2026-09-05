

import java.util.Scanner;

public class TopPerformerTracker {

    public static String findMinMaxSpread(int[] scores) {

        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] < min) {
                min = scores[i];
            }

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        int spread = max - min;

        return "Min: " + min + " | Max: " + max + " | Spread: " + spread;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of scores: ");
        int n = scanner.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println(findMinMaxSpread(scores));

        scanner.close();
    }
}