

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter rotated sorted array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        FindMinimumInRotatedSortedArray minimum =
                new FindMinimumInRotatedSortedArray();

        int result = minimum.findMin(nums);

        System.out.println("Minimum Element: " + result);

        scanner.close();
    }
}