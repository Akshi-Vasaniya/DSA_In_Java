package array.easy;

public class MaxAscendingSubarraySum {
    public static void main(String[] args) {
        int[] arr = {3,6,10,1,8,9,9,8,9};
        System.out.println(maxAscendingSum(arr));
    }

    private static int maxAscendingSum(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                count += nums[i];
            } else {
                count += nums[i];
                if (count > max) max = count;

                count = 0;
            }
        }

        if (nums.length!= 1 && nums[nums.length-2] <= nums[nums.length-1]) {
            count += nums[nums.length-1];
        } else if (nums[nums.length - 1] > count) {
            count = nums[nums.length - 1];
        }

        return Math.max(count, max);
    }
}
