public class ReverseInteger {
    public static void main(String[] args) {
        int x = -321;
        System.out.println(reverseNumber(x));
    }

    static int reverseNumber(int x) {
        int returnValue = 0;
        StringBuilder newStr = new StringBuilder();

        String str = String.valueOf(x);

        int stm = x < 0 ? 0 : -1;
        for (int i = str.length()-1; i > stm; i--) {
            newStr.append(str.charAt(i));
        }

        if (x < 0) {
            newStr.insert(0, '-');
        }

        long revNum = Long.parseLong(newStr.toString());

        if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
            return returnValue;
        } else {
            return (int) revNum;
        }
    }
}
