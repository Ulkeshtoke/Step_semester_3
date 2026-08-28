package controlflow.assigment_problems;

import java.util.Scanner;

public class PrintNumbersUpToN {

    public void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        PrintNumbersUpToN printer = new PrintNumbersUpToN();
        printer.printNumbersUpToN(n);

        scanner.close();
    }
}