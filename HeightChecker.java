import java.util.*;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
    /*
    LeetCode Problem: 1051, Link :- https://leetcode.com/problems/height-checker
    Logic :
        1. We will create a copy of the heights array and sort it.
        2. We will iterate through the original heights array and the sorted array, and count the number of indices where the two arrays differ.
        3. Finally, we will return the count.

    Time Complexity: O(n log n), since we are sorting the array.
    Space Complexity: O(n), since we are creating a copy of the heights array.
    */
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int c = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                c++;
            }
        }
        return c;
    }
}
