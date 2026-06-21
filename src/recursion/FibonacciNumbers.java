package recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // n means nth fibonacci number
//        System.out.println(fibo(10));
//        long[] arr = new long[5];
//        System.out.println(Arrays.toString(fibo1(arr, 5, 0)));
    }

    static int fibonNum(int n){
        // base condition
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }
        return fibonNum(n-1) + fibonNum(n-2);
    }

}
