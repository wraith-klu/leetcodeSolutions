public class ArrangingCoins {

// https://leetcode.com/problems/arranging-coins/submissions/1763586038/?envType=problem-list-v2&envId=binary-search

    public static void main(String[] args) {
        int n = 5;
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
    // Binary Search Approach
    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            
            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
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
