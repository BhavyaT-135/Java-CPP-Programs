package com.striver.arrays_I;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int j = 0; j < prices.length; j++) {
            if (min < prices[j]) {
                min = prices[j];
            }
        }
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (prices[i] - min > ans) {
                ans = prices[i] - min;
            }
        }
        return ans;
    }
}