// https://leetcode.com/problems/longest-continuous-increasing-subsequence/?envType=problem-list-v2&envId=array

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        int result = findLengthOfLCIS(nums);
        System.out.println(result); 
    }
     public static int findLengthOfLCIS(int[] nums) {
        int i=0, j=1, ans = 1, l =1;
        while(j<nums.length){
            
            if(nums[i]<nums[j]){
                l++;
            }else{
                l=1;
            }

            if(l>ans){
                ans = l;
            }
            i++;
            j++;
        }
        return ans;
    }
}
