package array.easy;

import java.util.HashMap;

public class SubarrayWithSumK {
    public static void main(String[] args) {
        // Subarray Sum Equals K
        // Link: https://leetcode.com/problems/subarray-sum-equals-k/description/

        int[] nums = {1};
        System.out.println(subarraySumPositive(nums, 0));
        int[] arr = {10, 5, 2, 7, 1, -10};
        System.out.println(longestSubarray(arr, 15));
    }

    public static int subarraySumPositive(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int sum = nums[0];
        // int maxLen = 0;
        int counter = 0;

        int len = nums.length;

        while (right < len) {
            while (left <= right && sum > k) {
                // subtract till sum equals to 0 or less than k
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                // maxLen = Math.max(maxLen, right - left + 1);
                counter++;
            }

            right++;
            if (right < len) {
                sum += nums[right];
            }
        }
        return counter;
    }

    public static int longestSubarray(int[] arr, int k) {
        /*
         * Approach
         * 1. Think of brute force solution. O(n^2) which is to cal all subarray
         * 2. Think of who we can avoid recalculating sums repeatedly?
         * We can use method called prefix. Where we store the sum of previous elements.
         * To store we can use HashMap, has it's searching and insert TC is O(1)
         */

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // At every index add current value = current prefix sum
            prefixSum += arr[i];


            // Case 1: If prefix sum = k / whole array = k
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: Trying to find the largest subarray, whose sum = k
            // This method will find the subarray, whose sum is = k
            if (map.containsKey(prefixSum - k)) {
                // Getting the first index of subarray
                int prevIndex = map.get(prefixSum - k);

                // Getting the last index of subarray
                int lastIndex = i - prevIndex;

                maxLen = Math.max(maxLen, lastIndex);
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }

        }

        return maxLen;
    }
}
