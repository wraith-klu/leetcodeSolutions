public class MaximumSubArraySum {

    // https://leetcode.com/problems/maximum-subarray/description/
    
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
    /*

    Kadane's Algorithm: - 
                    Kadane's algorithm is an efficient way to find the maximum subarray sum in linear time. 
                    The idea is to iterate through the array while keeping track of the current sum of the subarray and the maximum sum found so far. 
                    Time complexity of this algorithm is O(n) and space complexity is O(1).
        Steps :-
            1. Initialize two variables, currentSum and maxSum, to the first element of the array.
            2. Iterate through the array starting from the second element:
                a. Update currentSum to be the maximum of the current element and the sum of currentSum and the current element.
                b. Assign Max of currentSum and maxSum to maxSum.
            3. After iterating through the array, maxSum will contain the maximum subarray sum, which is returned as the result.

    */
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
