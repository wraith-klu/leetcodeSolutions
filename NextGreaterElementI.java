import java.util.*;

// Leetcode Problem : 496, Link: https://leetcode.com/problems/next-greater-element-i/

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    /*
    Logic:
        > Traverse the nums2 array from the end to the start.
        > Use a stack to keep track of the next greater element.
        > If the stack is empty, then the next greater element is -1.
        > Otherwise, the next greater element is the top of the stack.
        > Push the current element onto the stack.
        > Return the result array.
        > Create a map to store the next greater element for each element in nums2.
        > Traverse the nums1 array and get the next greater element from the map.
        > Return the result array.
    */

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r = new int[nums2.length];      // 
        Stack<Integer> stack = new Stack<>();
        for(int i= nums2.length - 1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums2[i]) {  // Pop elements from the stack until we find a greater element or the stack is empty
                stack.pop();
            }
            if(stack.isEmpty()) {      // If the stack is empty, then there is no greater element to the right, so we set r[i] to -1
                r[i] = -1;
            } else {                 // if num2[i] < stack.peek(), so we set r[i] to stack.peek()
                r[i] = stack.peek();
            }
            stack.push(nums2[i]);  // at the end of each iteration, we push the current element onto the stack to be used for the next iterations.
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++) {
            map.put(nums2[i], r[i]);
        }
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            result[i] = map.get(nums1[i]);               
        }
        return result;
    }
}
