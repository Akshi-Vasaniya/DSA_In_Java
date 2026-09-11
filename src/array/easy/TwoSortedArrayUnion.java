package array.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSortedArrayUnion {
    public static void main(String[] args) {
        int[] nums1 = {3, 3, 6, 7, 9, 10, 12, 13, 13, 13, 13, 15, 18, 19, 22, 22, 24, 24, 24, 26, 27, 28, 29, 29};
        int[] nums2 = {2, 4, 5, 8, 11, 12, 14, 14, 16, 17, 20, 22, 22, 22, 23, 25, 27, 28, 29, 30, 33, 34, 34, 34, 35, 38, 38, 40, 43, 44, 46, 48};
        
        unionArray(nums1, nums2);
    }

    private static void unionArray(int[] nums1, int[] nums2) {
        // We will going to use two pointers
        int a = 0;
        int b = 0;
//        int counter = -1; // Dont required
        ArrayList<Integer> li = new ArrayList<>();

        while (a < nums1.length && b < nums2.length) {
            int value;

            if (nums1[a] < nums2[b]) {
                 value = nums1[a];
                 a++;
            } else if (nums2[b] < nums1[a]  ) {
                value = nums2[b];
                b++;
            } else {
                value = nums1[a];
                a++;
                b++;
            }

            if (li.isEmpty() || li.getLast() != value) {
                li.add(value);
            }
        }

        while (a < nums1.length) {
            if (li.isEmpty() || li.getLast() != nums1[a]) {
                li.add(nums1[a]);
            }
            a++;

        }

        while (b < nums2.length) {
            if (li.isEmpty() || li.getLast() != nums2[b]) {
                li.add(nums2[b]);
            }
            b++;
        }

        System.out.println(li);
    }
}
