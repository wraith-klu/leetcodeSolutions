import java.util.Arrays;

class MinimumCostofBuyingCandiesWithDiscount {
    public static void main(String[] args) {
        int[] cost = {1, 2, 3};
        int minimumCost = minimumCost(cost);
        System.out.println("Minimum cost to buy all candies: " + minimumCost);
    }
    /*
    LeetCode Problem : 2144, Link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
    Logic:
        > Sort the cost array in ascending order.
        > Initialize a variable sum to store the total cost, and a counter c to count the number of candies bought.
        > Iterate through the sorted cost array from the most expensive candy to the least expensive:
            - Increment the counter c for each candy bought.
            - If c is a multiple of 3, it means we get a discount on that candy, so we reset the counter and skip adding its cost to the sum.
            - Otherwise, we add the cost of that candy to our total sum.
        > After iterating through all candies, return the total sum as the minimum cost to buy all candies.

    Time Complexity: O(n log n) due to the sorting step, where n is the number of candies. The iteration through the cost array takes O(n).
    Space Complexity: O(1) if we ignore the space used by the sorting algorithm, or O(n) if the sorting algorithm used is not in-place.
    Note:-
        Arrays.sort() in Java uses a dual-pivot quicksort for primitive types, which is an in-place sorting algorithm, 
        so the space complexity can be considered O(1) in this case.
    */
    public static int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int sum =0, c=0;
        for(int i= n-1; i>=0; i--){
            c++;
            if(c%3==0) {
                c=0;
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}