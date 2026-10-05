package array.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        // Link: https://leetcode.com/problems/move-zeroes/description/

        int[] nums = {4,2,4,0,0,3,0,5,1,0};

        moveZerosAtEnd(nums);
    }

    private static void moveZerosAtEnd(int[] nums) {
        int len = nums.length;

        if (len == 1) {
            return;
        }

       /* // Two pointer
        int a = 0; // keep the track of zero
        int b = 1; // keep the track of non-zero

        while (a < len && b < len) {
            if (nums[a] == 0 && nums[b] != 0) {
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
                a++;
                b++;
            } else if (nums[a] != 0 && nums[b] == 0) {
                a++;
                b++;
            } else if (nums[a] != 0) {
                a++;
                if (b <= a) {
                    b++;
                }
            } else if (nums[b] == 0) {
                b++;
            }
        }
*/

        int i = 0; // Track of zero
        int j = 1; // Track of non-zero
        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] != 0) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
