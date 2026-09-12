/*
Best time to buy and sell stock

Given an array arr of n integers, where arr[i] represents
price of the stock on the ith day. Determine the maximum
profit achievable by buying and selling the stock at most once.

Example:
Input: arr = [10, 7, 5, 8, 11, 9]
Output: 6

Buy at 5 and sell at 11
Profit = 11 - 5 = 6
*/

public class q30 {

    static int stockBuySell(int[] arr, int n) {

        int min = arr[0];
        int maxprofit = 0;

        for (int i = 1; i < n; i++) {

            int cost = arr[i] - min;

            maxprofit = Math.max(maxprofit, cost);

            min = Math.min(min, arr[i]);
        }

        return maxprofit;
    }

    public static void main(String[] args) {

        int[] prices = {10, 7, 5, 8, 11, 9};

        int n = prices.length;

        int result = stockBuySell(prices, n);

        System.out.println("Maximum Profit = " + result);
    }
}