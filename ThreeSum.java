import java.util.*;

// https://leetcode.com/problems/3sum/?envType=problem-list-v2&envId=array

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){

            // Skip duplicates for the first element
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    /* If left and right value will be same, 
                    we'll get duplicate triplete 
                    so we need to prevent these duplicate triplete */

                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;


                    l++;
                    r--;
                } else if(sum < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
