public class BestTimetoBuyandSellStockTwo {

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
    /*
    LeetCode Problem : 122, Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    Logic:
        > Initialize a variable totalProfit to store the total profit.
        > Iterate through the prices array starting from the second price:
            - If the current price is greater than the previous price, it means we can make a profit by buying at the previous price and selling at the current price. So, we add the difference (current price - previous price) to totalProfit.
        > Return totalProfit after iterating through all prices.

    Time Complexity: O(n), where n is the number of prices, because we need to iterate through the array once.
    Space Complexity: O(1), because we are using only a constant amount of extra space for the variable totalProfit.
    */
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
