import java.util.*;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] ans = leftRightDifference(nums);
        System.out.println("Left and Right Sum Differences: " + Arrays.toString(ans));
    }
    /*
    LeetCode Problem - 2574, Link: https://leetcode.com/problems/left-and-right-sum-differences/
    Logic:
        1. Create two arrays, leftSum and rightSum, to store the cumulative sums from the left and right sides respectively.
        2. Fill the leftSum array by iterating from the left and adding the previous element to the current element.
        3. Fill the rightSum array by iterating from the right and adding the next element to the current element.
        4. Finally, calculate the absolute difference between the leftSum and rightSum for each index and store it in the ans array, which is returned at the end.      
       
        
    Time Complexity: O(n) - We traverse the input array three times (once for left sums, once for right sums, and once for calculating differences).
    Space Complexity: O(n) - We use three additional arrays (leftSum, rightSum, and ans) of the same size as the input array.
    */
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n];

        // Calculate left sums
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        // Calculate right sums
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // Calculate the absolute difference between left and right sums
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}