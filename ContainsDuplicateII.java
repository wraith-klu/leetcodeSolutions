import java.util.*;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
    }
    /*
    Leetcode Problem : 219, Link: https://leetcode.com/problems/contains-duplicate-ii/
    Logic :-
        > Create a HashSet to store the unique elements.
        > Traverse the array and check if the element is already in the HashSet.
        > If it is, then return true.
        > If it is not, then add the element to the HashSet.
        > If the size of the HashSet exceeds k, then remove the element that is k positions behind the current element.(Use a sliding window of size k to keep track of the last k elements)
        > If we traverse the entire array and do not find any nearby duplicates, then return false.
    */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(i >= k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    
}
