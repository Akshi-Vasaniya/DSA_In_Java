package array.easy;

import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        // Better Solution
        /*HashMap<Integer, Integer> map = new HashMap<>();

        // int max = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
        }

        for (int i = 1; i <= arr.length+1; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }

        return 2;*/

        // Optimal Solution
        int n = nums.length + 1; // Plus 1 bc one number is missing

        int expectedSum = n * (n + 1) / 2;

        int sum = 0;

        for (int x: nums) {
            sum += x;
        }

        return (expectedSum - sum);
    }
}
