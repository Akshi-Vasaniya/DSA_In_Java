package recursion.questions;

public class NthNumber_Factorial {
    public static void main(String[] args) {
        factorial(5, 1);

        System.out.println("Factorial: "+ fact(5));
    }

    static void factorial(int n, int fact){
        if(n == 1){
            System.out.println("Factorial: "+fact);
            return;
        }
        fact *= n;
        factorial(n-1, fact);;
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }

        return n * fact(n - 1);
    }
}
