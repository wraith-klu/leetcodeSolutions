// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;                                      
    int start = 0;                                      
    int[] index = new int[128];                           /* Array to store the **last seen position + 1** of each ASCII character
                                                            Size 128 because standard ASCII has 128 characters */

    // Loop through the string using 'end' as the end index of the sliding window
    for (int end = 0; end < s.length(); end++) {
        char currentChar = s.charAt(end);                 // Get the current character at position 'end'

        /* Update the start of the window:
           If the current character was seen after 'start', move 'start' to avoid duplicate */

        start = Math.max(index[currentChar], start);

        /* Update the maxLength:
           Length of current window = end - start + 1  */

        maxLength = Math.max(maxLength, end - start + 1);

        /* Update the last seen index of current character to 'end + 1'
           +1' is used to differentiate default 0 from actual index 0 */

        index[currentChar] = end + 1;
    }

    return maxLength;                  // Return the length of the longest substring without repeating characters
}

}
