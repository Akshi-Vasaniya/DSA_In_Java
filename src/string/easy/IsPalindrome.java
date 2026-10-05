package string.easy;

import recursion.questions.Patterns;

import java.util.regex.Pattern;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "0P";

        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i+1);
            if (Pattern.matches("[a-z0-9]", a)) {
                newStr.append(a);
            }
        }


        StringBuilder copy = new StringBuilder(newStr.toString());

        return copy.compareTo(newStr.reverse()) == 0;
    }
}
