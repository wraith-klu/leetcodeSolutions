public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    /*
    LeetCode Problem : 121, Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    Logic:
        > Initialize two variables: minPrice to store the minimum price encountered so far, and maxProfit to store the maximum profit.
        > Iterate through each price in the array:
            - Update minPrice if the current price is lower than minPrice.
            - Calculate the potential profit by subtracting minPrice from the current price, and update maxProfit if this potential profit is greater than the current maxProfit.
        > Return maxProfit after iterating through all prices.

    Time Complexity: O(n), where n is the number of prices, because we need to iterate through the array once.
    Space Complexity: O(1), because we are using only a constant amount of extra space for the variables minPrice and maxProfit.
    */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);

        }
        return maxProfit;
    }
}
