public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    private static boolean isPalindrome(int x) {
        int n = x;
        int revNum = 0;

        while (n != 0) {
            int temp = n%10;
            revNum = (revNum*10) + temp;
            n /= 10;
        }

        return revNum == x;
    }
}
