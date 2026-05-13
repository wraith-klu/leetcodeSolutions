// LeetCode Problem - 70, Link: https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {
    public static void main(String[] args) {
        
        int n = 5;
        int ans = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs = " + ans);
    }
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
