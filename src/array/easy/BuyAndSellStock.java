package array.easy;

public class BuyAndSellStock {
    public static void main(String[] args) {
        // Q: Best time to buy and sell stock
        // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
//        int min = 0;
//        int max = 0;
//        int i = 0;
//        int j = prices.length-1;
//        while (i < j) {
//            if (prices[i] < min) {
//                min = prices[i];
//            }
//
//            if (prices[j] > max) {
//                max = prices[j];
//            }
//            i++;
//            j--;
//        }
//
//        int x = max - min;
//        if (x >= 0) {
//            return x;
//        } else {
//            return 0;
//        }

        int i = 0;
        int n = prices.length;
        int profite = 0;

        while (i < n) {
            int current = prices[i];
            int j = i+1;

            while (j < n) {
                int x = prices[j] - prices[i];

                if (x > profite) {
                    profite = x;
                }
                j++;
            }
            i++;
        }

        return profite;
    }
}
