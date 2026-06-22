public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean ans = rotateString(s, goal);
        System.out.println("Can " + s + " be rotated to form " + goal + "? " + ans);
    }
    /*
    LeetCode Problem - 796, Link: https://leetcode.com/problems/rotate-string/
    Logic:
        1. First, we check if the lengths of the two strings s and goal are the same. If they are not, we can immediately return false, as a rotation cannot change the length of the string.
        2. Next, we concatenate the string s with itself. This creates a new string that contains all possible rotations of s as contiguous substrings.
        3. Finally, we check if the string goal is a substring of the concatenated string. If it is, then s can be rotated to form goal, and we return true; otherwise, we return false.    
    
    Time Complexity: O(n) - The concatenation and substring check both take linear time relative to the length of the strings.
    Space Complexity: O(n) - The concatenated string takes up additional space proportional to the length of the input string s.
    */
    public static boolean rotateString(String s, String goal) {
        // Check if the lengths of s and goal are the same
        if (s.length() != goal.length()) {
            return false;
        }
        // Concatenate s with itself and check if goal is a substring of the concatenated string
        String concatenated = s + s;
        return concatenated.contains(goal);
    }
}
