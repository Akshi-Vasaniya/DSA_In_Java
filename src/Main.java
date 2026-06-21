public class Main {
    public static void main(String[] args) {
        int n = 252;
        int pal = 0;

        while (n > 0) {
            int x = n%10;
            pal = (pal * 10) + x;
            n /= 10;
        }

        System.out.println(pal);
    }
}