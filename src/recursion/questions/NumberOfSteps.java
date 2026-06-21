package recursion.questions;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return steps(8, 0);
    }

    static int steps(int n, int step){
        if(n == 0){
            return step;
        }
        if(n % 2 == 0){
            n /= 2;
            step++;
            return steps(n, step);
        } else{
            n -= 1;
            step++;
            return steps(n, step);
        }
    }
}
