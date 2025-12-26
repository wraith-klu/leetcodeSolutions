import java.util.*;

// https://leetcode.com/problems/next-permutation/description/?envType=problem-list-v2&envId=array

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        /* Find the pivot which is the first element from the end that is smaller than its next element */
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i>=0){
            /* Find the rightmost successor to the pivot */
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            /* Swap the pivot with its successor */
            swap(nums, i, j);
        }
        /* Reverse the suffix starting right after the pivot */
        reverse(nums, i + 1, n - 1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
