import java.util.*;

public class MaximumElementAfterDecreasingAndRearranging{
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 80, 1};
        int result = maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1846, Link :- https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging
    Logic :
        1. We will sort the array in non-decreasing order.
        2. We will set the first element to 1, since we can decrease it to 1.
        3. For each subsequent element, we will set it to the minimum of its current value and the previous element + 1.
        4. Finally, we will return the last element of the array, which will be the maximum possible value after rearranging and decreasing.    
    
    Time Complexity: O(n log n), since we are sorting the array.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables.
    */
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }

        return arr[arr.length - 1];
    }
}