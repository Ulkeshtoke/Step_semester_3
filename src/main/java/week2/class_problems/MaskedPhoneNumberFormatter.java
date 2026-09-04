
import java.util.Scanner;

public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid Phone Number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid Phone Number";
            }
        }

        StringBuilder maskedPhone = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            maskedPhone.append('X');
        }

        maskedPhone.append('-');
        maskedPhone.append(phone.substring(6));

        return maskedPhone.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10-digit phone number: ");
        String phone = scanner.nextLine();

        System.out.println(maskPhoneNumber(phone));

        scanner.close();
    }
}