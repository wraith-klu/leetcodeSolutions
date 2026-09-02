public class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        int left = 5, right = 7;
        int result = rangeBitwiseAnd(left, right);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 201, Link :- https://leetcode.com/problems/bitwise-and-of-numbers-range
    Logic :
        1. We will keep right-shifting both left and right until they become equal.
        2. We will count the number of shifts required.
        3. We will left-shift the result by the count of shifts to get the final answer.

    Time Complexity: O(log n), where n is the maximum value between left and right.
    Space Complexity: O(1), since we are using a constant amount of extra space.
    */
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        while (left != right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }

        return left << shift;
    }
}
