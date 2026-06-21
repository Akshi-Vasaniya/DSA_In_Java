package array.medium;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 1, 2, 2, -1, -1, -1, -1, -1, -1, 0, 0, 0, 3, 5, 5, 5};
        int max = 1;
        int key = nums[0];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                int x = hashMap.get(nums[i]);
                hashMap.replace(nums[i], x, ++x);
                if (x > max) {
                    max = x;
                    key = nums[i];
                }
            }
        }

        System.out.println(key);
    }
}
