import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int goodPairsCount = numIdenticalPairs(nums);
        System.out.println("The number of good pairs is: " + goodPairsCount);
    }
    /*
    LeetCode Problem: 1512, Link :- https://leetcode.com/problems/number-of-good-pairs
    Logic :
        1. We will use a HashMap to store the frequency of each number in the input array.
        2. For each number in the array, we will check if it has been seen before.
        3. If it has been seen, we will add its frequency to the total number of pairs.
        4. We will then increment the frequency of the current number in the HashMap.
        5. Finally, we will return the total number of pairs.

    Time Complexity: O(n), where n is the length of the input array, since we are iterating through the array once.
    Space Complexity: O(n), since we are using a HashMap to store the frequencies of the numbers.
    */
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        for (int num : nums) {
            pairs += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return pairs;
    }
}
