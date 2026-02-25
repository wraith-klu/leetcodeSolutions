// https://leetcode.com/problems/longest-palindromic-substring/description/


public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindromicSubstring(s);
        System.out.println(result);
    }

    public static String longestPalindromicSubstring(String s) {
        if(s.length() <= 1) return s;

        int st=0, e=0;
        for(int i=0; i<s.length(); i++) {

            int oddLen = expandAroundCenter(s, i, i);
            int evenLen = expandAroundCenter(s, i, i+1);

            int maxLen = Math.max(oddLen, evenLen);
            if(maxLen > e-st) {
                st = i - (maxLen-1)/2;
                e = i + maxLen/2;
            }
        }

        return s.substring(st, e+1);
    }

    public static int expandAroundCenter(String s, int l, int r) {
        
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}
