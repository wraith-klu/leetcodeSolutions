// LeetCode Problem - 69, Link: https://leetcode.com/problems/sqrtx/

public class SqrtOfX {
    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println("Square root of " + x + " = " + ans);
    }
    public static int mySqrt(int x) {
        int z = (int) Math.sqrt(x);
        return z;
    }
    
}
