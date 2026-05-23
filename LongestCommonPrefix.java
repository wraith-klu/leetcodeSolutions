public class LongestCommonPrefix {

// https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestPrefixCount(strs);
        System.out.println("Longest common prefix: " + result);
    }

    /*
    Leetcode Problem : 14, Link: https://leetcode.com/problems/longest-common-prefix/
    Logic:
        > Initialize an empty string to store the common prefix.
        > Iterate through the characters of the first string.
        > For each character, check if it exists at the same position in all other strings.
        > If it does, append it to the common prefix.
        > If it doesn't, return the current common prefix.
        > If we reach the end of the first string, return the common prefix.
    */

    public static String longestPrefixCount(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String newStr = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return newStr;
                }
            }
            newStr += ch;
        }
        return newStr;
    }
}
