public class NthDigit {
    public static void main(String[] args) {
        int n = 11;
        int result = findNthDigit(n);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 400, Link :- https://leetcode.com/problems/nth-digit
    Logic :
        1. We will iterate through each group of numbers (1-digit, 2-digit, 3-digit, etc.).
        2. For each group, we will calculate the total number of digits.
            Groups:
                1-digit numbers: 1..9      -> 9 digits
                2-digit numbers: 10..99    -> 180 digits
                3-digit numbers: 100..999  -> 2700 digits
                ...
        3. If n is within the current group, we will find the exact digit.

    Time Complexity: O(log n), where n is the input number.
    Space Complexity: O(1), since we are using a constant amount of extra space.
    */
    public static int findNthDigit(int n) {
        long digits = 1;   // digits per number
        long count = 9;    // count of numbers in current group
        long start = 1;    // first number in current group
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }
        long num = start + (n - 1) / digits;   // Find the actual number that contains the nth digit. We subtract 1 from n because we want to convert it to a 0-based index for easier calculation.
        String s = Long.toString(num);
        return s.charAt((int)((n - 1) % digits)) - '0';
    }
}
