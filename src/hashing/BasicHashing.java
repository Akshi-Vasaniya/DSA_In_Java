package hashing;

public class BasicHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 2, 1};
        int[] qurArr = {1, 2, 3, 4};

//        numberHashing(arr, qurArr);
        char[] chArr = {'a', 'b', 'a', 'c', 'b', 'b', 'z'};
        char[] chQurArr = {'a', 'b', 'z'};
        characterHashing(chArr, chQurArr);
    }

    static void numberHashing(int[] arr, int[] qurArr) {
        // Creating new Hash Arr
        int[] hash = new int[12];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }


        // Print the count of all the query numbers
        System.out.println("Count of query numbers");
        for (int i = 0; i < qurArr.length; i++) {
            System.out.println(qurArr[i] +" -> "+hash[qurArr[i]]);
        }
    }

    static void characterHashing(char[] chArr, char[] chQurArr) {
        // ASCII value
        // a -> 97 | z -> 122

        int[] hash = new int[26];

        for (int i = 0; i < chArr.length; i++) {
            int n = (int)(chArr[i]) - (int)'a';

            hash[n] += 1;
        }

        for (char ch: chQurArr) {
            System.out.println((int)(ch) +" -> "+hash[((int)(ch) - (int)'a')]);
        }
    }
}
