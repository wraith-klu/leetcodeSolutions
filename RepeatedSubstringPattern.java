public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        boolean result = repeatedSubstringPattern(s);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 459, Link :- https://leetcode.com/problems/repeated-substring-pattern
    Logic :
        1. We will concatenate the string with itself.
        2. Then we will check if the original string is present in the new string (excluding the first and last character).
        3. If it is present, then it means that the original string can be formed by repeating a substring.
    
    Time Complexity: O(n), where n is the length of the input string.
    Space Complexity: O(n), since we are creating a new string that is twice the length of the original string.
    */
    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);   // Check if the original string is present in the new string (excluding the first and last character).
    }
}
