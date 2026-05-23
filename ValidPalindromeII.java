// Leetcode Problem - 680, Link: https://leetcode.com/problems/valid-palindrome-ii/

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    /*
    Valid Palindrome II Algorithm : -
        We can use a two-pointer approach to check if the string is a palindrome.
        We maintain two pointers, one at the beginning and one at the end of the string.
        We compare the characters at these pointers. If they are equal, we move both pointers towards the center.
        If they are not equal, we have two options:
            1. Skip the left character and check if the remaining substring is a palindrome.
            2. Skip the right character and check if the remaining substring is a palindrome.
        If either of these options returns true, then the original string can be considered a valid palindrome after removing at most one character.
    */

    public static boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }
    
    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
