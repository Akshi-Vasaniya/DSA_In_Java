public class Patterns {
    public static void main(String[] args) {
        int n = 5;

//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern7(n);
        pattern8(n);
        
    }

    private static void pattern8(int n) {
        /*
             **********
             ****  ****
             ***    ***
             **      **
             *        *
             *        *
             **      **
             ***    ***
             ****  ****
             **********
        * */
        int x = 1;
        for (int i = 0; i < (n*2); i++) {
            // Printing first triangle
            int stars = i < n? n-i : i-n+1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // Print Space
            int space = (i < n) ? i+i : 2 * (2 * n - i - 1);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Print Second triangle
//            int stm3 = i < n? n-i : i-n+2;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        /*
                A
               ABA
              ABCBA
             ABCDCBA
            ABCDEDCBA
        * */
        int x = 0;
        for (int i = 65; i < (65+n); i++) {
            // Print Space
            for (int j = 1; j < n-x; j++) {
                System.out.print(" ");
            }
            x++;

            // Print First Half
            for (int j = 65; j <= i; j++) {
                System.out.print((char)j);
            }

            // Print Second Half
            for (int j = i-1; j >=65; j--) {
                System.out.print((char)j);
            }

            System.out.println();
        }
    }

    private static void pattern6(int n) {
        /*
                A
                AB
                ABC
                ABCD
                ABCDE
         */
        for (int i = 65; i <= (64+n); i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        /*
                1       1
                12     21
                123  321
                12344321
         */
        int space = (n-1)*2;
        for (int i = 1; i < n ; i++) {
            space -= i;
            // Print first triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print space
            for (int j = space; j > 0 ; j--) {
                System.out.print(" ");
            }

            // Print Second triangle
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    private static void pattern4(int n) {
        /*
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
         */
        
        for (int i = 1; i < n*2; i++) {
            int stam = (i <= n)? i : n*2 - i;

            for (int j = 0; j < stam; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern3(int n) {
        /*
                       *
                     * * *
                    * * * * *
                 * * * * * * *
               * * * * * * * * *
               * * * * * * * * *
                 * * * * * * *
                   * * * * *
                     * * *
                       *
         */

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
