package recursion.questions.array;

public class CheckSorting_Condition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5};
        System.out.println(isSort(arr, 0));
    }

    static boolean isSort(int[] arr, int x){
        if(x == arr.length - 1){
            // For last element
            return true;
        }
        // if one the element found violating arr[x] < arr[x+1] condition, then don't need to check further.
        if((arr[x] < arr[x+1]) && isSort(arr, x+1)){
            return true;
        } else {
            return false;
        }
    }
}
