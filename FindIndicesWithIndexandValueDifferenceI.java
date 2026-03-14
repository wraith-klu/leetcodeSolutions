import java.util.*;

// https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/description/?envType=problem-list-v2&envId=two-pointers

public class FindIndicesWithIndexandValueDifferenceI {
    public static void main(String[] args) {
        int[] nums = {5,1,4,1};
        int indexDifference = 2;
        int valueDifference = 4;
        int[] result = findIndices(nums, indexDifference, valueDifference);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;

        int minIdx = 0, maxIdx = 0;
        for(int j = indexDifference; j < n; j++){
            int i = j - indexDifference;

            if(nums[i]<nums[minIdx]) minIdx= i;   // Update minIdx if current element is smaller because we need to find the smallest element in the window of indexDifference
            if(nums[i]>nums[maxIdx]) maxIdx= i;   // Update maxIdx if current element is larger because we need to find the largest element in the window of indexDifference

            if(Math.abs(nums[j] - nums[minIdx]) >= valueDifference) return new int[] {minIdx, j};   // Check if the difference between the current element and the smallest element in the window of indexDifference is greater than or equal to valueDifference because we need to find the indices with the smallest difference
            if(Math.abs(nums[j] - nums[maxIdx]) >= valueDifference) return new int[] {maxIdx, j};   // Check if the difference between the current element and the largest element in the window of indexDifference is greater than or equal to valueDifference because we need to find the indices with the largest difference
        }
        return new int[] {-1, -1};
    }
}
