import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity-ii/?envType=problem-list-v2&envId=two-pointers

public class SortArrayByParity2 {
    public static void main(String[] args) {
        int[] nums =  {2, 4, 6, 3, 5, 9};

        int[] result = sortArrayByParityII(nums);

        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrayByParityII(int[] nums){
        int i=0, j=1;
        while (i<nums.length && j<nums.length) {
            if(nums[i]%2 == 0) i += 2;
            else if(nums[j]%2 ==1) j += 2;
            else {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        return nums;
    }
}
