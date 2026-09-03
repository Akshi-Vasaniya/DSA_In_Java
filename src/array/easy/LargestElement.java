package array.easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println("Largest Element: "+largestElement1(arr));
        int[] nums = {3, 3, 0, 99, -40};
        System.out.println("Largest Element: "+largestElement2(nums));
    }

    static int largestElement1(int[] arr) {
        // If array contains positive values only
        int maxElement = 0;

        for (int j : arr) {
            if (j > maxElement) maxElement = j;
        }
        return maxElement;
    }

    static int largestElement2(int[] arr) {
        // If array contains both positive and negative values
        int maxElement = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > maxElement) maxElement = j;
        }
        return maxElement;
    }
}
