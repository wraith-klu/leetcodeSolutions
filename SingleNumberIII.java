import java.util.HashSet;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] result = singleNumber(nums);
        System.out.println("The two single numbers are: " + result[0] + " and " + result[1]);
    }
    /*
    LeetCode Problem: 260, Link :- https://leetcode.com/problems/single-number-iii
    Logic :
        1. We will use a HashSet to store the numbers.
        2. For each number in the input array, if it is already in the set, we will remove it; otherwise, we will add it.
        3. The remaining numbers in the set are the two single numbers.

    Time Complexity: O(n), where n is the length of the input array.
    Space Complexity: O(n), where n is the number of unique elements in the input array.
    */
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        int[] r = new int[set.size()];
        int i=0;
        for(int n:set){
            r[i] = n;
            i++;
        }
        return r;
    }
}
