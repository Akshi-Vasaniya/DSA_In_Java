public class Patterns {
    public static void main(String[] args) {
        int n = 5;

//        pattern1(n);
//        pattern2(n);
        pattern3(n);
    }

    private static void pattern3(int n) {
        for (int i = 0; i < n*2; i++) {

            // Printing spaces
            int statement1 = (i < n) ? n-1-i : i-n;
            for (int j = 0; j < statement1; j++) {
                System.out.print("  ");
            }

            int statement2 = (i < n) ? i + i + 1 : 2*(2*n - i) - 1;
            for (int j = 0; j < statement2; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern2(int n) {
        /*
         * * * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  *
         */

        for (int i = 0; i < n; i++) {
            // Two loops
            // Loop-1: Printing space
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Loop-2: Printing Stars
            for (int j = n*2-i*2-1; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern1(int n) {
           /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
            */

        for (int i = 0; i < n; i++) {
            // Required two loops
            // Loop-1: Print Space
            for (int j = n-1-i; j > 0; j--) {
                System.out.print("  ");
            }

            // Loop-2: Print Stars
            for (int j = 0; j < i+i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
