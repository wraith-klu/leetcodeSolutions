import java.util.*;

public class TwoSum {

// https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;

        int result[] = twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
    /*
    Leetcode Problem : 1, Link: https://leetcode.com/problems/two-sum/
    Logic:
        > Use a HashMap to store the elements of the array along with their indices.
        > For each element in the array, calculate its complement (target - element).
        > Check if the complement exists in the HashMap.
        > If it does, return the indices of the current element and its complement.
        > If not, add the current element and its index to the HashMap.
        > If no such pair is found, return an empty array.
    */

    public static int[] twoSumUsingHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0]; 
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
