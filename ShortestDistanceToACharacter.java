import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);
        System.out.println(Arrays.toString(result));
    }
    /*
    LeetCode Problem: 821, Link :- https://leetcode.com/problems/shortest-distance-to-a-character
    Logic :
        1. We will use two passes to calculate the shortest distances.
        2. In the first pass (left to right), we will calculate the distance from each character to the nearest occurrence of the target character on its left.
        3. In the second pass (right to left), we will calculate the distance from each character to the nearest occurrence of the target character on its right.
        4. For each position, we will take the minimum of the distances calculated in both passes.

    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string twice.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables (excluding the output array).
    */
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        // Pass 1: Left to Right
        int prev = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        // Pass 2: Right to Left
        prev = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
