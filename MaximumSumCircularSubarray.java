public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        int result = maxSubarraySumCircular(nums);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 918, Link: https://leetcode.com/problems/maximum-sum-circular-subarray/
    Description: Given a circular integer array nums, return the maximum possible sum of a non-empty subarray of nums.
    Logic:
        1. We will use Kadane's algorithm to find the maximum and minimum subarray sums.
        2. The maximum subarray sum can be either:
            a. The maximum subarray sum in the normal array (using Kadane's algorithm).
            b. The total sum of the array minus the minimum subarray sum (for circular case).
        3. If all numbers are negative, we return the maximum number (maxSum).
        
    Time Complexity: O(n), where n is the length of the input array. We are iterating through the array once.
    Space Complexity: O(1), we are using a constant amount of space for variables.
    */
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int num : nums) {
            totalSum += num;

            //Kadane's Algorithm for maximum subarray sum
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            //Kadane's Algorithm for minimum subarray sum
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);
        }

        // If all numbers are negative, return the maximum number (maxSum)
        if (maxSum < 0) {
            return maxSum;
        }

        // Return the maximum of non-circular and circular subarray sums
        return Math.max(maxSum, totalSum - minSum);
    }
}
