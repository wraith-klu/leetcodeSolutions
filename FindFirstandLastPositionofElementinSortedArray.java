import java.util.*;

public class FindFirstandLastPositionofElementinSortedArray {

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
       
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int search(int[] nums, int target, boolean findStartIndex){
        int start =0;
        int end = nums.length - 1;

        int ans = -1;

        while (start<=end) {
            int mid = start + (end - start)/2;

            if(target<nums[mid]){
                end = mid -1;
            }else if(target> nums[mid]){
                start = mid +1;
            }else{
                ans = mid;

                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
