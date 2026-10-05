package string.easy;

public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "52";

        System.out.println(largestOddNumber(str));
    }

    public static String largestOddNumber(String num) {
//        int n = Integer.parseInt(num);

        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1 - i)));
            if (n % 2 != 0) {
                return num.substring(0, num.length()- i);
            }
        }



        return "";
    }
}
