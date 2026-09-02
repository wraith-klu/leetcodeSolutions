public class NumberofDigitOne {
    public static void main(String[] args) {
        int n = 13;
        int result = countDigitOne(n);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 233, Link :- https://leetcode.com/problems/number-of-digit-one
    Logic :
        1. We will iterate through each digit of the number.
        2. For each digit, we will calculate the number of times 1 appears in that position.
        3. We will sum up the counts for all positions.

    Time Complexity: O(log n), where n is the input number.
    Space Complexity: O(1), since we are using a constant amount of extra space.
    */
    public static int countDigitOne(int n) {
        long factor = 1;
        int count = 0;
        while (factor <= n) {
            long lower = n % factor;           // Get the lower part of the number
            long curr = (n / factor) % 10;      // Current digit is the digit at the current factor position. we are deviding n by factor to remove the lower part and then taking modulo 10 to get the current digit.
            long higher = n / (factor * 10);    // Higher part is the part of the number that is left after removing the current digit and the lower part. We are dividing n by factor*10 to remove both the lower part and the current digit.
            if (curr == 0) {
                count += higher * factor;      // If the current digit is 0, the count of 1s in this position is determined by the higher part multiplied by the factor.
            } else if (curr == 1) {
                count += higher * factor + lower + 1; // If the current digit is 1, the count of 1s in this position is determined by the higher part multiplied by the factor plus the lower part plus 1 (for the current digit itself).
            } else {
                count += (higher + 1) * factor;     // If the current digit is greater than 1, the count of 1s in this position is determined by the higher part plus 1 (to account for the current digit) multiplied by the factor.
            }
            factor *= 10;   // Multiplying by 10 because we are moving to the next digit position (units to tens, tens to hundreds, etc.).
        }
        return count;
    }
}
