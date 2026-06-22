public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }
    /*
    LeetCode Problem: 507, Link :- https://leetcode.com/problems/perfect-number
    Logic :
        1. We will iterate from 1 to the input number.
        2. For each number, we will check if it is a divisor of the input number.
        3. If it is a divisor, we will add it to the sum.
        4. Finally, we will check if the sum of divisors equals the input number.

    Time Complexity: O(n), where n is the input number.
    Space Complexity: O(1), since we are using only a constant amount of extra space.
    */
    public static boolean checkPerfectNumber(int num) {
        int s = 0, i=1, n=num;
        while(i<n){
            if(n%i==0){
                s += i;
            }
            i++;
        }
        return s==n;
    }
}
