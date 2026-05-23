import java.util.*;


public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println("Word pattern: " + result);
    }
    /*
    Leetcode Problem : 290, Link: https://leetcode.com/problems/word-pattern/
    Logic:
        > Split the string s into an array of words.
        > Check if the length of the pattern is equal to the length of the array of words.
        > If not, return false.
        > Use a HashMap to store the mapping between characters in the pattern and words in the string.
        > For each character in the pattern and corresponding word in the string:
            - If the character is already in the map, check if it maps to the same word. If not, return false.
            - If the character is not in the map, check if the word is already mapped to a different character. If so, return false.
            - Otherwise, add the mapping to the map.
        > If all characters and words are processed without conflicts, return true.
   */
    public static boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");

        if (pattern.length() != a.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = a[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {    // If the character is already mapped to a different word, then the pattern does not match.
                    return false;
                }
            } else {
                if (map.containsValue(word)) {    // If the word is already mapped to a different character, then the pattern does not match.
                    return false;
                }
                map.put(c, word);
            }
        }
        return true;
    }
}
