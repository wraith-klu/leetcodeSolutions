// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    /*
    Leetcode Problem : 3, Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
    Logic:
        > Use a HashSet to store the unique characters in the current substring.
        > Use two pointers (left and right) to represent the current substring.
        > Move the right pointer to expand the substring until a duplicate character is found.
        > When a duplicate character is found, move the left pointer to shrink the substring until the duplicate character is removed from the HashSet.
        > Keep track of the maximum length of the substring without repeating characters during this process.
        > Return the maximum length found.

    Time Complexity: O(n), where n is the length of the string, because each character is visited at most twice (once by the right pointer and once by the left pointer).
    Space Complexity: O(min(m, n)), where m is the size of the character set (in this case, 26 for lowercase English letters) and n is the length of the string, because the HashSet will store at most min(m, n) characters.
    */
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0; 
        int maxLength = 0;
        for(j=0; j<s.length(); j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }














//     public static int lengthOfLongestSubstring(String s) {
//     int maxLength = 0;                                      
//     int start = 0;                                      
//     int[] index = new int[128];                            Array to store the **last seen position + 1** of each ASCII character
//                                                             Size 128 because standard ASCII has 128 characters */

//     Loop through the string using 'end' as the end index of the sliding window
//     for (int end = 0; end < s.length(); end++) {
//         char currentChar = s.charAt(end);                 // Get the current character at position 'end'

        /* Update the start of the window:
           If the current character was seen after 'start', move 'start' to avoid duplicate */

//         start = Math.max(index[currentChar], start);

//          Update the maxLength:
//            Length of current window = end - start + 1  

//         maxLength = Math.max(maxLength, end - start + 1);

//         Update the last seen index of current character to 'end + 1'
//            +1' is used to differentiate default 0 from actual index 0 

//         index[currentChar] = end + 1;
//     }

//     return maxLength;                  // Return the length of the longest substring without repeating characters
// }

}
