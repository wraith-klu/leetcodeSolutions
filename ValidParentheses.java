import java.util.*;


public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);
    }
    /*
    LeetCode Problem : 20, Link: https://leetcode.com/problems/valid-parentheses/
    Logic:
        > Use a stack to keep track of the opening parentheses.
        > Iterate through each character in the string:
            - If it's an opening parenthesis, push the corresponding closing parenthesis onto the stack.
            - If it's a closing parenthesis, check if the stack is empty or if the top of the stack does not match the current character. If either condition is true, return false.
        > After processing all characters, check if the stack is empty. If it is, return true; otherwise, return false.

    Time Complexity: O(n), where n is the length of the input string, because we need to iterate through each character once.
    Space Complexity: O(n), in the worst case, if all characters are opening parentheses, we will push all of them onto the stack.
    */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
