public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String result = toGoatLatin(sentence);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 824, Link :- https://leetcode.com/problems/goat-latin
    Logic :
        1. We will split the sentence into words.
        2. For each word, we will check if it starts with a vowel or a consonant.
        3. If it starts with a vowel, we will append "ma" to the end of the word.
        4. If it starts with a consonant, we will move the first letter to the end of the word and then append "ma".
        5. We will also append 'a' to the end of the word for each word's index (1-based).
        6. Finally, we will join all the words back into a sentence and return it.

    Time Complexity: O(n), where n is the length of the input sentence, since we are iterating through the sentence once.
    Space Complexity: O(n), since we are using a StringBuilder to store the result.
    */
    public static String toGoatLatin(String sentence) {
        String[] s = sentence.split(" ");
        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (String w : s) {
            if ("aeiouAEIOU".indexOf(w.charAt(0)) != -1) {
                sb.append(w);
            } else {
                sb.append(w.substring(1));
                sb.append(w.charAt(0));
            }
            sb.append("ma");
            for (int j = 0; j < i; j++) {
                sb.append('a');
            }
            sb.append(" ");
            i++;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
