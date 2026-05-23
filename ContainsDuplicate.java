import java.util.*;

// Leetcode Problem : 217, Link: https://leetcode.com/problems/contains-duplicate/

class ContainsDuplicate{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    /*
    Logic :-
        > Create a HashSet to store the unique elements.
        > Traverse the array and check if the element is already in the HashSet.
        > If it is, then return true.
        > If it is not, then add the element to the HashSet.
        > If we traverse the entire array and do not find any duplicates, then return false.
    */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}