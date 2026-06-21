package array.easy;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        int nums[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLength(nums));
    }

    static int maxLength(int arr[]) {
        // code here
        int sum = 0;
        int counter = 0;
        int startIndex = 0;
        int maxIndex = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            sum = 0;
            startIndex = i;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                counter++;


                if (sum == 0) {
                    maxIndex = j;
                }
            }

            if (maxIndex > max) max = maxIndex;
        }


        return counter;
    }
}
