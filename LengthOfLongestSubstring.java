import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcdaeaf";
        int result = ans(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);

    }
    /*
    Question:-
        You are given a string consisting of lowercase English characters, 
        and your task is to find the length of the longest substring without repeating characters.
    Logic:
        > Use a HashSet to store the unique characters in the current substring.
        > Use two pointers (left and right) to represent the current substring.
        > Iterate through the string with the right pointer, adding characters to the HashSet.
        > If a character is already in the HashSet, move the left pointer to the right until the duplicate character is removed from the HashSet.
        > Update the maximum length of the substring whenever a new character is added to the HashSet.
        > Return the maximum length found.

    Time Complexity: O(n), where n is the length of the string, because each character is visited at most twice (once by the right pointer and once by the left pointer).
    Space Complexity: O(min(m, n)), where m is the size of the character set (in this case, 26 for lowercase English letters) and n is the length of the string, because the HashSet will store at most min(m, n) characters.
     */
    public static int  ans(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    } 
    
}
