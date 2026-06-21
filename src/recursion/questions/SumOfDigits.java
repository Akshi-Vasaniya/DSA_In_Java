package recursion.questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(DigitsSum(1342));
    }

    static int DigitsSum(int n){
        if((n%10)  == n){
            return n;
        }

        // Another condition can be
//        if(n == 0){
        // Because at the end when one no. is remaining the / by 10 would be 0
//            return 0;
//        }
        return (n % 10) + DigitsSum(n / 10);
    }
}
