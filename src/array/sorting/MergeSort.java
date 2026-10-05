package array.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        /*
        * Step-1: Divide and conquer the array into two parts
        * Step-2: Sort both the part of array via recursion
        * Step-3: Merge both the sorting part
        * */

        int[] nums = {3, 1, 5, 2, 10, 4, 11, 7};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    private static int[] mergeSort(int[] nums) {
        if (nums.length == 1) return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length+right.length];

        int i = 0;
        int j = 0;
        int counter = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[counter] = left[i];
                i++;
            } else if (right[j] < left[i]) {
                mix[counter] = right[j];
                j++;
            }
            counter++;
        }

        while (i < left.length) {
            mix[counter] = left[i];
            counter++;
            i++;
        }

        while (j < right.length) {
            mix[counter] = right[j];
            counter++;
            j++;
        }

        return mix;
    }
}
