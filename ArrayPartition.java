// https://leetcode.com/problems/array-partition/description/?envType=problem-list-v2&envId=greedy

public class ArrayPartition {

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = arrayPairSum(nums);
        System.out.println("Maximized sum of pairs: " + result);
    }
    /*
    Leetcode Problem : 561, Link: https://leetcode.com/problems/array-partition/
    Question:-
        Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
    Logic:
        > Sort the array in ascending order.
        > Pair adjacent elements to maximize the sum of the minimum values of each pair.
        > Sum the first element of each pair (which will be the smaller one in each pair).

    Time complexity: O(n log n) due to sorting.
    Space complexity: O(1) as we are using only a constant amount of space for the variables.
     */
    public static int arrayPairSum(int[] nums) {
        java.util.Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
    // public static int arrayPairSum(int[] nums) {
    //     int[] freq = new int[20001];  // Range: -10000 to 10000
        
    //     // Count frequencies
    //     for (int num : nums) {
    //         freq[num + 10000]++;
    //     }
        
    //     int sum = 0;
    //     boolean isFirst = true;
        
    //     // Iterate through frequencies to form pairs
    //     for (int i = 0; i < freq.length; i++) {
    //         while (freq[i] > 0) {
    //             if (isFirst) {
    //                 sum += i - 10000;  // Convert back to original number
    //             }
    //             isFirst = !isFirst;
    //             freq[i]--;
    //         }
    //     }
        
    //     return sum;
    // }
}