

import java.util.Scanner;

public class ExamHallSeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {

        boolean foundDuplicate = false;

        System.out.println("Duplicate Seat Numbers:");

        for (int i = 0; i < seatNumbers.length; i++) {

            boolean duplicate = false;

            // Check if this seat number appears later
            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            // Check if this seat number appeared earlier
            boolean appearedEarlier = false;

            for (int k = 0; k < i; k++) {

                if (seatNumbers[i] == seatNumbers[k]) {
                    appearedEarlier = true;
                    break;
                }
            }

            if (duplicate && !appearedEarlier) {
                System.out.println(seatNumbers[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = scanner.nextInt();

        int[] seatNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter seat number " + (i + 1) + ": ");
            seatNumbers[i] = scanner.nextInt();
        }

        checkDuplicateSeats(seatNumbers);

        scanner.close();
    }
}