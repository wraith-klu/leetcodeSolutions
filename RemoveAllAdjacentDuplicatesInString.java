import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";

        String result1 = removeDuplicates1(s);
        String result2 = removeDuplicates2(s);
        System.out.println("Using Stack: " + result1);
        System.out.println("Using StringBuilder: " + result2);
    }
    /*
    LeetCode Problem: 1047, Link :- https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
    Logic :
        1. We will use a stack to keep track of the characters in the string.
        2. We will iterate through the characters of the input string.
        3. For each character, we will check if it is the same as the character at the top of the stack.
        4. If it is, we will pop the top character from the stack (i.e., we found an adjacent duplicate).
        5. If it is not, we will push the character onto the stack.
        6. Finally, we will build the result string from the characters in the stack and return it.
    
    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string once.
    Space Complexity: O(n), since we are using a stack to store the characters.
    */
   public static String removeDuplicates1(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        String ans ="";
        for(char ch:stack){
            ans += ch;
        }
        return ans;
    }
    /*
    Logic :
        1. We will use a StringBuilder to build the result string.
        2. We will iterate through the characters of the input string.
        3. For each character, we will check if it is the same as the last character in the StringBuilder.
        4. If it is, we will remove the last character from the StringBuilder (i.e., we found an adjacent duplicate).
        5. If it is not, we will append the character to the StringBuilder.
        6. Finally, we will return the StringBuilder as a string.
    
    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string once.
    Space Complexity: O(n), since we are using a StringBuilder to store the result.
    */
    public static String removeDuplicates2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
