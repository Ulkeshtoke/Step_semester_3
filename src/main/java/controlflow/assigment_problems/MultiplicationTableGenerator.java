package controlflow.assigment_problems;

import java.util.Scanner;

public class MultiplicationTableGenerator {

    public void generateTable(int[] candidates) {

        for (int number : candidates) {

            if (number <= 0) {
                continue;
            }

            System.out.println("Multiplication table of " + number);

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            break;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int count = scanner.nextInt();

        int[] candidates = new int[count];

        System.out.println("Enter candidates:");

        for (int i = 0; i < count; i++) {
            candidates[i] = scanner.nextInt();
        }

        MultiplicationTableGenerator generator =
                new MultiplicationTableGenerator();

        generator.generateTable(candidates);

        scanner.close();
    }
}