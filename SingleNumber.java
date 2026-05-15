import java.util.HashMap;

// LeetCode Problem : 136, Link: https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int singleNumber = findSingleNumber(arr);
        System.out.println("The single number is: " + singleNumber);
        int singleNumberWithHashMap = findSingleNumberWithHashMap(arr);
        System.out.println("The single number using HashMap is: " + singleNumberWithHashMap);
    }
    /*  Single Number Algorithm : - 
            uisng XOR operation, we can find the single number in linear time and constant space. 
            The XOR operation has a property that a number XORed with itself is 0, and a number XORed with 0 is the number itself. 
            Therefore, if we XOR all the numbers in the array, the pairs of duplicate numbers will cancel each other out, leaving us with the single number that appears only once.
    */

    public static int findSingleNumber(int[] arr) {
        int r = 0;
        for (int num : arr) {
            r ^= num; // XOR operation
        }
        return r;
    }

    /* HashMap Approach :- 
            Create a HashMap to store the count of each number in the array.
            Iterate through the array and update the count of each number in the HashMap. 
            After processing the array, iterate through the HashMap to find the number that has a count of 1, which is the single number.                          
    */

    public static int findSingleNumberWithHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

}
