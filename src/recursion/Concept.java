package recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // It will generate error, bc what n-- means, it means first pass the no and then subtract it.
        // So it will always pass 5 again and again and then subtract, so n would always be equal to 5.
//        fun(n--);

        fun(--n); // this is called recursive tail (the last statement, which execute)
    }
}
