public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        int result = numOfStrings(patterns, word);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1967, Link :- https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word
    Logic :
        1. We will iterate through the patterns array and check if each pattern is a substring of the word.
        2. If it is, we will increment the count.
        3. Finally, we will return the count.

    Time Complexity: O(n * m), where n is the length of the patterns array and m is the average length of the strings in patterns.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables.
    */
    public static int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for (String s : patterns) {
            if (word.contains(s)) {
                c++;
            }
        }
        return c;
    }
}
