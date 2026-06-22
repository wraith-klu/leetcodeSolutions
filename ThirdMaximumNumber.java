import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 1};
        System.out.println(thirdMax(nums));
    }
    /*
    LeetCode Problem: 414, Link :- https://leetcode.com/problems/third-maximum-number
    Logic :
        1. We will remove duplicates from the array.
        2. We will sort the array in ascending order.
        3. If the length of the array is less than 3, we will return the maximum number.
        4. Otherwise, we will return the third maximum number.

    Time Complexity: O(n log n), where n is the length of the array, since we are sorting the array.
    Space Complexity: O(n), since we are creating a new array to store the distinct elements.
    */
    public static int thirdMax(int[] nums) {
        nums = Arrays.stream(nums).distinct().toArray(); // Remove duplicates
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }else if(n==1){
            return nums[0];
        }else if(n==2){
            return nums[1];
        }else{
            return nums[n-3];
        }
    }
}
