import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String result = mostCommonWord(paragraph, banned);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 819, Link :- https://leetcode.com/problems/most-common-word
    Logic :
        1. We will convert the paragraph to lowercase and replace all punctuation with spaces.
        2. We will split the paragraph into words and store them in an array.
        3. We will create a HashSet to store the banned words.
        4. We will create a HashMap to store the frequency of each word that is not banned.
        5. We will iterate through the words array and update the frequency of each word in the HashMap.
        6. We will find the word with the highest frequency in the HashMap and return it.

    Time Complexity: O(n), where n is the length of the paragraph, since we are iterating through the paragraph once.
    Space Complexity: O(m), where m is the number of unique words in the paragraph, since we are using a HashMap to store the frequency of each word.
    */
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        String[] words = paragraph.split("\\s+");
        HashSet<String> ban = new HashSet<>();
        for (String b : banned) {
            ban.add(b);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!ban.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String ans = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
