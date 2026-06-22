package algorithm.sortAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 9};

//        recursiveBubbleSort(arr, 0, arr.length);
        recursiveBubbleSort2(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void recursiveBubbleSort(int[] arr, int start, int end) {
        if (start == end) return;

        for (int i = start; i < end - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        recursiveBubbleSort(arr, start, end-1);
    }


    /**
     * This method uses purely recursion for the sorting. But it's increase the overhead of calling the method for
     * every iteration.
     * @param arr sorting array
     * @param start start index
     * @param end ending index
     */
    private static void recursiveBubbleSort2(int[] arr, int start, int end) {
        if (end == 0 ) return;

        if (start < end - 1) {
            if (arr[start] > arr[start+1]) {
                //swap
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }

            recursiveBubbleSort2(arr, start+1, end);
        } else {
            recursiveBubbleSort2(arr, 0, end-1);
        }
    }

}
