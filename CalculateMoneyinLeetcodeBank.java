public class CalculateMoneyinLeetcodeBank {
    public static void main(String [] args){
        int n = 4;
        System.out.println(totalMoney(n));
    }
    /*
    Leetcode Question - 1716, Link - https://leetcode.com/problems/calculate-money-in-leetcode-bank/
    Logic -
        1. We can calculate the number of complete weeks and the number of remaining days.
        2. The total money saved in complete weeks can be calculated using the formula: weeks * 28 + 7 * weeks * (weeks - 1) / 2
        3. The total money saved in remaining days can be calculated using the formula: days * (2 * (weeks + 1) + (days - 1)) / 2
        4. The final answer is the sum of the total money saved in complete weeks and remaining days.

    Time Complexity - O(1)
    Space Complexity - O(1)
    */
    public static int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        // Sum of complete weeks
        int total = weeks * 28 + 7 * weeks * (weeks - 1) / 2;

        // Sum of remaining days
        total += days * (2 * (weeks + 1) + (days - 1)) / 2;

        return total;
    }
}
