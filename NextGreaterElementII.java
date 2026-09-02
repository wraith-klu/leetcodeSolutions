import java.util.*;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElements(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    /*
    LeetCode Problem: 503, Link: https://leetcode.com/problems/next-greater-element-ii/
    Description: Given a circular array (the last element's next is the first element), return the next greater element for each element.
    Logic :
        1. We will use a stack to keep track of the elements for which we haven't found the next greater element yet.
        2. We will iterate through the array twice (to simulate the circular nature of the array) and for each element, we will pop elements from the stack until we find a greater element or the stack is empty.
        3. If we find a greater element, we will store it in the result array. If we don't find a greater element, we will store -1 in the result array.
        4. Finally, we will return the result array.

        Current number
            ↓
        Remove smaller/equal numbers
            ↓
        Stack top = next greater
            ↓
        Push current number
        
    Time Complexity: O(n), where n is the length of the input array. We are iterating through the array twice, but each element is pushed and popped from the stack at most once.
    Space Complexity: O(n), where n is the length of the input array. We are using a stack to store the elements for which we haven't found the next greater element yet, and the result array to store the final results.
    */
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();
        for(int i = 2*n - 1; i>=0; i--){
            int x = nums[i % n];

            while(!stack.isEmpty() && stack.peek() <= x){
                stack.pop();
            }
            if(i<n && !stack.isEmpty()){
                result[i] = stack.peek();
            }
            stack.push(x);
        }
        return result;
    }
}
