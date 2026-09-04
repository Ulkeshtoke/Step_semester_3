

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            int requiredSum = currentSum - k;

            if (prefixSumCount.containsKey(requiredSum)) {
                count += prefixSumCount.get(requiredSum);
            }

            prefixSumCount.put(
                currentSum,
                prefixSumCount.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
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

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        SubarraySumEqualsK subarray = new SubarraySumEqualsK();

        int result = subarray.subarraySum(nums, k);

        System.out.println("Number of Subarrays: " + result);

        scanner.close();
    }
}