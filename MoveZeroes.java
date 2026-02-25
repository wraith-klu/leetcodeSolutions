import java.util.*;


// https://leetcode.com/problems/move-zeroes/description/


public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,0,3,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[j] != 0 && nums[i] == 0){
                swap(nums, i, j);
                i++;
            }
            else if(nums[i] !=0){
                i++;
            }
        }
        return;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
