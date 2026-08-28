package controlflow.assigment_problems;

import java.util.Scanner;

public class PositiveNegativeZero {

    public void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        PositiveNegativeZero classifier = new PositiveNegativeZero();
        classifier.classifyNumber(number);

        scanner.close();
    }
}