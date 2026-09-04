

import java.util.Scanner;

public class BankTransactionReferenceValidator {

    public static String normalizeReference(String raw) {

        String reference = raw.trim().toUpperCase();

        if (reference.length() < 3) {
            return reference;
        }

        String firstThree = reference.substring(0, 3);
        String remaining = reference.substring(3);

        return firstThree + remaining;
    }

    public static String validateAndFormat(String reference) {

        if (reference.length() != 14) {
            return "Invalid Reference";
        }

        for (int i = 0; i < 3; i++) {

            char ch = reference.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z'))) {

                return "Invalid Reference";
            }
        }

        for (int i = 3; i < 14; i++) {

            char ch = reference.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                return "Invalid Reference";
            }
        }

        String prefix = reference.substring(0, 3).toUpperCase();
        String digits = reference.substring(3);

        StringBuilder formatted = new StringBuilder();

        formatted.append(prefix);
        formatted.append("-");
        formatted.append(digits);

        return formatted.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String raw = scanner.nextLine();

        String normalized = normalizeReference(raw);

        System.out.println(validateAndFormat(normalized));

        scanner.close();
    }
}