package controlflow.assigment_problems;

import java.util.Scanner;

public class MenuDrivenCalculator {

    public void calculate(double a, double b, int choice) {

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        MenuDrivenCalculator calculator = new MenuDrivenCalculator();
        calculator.calculate(a, b, choice);

        scanner.close();
    }
}