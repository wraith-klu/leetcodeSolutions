import java.util.Arrays;

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    /*
    Leetcode Question - 1859, Link - https://leetcode.com/problems/sorting-the-sentence/
    Logic -
        1. We can split the string into words using the split() method.
        2. We can then sort the words based on the last character of each word using Arrays.sort() method.
        3. Finally, we can concatenate the sorted words and return the result.  

    Time Complexity - O(nlogn), where n is the number of words in the string.
    Space Complexity - O(n), where n is the number of words in the string.
    */
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (a, b) ->
            Character.compare(
                a.charAt(a.length() - 1),
                b.charAt(b.length() - 1)
            )
        );
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            ans.append(word.substring(0, word.length() - 1)).append(" ");
        }
        return ans.toString().trim();
    }
}
/*
How Arrays.sort() works in this case:

    Comparator Syntax:
        Arrays.sort(String[] array, (a, b) -> Character.compare(
                a.charAt(a.length() - 1),
                b.charAt(b.length() - 1)
            )
        );

    Here,
        a = first word
        b = second word

    For example:
        a = "sentence4"
        b = "This1"

    Last characters:
        a.charAt(a.length() - 1) = '4'
        b.charAt(b.length() - 1) = '1'

    Character.compare('4', '1') returns:
        > 0  -> if first character is greater
        < 0  -> if first character is smaller
        0    -> if both are equal

    Since '4' > '1', it returns a positive number, so Arrays.sort() places "This1" before "sentence4".

    Another comparison:
        a = "is2"
        b = "a3"

    Character.compare('2', '3') returns a negative number, so "is2" stays before "a3".

    Arrays.sort() repeatedly performs such comparisons (using TimSort internally) until the array becomes:
        ["This1", "is2", "a3", "sentence4"]
*/