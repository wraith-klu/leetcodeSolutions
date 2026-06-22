public class CheckifStringsCanbeMadeEqualWithOperationsI {
    public static void main(String[] args) {
        String s = "ab_cd", t = "abcd_";
        boolean ans = canBeEqual(s, t);
        System.out.println("Can the strings be made equal? " + ans);
    }
    /*
    LeetCode Problem - 2839, Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/
    Logic:
        1. We can iterate through the characters of both strings simultaneously.
        2. For each character at index i, we check if it matches either the character at index i or the character at index (i + 2) % 4 in the other string.
        3. If any character does not match either of these positions, we can conclude that the strings cannot be made equal.

    Time Complexity: O(n) - We iterate through the characters of the strings once.
    Space Complexity: O(1) - We use only a constant amount of extra space.
    */
    public static boolean canBeEqual(String s1, String s2) {
        int j=0;
        for(int i=0; i<4; i++){
            j = i+2;
            if(s1.charAt(i) != s2.charAt(j%4) && s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
