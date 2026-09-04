

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ContainsDuplicate duplicate = new ContainsDuplicate();

        boolean result = duplicate.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);

        scanner.close();
    }
}