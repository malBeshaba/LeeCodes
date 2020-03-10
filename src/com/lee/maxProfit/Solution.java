package com.lee.maxProfit;

public class Solution {
    //暴力解
    public int maxProfit1(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i ++) {
            for (int j = i + 1; j < prices.length; j ++) {
                profit = Math.max((prices[j] - prices[i]), profit);
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {

        int profit = 0;
        if (prices.length == 0)
            return profit;
        int minAmount = prices[0];
        for (int i = 0; i < prices.length; i ++) {
            if (prices[i] - minAmount > profit)
                profit = prices[i] - minAmount;
            else if (prices[i] < minAmount)
                minAmount = prices[i];
        }
        return profit;
    }
}
