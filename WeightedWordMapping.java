public class WeightedWordMapping {
    public static void main(String[] args) {
        String[] words = {"abc", "de", "f"};
        int[] weights = {3, 2, 1};
        String result = weightedWordMapping(words, weights);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 3838, Link :- https://leetcode.com/problems/weighted-word-mapping
    Logic :
        1. We will iterate through each word in the input array and calculate the total weight of the characters in the word using the weights array.
        2. We will then calculate the new character by taking the total weight modulo 26 and mapping it to a character in the alphabet.
        3. We will append the new character to a StringBuilder and return the final string.

    Time Complexity: O(n * m), where n is the number of words and m is the average length of the words, since we are iterating through each word and each character in the word.
    Space Complexity: O(n), since we are using a StringBuilder to store the resulting string, which can grow up to the length of the number of words in the input array.
    */
    public static String weightedWordMapping(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            int t=0;
            for(char ch:s.toCharArray()){
                int z = ch -'a';            // Get the index of the character in the alphabet (0 for 'a', 1 for 'b', ..., 25 for 'z').
                t += weights[z];
            }
            int r = 26-(t%26);                // Calculate the new character index by taking the total weight modulo 26 and subtracting from 26 to get the correct mapping.
            char ch = (char)('a' + r - 1);   // -1 because we want to map 0 to 'z', 1 to 'a', 2 to 'b', and so on.
            sb.append(ch);
        }
        return sb.toString();
    }
}
