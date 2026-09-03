package array.easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        System.out.println("Second Largest Element: "+secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int max1 = -1;
        int max2 = -1;

        for (int i: arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2 && i < max1) {
                max2 = i;
            }
        }
        return max2;
    }
}
