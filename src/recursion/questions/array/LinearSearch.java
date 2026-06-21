package recursion.questions.array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 8};
        int[] arr2 = {2, 3, 5, 5, 1, 5};
//        System.out.println(linSea(arr, 1, 0));
//        System.out.println(linSeaIndex(arr, 1, 0));
//        System.out.println(linSea_For_MultipleOcc_WithString(arr2, 5, 0, ""));

//        System.out.println(linSea_For_MultipleOcc_WithList(arr2, 5, 0, new ArrayList<>()));
        // List in the body
        System.out.println(linSea_For_MultipleOcc_WithList(arr2, 5, 0));
    }

    static boolean linSea(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) || linSea(arr, target, index+1);
    }

    static int linSeaIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else{
            return linSeaIndex(arr, target, index+1);
        }
    }

    // With String
    static String linSea_For_MultipleOcc_WithString(int[] arr, int target, int index, String foundIndex){
        if(index == arr.length){
            return foundIndex;
        }
        if(arr[index] == target){
            foundIndex += " " + index;
        }
        return linSea_For_MultipleOcc_WithString(arr, target, index+1, foundIndex);
    }

    // With ArrayList
//    static ArrayList<Integer> linSea_For_MultipleOcc_WithList(int[] arr, int target, int index, ArrayList<Integer> li){
//        if(index == arr.length){
//            return li;
//        }
//        if(arr[index] == target){
//            li.add(index);
//        }
//        return linSea_For_MultipleOcc_WithList(arr, target, index+1, li);
//    }

    // Returning ArrayList but not in its parameters, but list should be in its body.
    static ArrayList<Integer> linSea_For_MultipleOcc_WithList(int[] arr, int target, int index){
        // Every time function call, a new list is created.
        ArrayList<Integer> li = new ArrayList<>();
        if(index == arr.length){
            return li;
        }
        // This will function will add the element for its call only
        if(arr[index] == target){
            li.add(index);
        }
        ArrayList<Integer> listFromFutureCalls = linSea_For_MultipleOcc_WithList(arr, target, index+1);
        li.addAll(listFromFutureCalls);
        return li;
    }
}
