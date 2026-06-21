package recursion.questions;

public class Palindrome {
    public static void main(String[] args) {
        int n = 454;

        // Checking num is palindrome or not.
        if(n == isNumPalind(n)){
            System.out.println("Yes it's Palindrome");
        } else{
            System.out.println("No it's not Palindrome");
        }
        System.out.println(isNumPalind(n));
    }

    // Reversing the number
    static int isNumPalind(int n){
        if (n == 0) return 0;

        return (n % 10) + isNumPalind(n / 10) * 10;
    }
}
