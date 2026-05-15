// LeetCode Problem - 70, Link: https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {
    public static void main(String[] args) {
        
        int n = 5;
        int ans = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs = " + ans);
    }
    /*
    Logic:
        > The number of ways to climb n stairs can be expressed as the sum of the ways to climb (n-1) stairs and (n-2) stairs
        > This is because from the (n-1)th stair, you can take a single step to reach the nth stair, and from the (n-2)th stair, you can take a double step to reach the nth stair
        > This forms a Fibonacci-like sequence where:
            - climbStairs(1) = 1
            - climbStairs(2) = 2
            - climbStairs(n) = climbStairs(n-1) + climbStairs(n-2) for n > 2
    */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
