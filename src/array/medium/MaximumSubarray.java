package array.medium;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

//        System.out.println(maxSubArrayBF(nums));
        printMaxSubArray(nums);
    }

    public static int maxSubArrayBF(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum > max) max = sum;
            }


        }

        return max;
    }

    // Optimize Solution will be through Kadane's Algo

    public static void printMaxSubArray(int[] nums) {
        int sum = 0;
        int tempStart = 0;
        int start = -1;
        int end = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
                tempStart = i;
            }

            sum += nums[i];
            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Subarray: "+ Arrays.toString(Arrays.copyOfRange(nums, start, end+1)));
    }
}
