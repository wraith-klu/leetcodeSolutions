public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        String result = toLowerCase(s);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 709, Link :- https://leetcode.com/problems/to-lower-case
    Logic :
        1. We will use the built-in toLowerCase() method of the String class.
    
    Time Complexity: O(n), where n is the length of the input string.
    Space Complexity: O(n), since we are creating a new string with the lowercase characters.
    */
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
