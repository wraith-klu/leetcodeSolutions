public class NumberofSegmentsinaString {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
    /*
    LeetCode Problem: 434, Link :- https://leetcode.com/problems/number-of-segments-in-a-string
    Logic :
        1. We will trim the input string to remove leading and trailing spaces.
        2. If the trimmed string is empty, we will return 0.
        3. Otherwise, we will split the string by one or more whitespace characters and return the length of the resulting array.

    Time Complexity: O(n), where n is the length of the input string.
    Space Complexity: O(n), for storing the split segments.
    */
    public static int countSegments(String s) {
        s = s.trim();

        if(s.isEmpty()){
            return 0;
        }
        return s.split("\\s+").length;
    }
}
