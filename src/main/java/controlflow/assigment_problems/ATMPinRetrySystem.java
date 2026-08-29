package controlflow.assigment_problems;

import java.util.Scanner;

public class ATMPinRetrySystem {

    public void atmPinRetry() {

        Scanner scanner = new Scanner(System.in);

        String correctPin = "4821";
        int attempts = 0;
        boolean success = false;

        while (attempts < 3 && !success) {

            System.out.print("Enter PIN: ");
            String enteredPin = scanner.nextLine();

            attempts++;

            if (enteredPin.equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }
        }

        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }

        scanner.close();
    }

    public static void main(String[] args) {

        ATMPinRetrySystem atm = new ATMPinRetrySystem();
        atm.atmPinRetry();
    }
}