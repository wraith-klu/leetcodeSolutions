public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "abcdefgh";
        Character ch = 'e';
        System.out.println(reversePrefix(word, ch));
    }
    /*
    LeetCode Problem: 2000, Link :- https://leetcode.com/problems/reverse-prefix-of-word
    Logic :
        1. We will first find the index of the character ch in the string word.
        2. If the character is found, we will reverse the substring from the start of the string to the index of the character.
        3. Finally, we will concatenate the reversed substring with the remaining part of the string and return the result.     

    Time Complexity: O(n), where n is the length of the string word.
    Space Complexity: O(n), where n is the length of the string word, due to the StringBuilder used to construct the result string.
    */
    public static String reversePrefix(String word, char ch) {
        int id = -1, n = word.length();
        for(int i =0; i<n; i++){
            if(word.charAt(i)==ch){
                id = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=id; i>=0; i--){
            sb.append(word.charAt(i));
        }
        for(int i=id+1; i<n; i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
