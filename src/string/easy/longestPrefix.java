package string.easy;

public class longestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        boolean check = true;

        for (int i = 0; i < strs[0].length(); i++) {
            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != strs[0].charAt(i)) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                break;
            } else {
                prefix.append(strs[0].charAt(i));
            }
        }

        return prefix.toString();
    }
}
