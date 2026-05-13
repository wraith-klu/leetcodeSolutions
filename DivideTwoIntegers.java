// LeetCode Problem - 29, Link: https://leetcode.com/problems/divide-two-integers/

public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int ans = divide(dividend, divisor);
        System.out.println("Quotient of " + dividend + " divided by " + divisor + " = " + ans);
    }


    public static int divide(int dividend, int divisor) {
        // Handle edge case for overflow when dividend is Integer.MIN_VALUE and divisor is -1. 

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}
