public class LongestCommonPrefix {

// https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestPrefixCount(strs);
        System.out.println("Longest common prefix: " + result);
    }

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
