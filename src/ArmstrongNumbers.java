public class ArmstrongNumbers {
    public static void main(String[] args) {
        isArmstrongNumbers(9474);
    }

    private static void isArmstrongNumbers(int n) {
        String str = String.valueOf(n);
        int no = str.length();

        int x = 0;
        int a = n;

        while (a != 0) {
            int temp = a % 10;
            x = x + (int)Math.pow(temp, no);
            a /= 10;
        }

        if (x == n) {
            System.out.println("Yes it's Armstrong Number!");
        } else {
            System.out.println("No it's not Armstrong Number!");
        }
    }
}
