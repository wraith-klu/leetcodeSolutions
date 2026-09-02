import java.util.Arrays;

public class SmallestRange1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 17, 8, 10};
        int k = 7;
        System.out.println(smallestRange1(nums, k));
    }

    /*
    LeetCode Problem: 908, Link :- https://leetcode.com/problems/smallest-range-i
    Logic :
        1. We will sort the array.
        2. We will calculate the difference between the maximum and minimum elements after adding k to the minimum and subtracting k from the maximum.
        3. If the difference is greater than 0, we will return it. Otherwise, we will return 0.

    Time Complexity: O(n log n), since we are sorting the array.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables.
    */
    public static int smallestRange1(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = nums[nums.length-1] - (nums[0]+(2*k));
        if(ans>0){
            return ans;
        }
        return 0;
        
    }
}
