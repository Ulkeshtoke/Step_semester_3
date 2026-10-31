import java.util.Scanner;

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];

        System.out.println("Enter marks for 3 subjects:");

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / marks.length;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n" + name.toUpperCase() + ":");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}