import java.util.*;

public class MaximumGap {
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        MaximumGap solution = new MaximumGap();
        int result = solution.maximumGap(nums);
        System.out.println(result);
    }
    /*
    LeetCode Problem : 164, Link: https://leetcode.com/problems/maximum-gap/
    Logic:
        > First, we check if the length of the input array is less than 2. If it is, we return 0 since we cannot have a gap.
        > We then sort the input array to arrange the numbers in ascending order.
        > We initialize a variable maxGap to keep track of the maximum gap found and an index i to keep track of the previous number.
        > We iterate through the sorted array starting from the second element (index 1) and calculate the gap between the current number and the previous number (nums[j] - nums[i]).
        > We update maxGap if the calculated gap is greater than the current maxGap.
        > Finally, we return maxGap as the result.

    Time Complexity: O(n log n) due to the sorting step, where n is the number of elements in the input array.
    Space Complexity: O(1) if we ignore the space used by the sorting algorithm, otherwise O(n) if the sorting algorithm used is not in-place.
    
    */
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int maxGap = 0, i=0;
        for(int j=1; j<n; j++) {
            maxGap = Math.max(maxGap, nums[j] - nums[i]);
            i++;
        }
        return maxGap;
    }
}