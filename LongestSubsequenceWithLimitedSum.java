import java.util.*;

// https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/


public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] result = longestSubsequence(nums, queries);
        System.out.println(Arrays.toString(result));
    }
    public static int[] longestSubsequence(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] preSum = new int[n];
        preSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            preSum[i] = preSum[i-1] + nums[i];
        }

        int[] result = new int[queries.length];
        for(int i=0; i< queries.length; i++) {

            int s =0, e = n-1;
            int ans = -1;
            while(s<=e){
                int m = s + (e-s)/2;

                if(preSum[m]<= queries[i]){
                    ans = m;
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
            result[i] = ans+1;
        }
        return result;
    }
}