package com.dynamicprograms;

public class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = prices[0];
        int max = 0;

        for(int i = 1; i<prices.length; i++){
            max = max> prices[i]-minTillNow ? max : prices[i]-minTillNow;
            minTillNow = minTillNow < prices[i] ? minTillNow : prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
