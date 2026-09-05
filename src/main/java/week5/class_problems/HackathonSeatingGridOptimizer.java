
import java.util.Scanner;

public class HackathonSeatingGridOptimizer {

    private static double rowAverage(int[] row) {

        int sum = 0;

        for (int score : row) {
            sum += score;
        }

        return (double) sum / row.length;
    }

    public static String classifyRows(int[][] seatingScores, int threshold) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < seatingScores.length; i++) {

            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result.append("Row ").append(i).append(": Quiet Zone");
            } else {
                result.append("Row ").append(i).append(": Buzzing Zone");
            }

            if (i < seatingScores.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int[][] seatingScores = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.print("Enter number of scores in row " + i + ": ");
            int columns = scanner.nextInt();

            seatingScores[i] = new int[columns];

            for (int j = 0; j < columns; j++) {
                System.out.print("Enter score: ");
                seatingScores[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = scanner.nextInt();

        System.out.println(classifyRows(seatingScores, threshold));

        scanner.close();
    }
}