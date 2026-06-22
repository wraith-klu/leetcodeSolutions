import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        String[] ranks = findRelativeRanks(score);
        System.out.println(Arrays.toString(ranks));
    }
    /*
    LeetCode Problem: 506, Link :- https://leetcode.com/problems/relative-ranks
    Logic :
        1. We will create a clone of the score array and sort it in ascending order.
        2. We will create a HashMap to store the rank of each score.
        3. We will iterate through the sorted array and store the rank of each score in the HashMap.
        4. We will create a result array and iterate through the original score array, getting the rank from the HashMap and assigning the appropriate medal or rank to the result array.

    Time Complexity: O(n log n), where n is the length of the score array, since we are sorting the array.
    Space Complexity: O(n), since we are using a HashMap to store the ranks and a result array to store the final ranks.
    */
    public static String[] findRelativeRanks(int[] score) {
        int[] c = score.clone();
        int n = c.length;
        Arrays.sort(c);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            map.put(c[i], n - i);
        }
        String[] r = new String[n];
        for (int i = 0; i < n; i++) {
            int z = map.get(score[i]);
            if (z == 1) {
                r[i] = "Gold Medal";
            } else if (z == 2) {
                r[i] = "Silver Medal";
            } else if (z == 3) {
                r[i] = "Bronze Medal";
            } else {
                r[i] = String.valueOf(z);
            }
        }
        return r;
    }
}
