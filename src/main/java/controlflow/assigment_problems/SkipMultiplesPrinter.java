package controlflow.assigment_problems;

import java.util.Scanner;

public class SkipMultiplesPrinter {

    public void printSkippingMultiplesOfThree(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        SkipMultiplesPrinter printer = new SkipMultiplesPrinter();
        printer.printSkippingMultiplesOfThree(n);

        scanner.close();
    }
}