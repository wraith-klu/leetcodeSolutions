public class ConcatenateNonZeroDigitsAndMultiplyBySumI {
    public static void main(String[] args){
        int n = 1020030405;
        long result = concatenateNonZeroDigitsAndMultiplyBySum(n);
        System.out.println("Result: " + result);
    }
    /*
    LeetCode Problem: 3754, Link :- https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i
    Logic :
        1. We will iterate through the digits of the input number n.
        2. For each digit, we will check if it is non-zero.
        3. If it is non-zero, we will add it to the sum s and concatenate it to the number num.
        4. Finally, we will return the product of num and s.

    Time Complexity: O(d), where d is the number of digits in the input number n, since we are iterating through the digits once.
    Space Complexity: O(1), since we are using a constant amount of space for the variables s, i, and num.
    */
    public static long concatenateNonZeroDigitsAndMultiplyBySum(int n) {
        int s =0, i=0;
        long num=0;
        while(n>0){
            int r = n%10;
            if(r!=0){
                s+=r;
                num += ((long) Math.pow(10, i))*r;
                i++;
            }
            n /= 10;
        }
        return num * s;
    }
}