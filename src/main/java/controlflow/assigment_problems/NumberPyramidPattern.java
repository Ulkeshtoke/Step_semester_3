package controlflow.assigment_problems;

import java.util.Scanner;

public class NumberPyramidPattern {

    public void printNumberPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        NumberPyramidPattern pyramid = new NumberPyramidPattern();
        pyramid.printNumberPyramid(n);

        scanner.close();
    }
}