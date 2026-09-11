package array.easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Link: https://leetcode.com/problems/rotate-array/

        int[] nums = {1, 2, 3, 4, 5};
        int k = 24;
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int[] nums, int k) {
        int len = nums.length;
        k = k  % nums.length;
//        int[] newArr = nums.clone();

//        if (len != 1 && k != 0) {
////            int stm = x == 0 ? k : x;
//            for (int i = 0; i < stm; i++) {
//                int replaceIndex = (len - i - 1 + stm) - len;
//                int temp = newArr[len - i - 1];
//                // nums[len - i -1] = nums[replaceIndex];
//                nums[replaceIndex] = temp;
//            }
//
//            // Add all the remaining elements
//            int index = stm;
//            for (int i = 0; i < nums.length - stm; i++) {
//                nums[index] = newArr[i];
//                index++;
//            }
//        }

        k = k % len;

        int[] newArr = nums.clone();

        // Put the last k elements at the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = newArr[len - k + i];
        }

        // Put the remaining elements after them
        for (int i = 0; i < len - k; i++) {
            nums[k + i] = newArr[i];
        }

    }
}
