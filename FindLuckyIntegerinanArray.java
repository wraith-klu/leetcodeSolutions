import java.util.*;

public class FindLuckyIntegerinanArray{
    public static void main(String[] args){
        int[] arr = {2,2,3,4};
        int result = findLucky(arr);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1394, Link :- https://leetcode.com/problems/find-lucky-integer-in-an-array
    Logic :
        1. We will create a HashMap to store the frequency of each number in the array.
        2. We will iterate through the array and update the frequency of each number in the HashMap.
        3. We will iterate through the HashMap and check if the frequency of a number is equal to the number itself.
        4. If it is, we will update the maximum lucky integer found so far.
        5. Finally, we will return the maximum lucky integer found, or -1 if no lucky integer was found.

    Time Complexity: O(n), where n is the length of the array, since we are iterating through the array once.
    Space Complexity: O(m), where m is the number of unique numbers in the array, since we are using a HashMap to store the frequency of each number.
    
    */
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int n:arr){
            m.put(n, m.getOrDefault(n, 0)+1);
        }
        int z = -1;
        for(Map.Entry<Integer, Integer> entry: m.entrySet()){
            if (entry.getValue().equals(entry.getKey())) {
                z = Math.max(z, entry.getKey());
            }
        }
        return z;
    }
}