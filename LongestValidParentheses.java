import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "(()())";
        int ans = longestValidParentheses(s);
        System.out.println("Length of the longest valid parentheses substring: " + ans);
    }/*
    LeetCode Problem - 32, Link: https://leetcode.com/problems/longest-valid-parentheses/
    Logic:
        1. We can use a stack to keep track of the indices of the characters in the string.
        2. We initialize the stack with -1 to handle the edge case for the first valid substring.
        3. We iterate through the string, and for each character:
            - If it's an opening parenthesis '(', we push its index onto the stack.
            - If it's a closing parenthesis ')', we pop the top element from the stack.
                - If the stack becomes empty after popping, we push the current index onto the stack to serve as a new base for future valid substrings.
                - If the stack is not empty, we calculate the length of the current valid substring by taking the difference between the current index and the index at the top of the stack, and update our maximum length if necessary.
    
    Time Complexity: O(n) - We iterate through the string once.
    Space Complexity: O(n) - In the worst case, we may push all indices onto the stack if the string consists of only opening parentheses. 
    
    */
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
