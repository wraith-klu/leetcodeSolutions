// LeetCode Problem - 231, Link: https://leetcode.com/problems/power-of-two/

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerOfTwo(n);
        System.out.println(n + " is a power of two: " + ans);
    }
    /*
    Logic:
        > A number that is a power of two has exactly one bit set in its binary representation. For example:
            - 1 (2^0) = 0001
            - 2 (2^1) = 0010
            - 4 (2^2) = 0100
            - 8 (2^3) = 1000
        > If we subtract 1 from a power of two, we get a number where all the bits after the single set bit are set to 1. For example:
            - 1 (0001) - 1 = 0 (0000)
            - 2 (0010) - 1 = 1 (0001)
            - 4 (0100) - 1 = 3 (0011)
            - 8 (1000) - 1 = 7 (0111)
        > When we perform a bitwise AND operation between a power of two and one less than it, the result will be zero. For example:
            - For n = 4: n & (n-1) = 0100 & 0011 = 0000
        > Therefore, if n is greater than zero and n & (n-1) equals zero, then n is a power of two.
    */
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
