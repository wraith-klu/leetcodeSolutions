import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar1(s));
    }
    /*
    LeetCode Problem: 387, Link :- https://leetcode.com/problems/first-unique-character-in-a-string
    Logic :
        1. We will use a HashMap to store the count of each character in the string.
        2. We will iterate through the string and check the count of each character in the HashMap.
        3. The first character with a count of 1 is the first unique character.

    Time Complexity: O(n), where n is the length of the string, since we are iterating through the string twice.
    Space Complexity: O(1), since the HashMap will have at most 26 entries for the lowercase English letters.
    */
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }
        return -1;
    }
    /*
    Logic :
        1. We will use an array of size 26 to store the count of each character in the string.
        2. We will iterate through the string and check the count of each character in the array.
        3. The first character with a count of 1 is the first unique character.

    Time Complexity: O(n), where n is the length of the string, since we are iterating through the string twice.
    Space Complexity: O(1), since the array will have a fixed size of 26
    */
    public static int firstUniqChar1(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
