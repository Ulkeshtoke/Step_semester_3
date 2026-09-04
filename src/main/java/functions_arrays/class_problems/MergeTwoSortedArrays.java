

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

    public int[] mergeArrays(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter first sorted array:");

        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter second sorted array:");

        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        MergeTwoSortedArrays merge = new MergeTwoSortedArrays();

        int[] result = merge.mergeArrays(nums1, nums2);

        System.out.println("Merged Array: " + Arrays.toString(result));

        scanner.close();
    }
}