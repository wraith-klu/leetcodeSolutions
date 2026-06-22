import java.util.*;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        MaximumProductofTwoElementsinanArray solution = new MaximumProductofTwoElementsinanArray();
        int result = solution.maxProduct(nums);
        System.out.println(result);
    }
    /*
    LeetCode Problem : 1464, Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
    Logic:
        > First, we sort the input array to arrange the numbers in ascending order.
        > We then calculate the product of the two largest numbers in the sorted array, which are located at the last two indices (n-1 and n-2).
        > We subtract 1 from each of these two numbers before multiplying them together, as per the problem's requirement.
        > Finally, we return the calculated product as the result.  

    Time Complexity: O(n log n) due to the sorting step, where n is the number of elements in the input array.
    Space Complexity: O(1) if we ignore the space used by the sorting algorithm,
    */
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1] - 1) * (nums[n-2] - 1);
    }
}
