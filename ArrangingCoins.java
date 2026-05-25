public class ArrangingCoins {

// https://leetcode.com/problems/arranging-coins/submissions/1763586038/?envType=problem-list-v2&envId=binary-search

    public static void main(String[] args) {
        int n = 8;
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
    // Binary Search Approach
    /*
    Leetcode Problem : 441, Link: https://leetcode.com/problems/arranging-coins/
    Logic:
        > Use binary search to find the maximum number of complete rows that can be formed with n coins.
        > The number of coins needed to form k complete rows is given by the formula: k * (k + 1) / 2.
        > Initialize two pointers, start and end, to represent the range of possible complete rows.
        > Calculate the mid-point and the number of coins needed for mid complete rows.
        > If the coins needed is equal to n, return mid as the result.
        > If the coins needed is less than n, move the start pointer to mid + 1 to search for more complete rows.
        > If the coins needed is greater than n, move the end pointer to mid - 1 to search for fewer complete rows.
        > Continue this process until start exceeds end, at which point end will represent the maximum number of complete rows that can be formed with n coins.

    Time complexity: O(log n) due to binary search.
    Space complexity: O(1) as we are using only a constant amount of space for the pointers and variables.
    */
    public static int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            
            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }

    // Linear Approach
    
    // public static int arrangeCoins(int n) {
    //     int height = 1;
    //     while (n>0) {
    //         if(n>=height) {
    //             n -= height;
    //             height++;
    //         } else {
    //             break;
    //         }
    //     }
    //     return height - 1;
    // }
}
