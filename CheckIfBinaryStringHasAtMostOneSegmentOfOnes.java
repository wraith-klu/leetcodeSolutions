public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1001";
        boolean ans = checkOnesSegment(s);
        System.out.println("Does the binary string have at most one segment of ones? " + ans);
    }
    /*
    LeetCode Problem - 1784, Link: https://leetcode.com/problems/check-if-a-string-is-an-increasing-sequence-of-sorts/
    Logic:
        1. A binary string has at most one segment of ones if it does not contain the substring "01".
        2. If the string contains "01", it means there are multiple segments of ones.
        3. If the string does not contain "01", it means there is at most one segment of ones.
        Example:
            - "1100" contains "01", so it has multiple segments of ones.
            - "111000" does not contain "01", so it has at most one segment of ones.
            - "000111000" is not a valid binary String because s should not have leading zeros, so it does not satisfy the condition of having at most one segment of ones.

    Time Complexity: O(n) - We iterate through the string once to check for the presence of "01".
    Space Complexity: O(1) - We use only a constant amount of extra space.
    */
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");   // If the string contains "01", it means there are multiple segments of ones. If it does not contain "01", it means there is at most one segment of ones.
    }
}
