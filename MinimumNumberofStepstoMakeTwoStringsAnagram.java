public class MinimumNumberofStepstoMakeTwoStringsAnagram {

// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/

/*
Core Logic Summary:

    Count frequency of each character in s and t.
    For each character, check how many are missing in t compared to s.
    Sum up all the missing counts = minimum replacements needed.

*/
    public static void main(String[] args) {
        String s = "anagram";
        String t = "mangaar";
        int result = minSteps(s, t);
        System.out.println("Minimum steps to make anagram: " + result);
    }
    public static int minSteps(String s, String t) {
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;   // Count characters of s
        }
        
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;   // Subtract characters of t
        }
        
        int steps = 0;
        for (int count : freq) {
            if (count > 0) steps += count; // Count missing chars
        }
        return steps;
    }
    
}
