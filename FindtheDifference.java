import java.util.HashMap;

public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
        System.out.println(findTheDifferenceUsingHashMap(s, t));
    }
    /*
    LeetCode Problem: 389, Link :- https://leetcode.com/problems/find-the-difference
    Logic :
        1. We will use the XOR operation to find the difference.
        2. XOR all characters in string s and t.
        3. The result will be the character that is in t but not in s.

    Time Complexity: O(n), where n is the length of the string.
    Space Complexity: O(1).
    */
    public static char findTheDifference(String s, String t) {
        char ans = 0;
        for(char c : s.toCharArray()){
            ans ^= c;
        }
        for(char c : t.toCharArray()){
            ans ^= c;
        }
        return ans;
    }
    /*
    LeetCode Problem: 389, Link :- https://leetcode.com/problems/find-the-difference
    Logic :
        1. We will use a HashMap to store the count of each character in the strings.
        2. We will iterate through string t and increment the count of each character.
        3. We will iterate through string s and decrement the count of each character.
        4. The character with a count of 1 in the HashMap is the difference.

    Time Complexity: O(n), where n is the length of the string.
    Space Complexity: O(1), since the HashMap will have at most 26 entries for the lowercase English letters.
    */
    public static char findTheDifferenceUsingHashMap(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.keySet().iterator().next();
    }
}
