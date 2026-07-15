package recursion.questions;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
    }

    private static void pattern1(int n) {
        if (n == -1) return;

        for (int i = n; i >= 0; i--) {
            System.out.print("* ");
        }
        System.out.println();

        pattern1(n-1);
    }


}
