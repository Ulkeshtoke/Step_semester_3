

import java.util.Scanner;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {

        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - Invalid File Type";
        }

        String extension = filename.substring(dotIndex + 1).toLowerCase();

        if (extension.equals("pdf") ||
            extension.equals("docx") ||
            extension.equals("zip")) {

            return "Accepted";
        }

        return "Rejected - Invalid File Type";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();

        System.out.println(validateFileExtension(filename));

        scanner.close();
    }
}