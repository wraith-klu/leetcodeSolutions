public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        int result = maxAscendingSum(nums);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1800, Link: https://leetcode.com/problems/maximum-ascending-subarray-sum/
    Description: Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums. A subarray is defined as a contiguous sequence of numbers in an array. An ascending subarray is a subarray where each element is strictly greater than the previous one.
    Logic :
        1. We will iterate through the array and keep track of the current sum of the ascending subarray.
        2. If the current element is greater than the previous element, we will add it to the current sum.
        3. If the current element is not greater than the previous element, we will reset the current sum to the current element.
        4. We will keep track of the maximum sum encountered during the iteration and return it at the end.

    Time Complexity: O(n), where n is the length of the input array. We are iterating through the array once.
    Space Complexity: O(1), we are using a constant amount of space for variables.
    */
    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}