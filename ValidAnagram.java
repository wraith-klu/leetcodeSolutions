import java.util.*;

// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        // count the frequency of each character in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); // increment the count of the character and add the character to the
                                                    // map
        }

        // count the frequency of each character in t and remove the character from the
        // map if the count is 0
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c))
                return false; // if the character is not in the map, return false
            map.put(c, map.get(c) - 1); // decrement the count of the character
            if (map.get(c) == 0)
                map.remove(c); // remove the character from the map if the count is 0
        }
        return map.isEmpty(); // if the map is empty, return true
    }



/*
    Using array to count the frequency of each character is more efficient than using hashmap 
    because array is faster than hashmap and use time complexity of O(n) and space complexity of O(1) 
    while HashMap uses time complexity of O(n) and space complexity of O(n)

 */    
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }

        return true;
    }

}
