import java.util.Scanner;
import java.util.Arrays;

public class DutyRosterRotation {

    public static String[] rotateRoster(String[] names, int k) {
        int n = names.length;

        // Remove complete rotations
        k = k % n;

        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotated[newIndex] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter the names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        String[] result = rotateRoster(names, k);

        System.out.println("Rotated roster: " + Arrays.toString(result));

        sc.close();
    }
}