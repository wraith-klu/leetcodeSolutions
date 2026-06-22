public class UglyNumber {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(isUgly(n));
    }
    /*
    LeetCode Problem: 263, Link :- https://leetcode.com/problems/ugly-number
    Logic :
        1. We will keep dividing the number by 2, 3 and 5 until it is no longer divisible by any of these numbers.
        2. If the resulting number is 1, then it is an ugly number, otherwise it is not.

    Time Complexity: O(log n), where n is the input number, since we are dividing the number by 2, 3 and 5 repeatedly.
    Space Complexity: O(1).
    */
    public static boolean isUgly(int n) {
        if(n <= 0) return false;
        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;
        return n == 1;
    }
}
