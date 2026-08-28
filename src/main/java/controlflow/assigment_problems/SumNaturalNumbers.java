package controlflow.assigment_problems;

import java.util.Scanner;

public class SumNaturalNumbers {

    public void sumOfNaturalNumbers(int n) {
        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        SumNaturalNumbers calculator = new SumNaturalNumbers();
        calculator.sumOfNaturalNumbers(n);

        scanner.close();
    }
}