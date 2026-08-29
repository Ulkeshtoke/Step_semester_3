package controlflow.assigment_problems;

import java.util.Scanner;

public class PrimeNumberChecker {

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        PrimeNumberChecker checker = new PrimeNumberChecker();

        if (checker.isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        scanner.close();
    }
}