

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(new int[]{
                        nums[i],
                        nums[left],
                        nums[right]
                    });

                    // Skip duplicate values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.toArray(new int[result.size()][]);
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

        ThreeSum threeSum = new ThreeSum();

        int[][] result = threeSum.threeSum(nums);

        System.out.println("Unique Triplets:");

        for (int[] triplet : result) {
            System.out.println(Arrays.toString(triplet));
        }

        scanner.close();
    }
}