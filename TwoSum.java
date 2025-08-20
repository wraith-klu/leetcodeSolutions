import java.util.Arrays;

public class TwoSum {

// https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;

        int result[] = twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; 
    }
}
