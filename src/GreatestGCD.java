public class GreatestGCD {
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
//        System.out.println(6/3);
    }

    public static int gcd(int a, int b) {
        /*// code here
        int gcd = 1;

        int min = Math.min(a, b);

        for (int i = 2; i <= min/2; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }

        if ((gcd == 1) && (Math.max(a, b) % min == 0)) {
            gcd = min;
        }

        return gcd;*/

        // Optimize version
        int gcd = 1;
        for (int i = Math.min(a, b)/2; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}
