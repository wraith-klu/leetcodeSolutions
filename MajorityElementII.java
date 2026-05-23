import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> result = majorityElement(nums);
        System.out.println("The majority elements are: " + result);
    }
    /*
    Leetcode Problem : 229, Link: https://leetcode.com/problems/majority-element-ii/
    Logic :-
        > Use a HashMap to store the frequency of each element.
        > Traverse the array and update the frequency of each element.
        > Check if the frequency of any element is greater than n/3.
        > If it is, then add the element to the result list.
    */
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int k : map.keySet()){
            if(map.get(k) > nums.length / 3){
                ans.add(k);
            }
        }

        return ans;
    }
}
