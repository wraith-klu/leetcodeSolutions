import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity/submissions/1930498733/?envType=problem-list-v2&envId=two-pointers

public class SortArrayByParity {
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else {
                swap(nums, i, j);
                j--;
            }
        }   
        return nums;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}