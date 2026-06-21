package array.medium;

import java.util.Arrays;

public class RearrangeElements_By_Sign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 0;
        int x = 0;
        int[] newArr = new int[nums.length];
        boolean sign = true;

        while (x < nums.length) {
            if (sign && nums[i] >= 0) {
                newArr[x] = nums[i];
                i++;
                x++;
                sign = false;
            } else if (!sign && nums[j] < 0) {
                newArr[x] = nums[j];
                j++;
                x++;
                sign = true;
            } else if (sign && nums[i] < 0) {
                i++;
            } else if (!sign && nums[j] >= 0) {
                j++;
            }
        }
        return newArr;
    }
}
