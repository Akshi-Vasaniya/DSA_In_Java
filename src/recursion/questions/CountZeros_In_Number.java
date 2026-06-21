package recursion.questions;

public class CountZeros_In_Number {
    public static void main(String[] args) {
        ZeroCounter(5005, 0);
    }

    static void ZeroCounter(int n, int count){
        if(n%10 == n){
            if((n%10) == 0){
                count++;
            }
            System.out.println("Number of zero = "+ count);
            return;
        }
        if((n%10) == 0){
            count++;
        }
        ZeroCounter(n/10, count);
    }
}
