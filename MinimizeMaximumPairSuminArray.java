import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        int result = minimizeMax(nums);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1877, Link :- https://leetcode.com/problems/minimize-maximum-pair-sum-in-array
    Logic :
        1. We will sort the input array in ascending order.
        2. We will use two pointers, one starting from the beginning of the array and the other starting from the end of the array.
        3. We will calculate the sum of the elements at the two pointers and keep track of the maximum sum encountered.
        4. We will move the pointers towards each other until they meet.

    Time Complexity: O(n log n), where n is the length of the input array, since we are sorting the array.
    Space Complexity: O(1), since we are using a constant amount of extra space for the pointers and the variable to track the maximum sum.
    
    */
    public static int minimizeMax(int[] nums) {
        Arrays.sort(nums);
        int s=0, i=0, j=nums.length-1;
        while(i<j){
            s = Math.max(s, nums[i]+nums[j]);
            i++;
            j--;
        }
        return s;
    }
}
