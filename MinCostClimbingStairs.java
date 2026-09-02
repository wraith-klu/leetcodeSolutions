import java.util.*;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = { 10, 15, 20 };
        int minCost = minCostClimbingStairs(cost);
        System.out.println("Minimum cost to reach the top: " + minCost);
    }
    /*
    LeetCode Problem : 746, Link: https://leetcode.com/problems/min-cost-climbing-stairs/
    Description: 
                You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
                Once you pay the cost, you can either climb one or two steps. 
                You can either start from the step with index 0, or the step with index 1. 
                Return the minimum cost to reach the top of the floor.
                
    Logic:
        > Create a dp array of size n + 1 to store the minimum cost to reach each step.
        > Initialize the dp array with -1 to indicate that the values are not yet computed.
        > Use a recursive function minCost to calculate the minimum cost to reach each step.
        > The base case is when the index i is greater than or equal to the length of the cost array, in which case we return 0.
        > If the value for dp[i] is already computed, return it.
        > Otherwise, compute the minimum cost to reach step i by adding the cost of step i and the minimum of the costs to reach steps i + 1 and i + 2.
        > Store the computed value in dp[i] and return it.

    Time Complexity: O(n), where n is the number of steps, because we are computing the minimum cost for each step only once.
    Space Complexity: O(n), because we are using an additional array of size n + 1 to store the computed minimum costs.
    */
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, 0, dp), minCost(cost, 1, dp));
    }
    public static int minCost(int[] cost, int i, int[] dp) {
        if (i >= cost.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        return dp[i] = cost[i] + Math.min(minCost(cost, i + 1, dp), minCost(cost, i + 2, dp));
    }

}
