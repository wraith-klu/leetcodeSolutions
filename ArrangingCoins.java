public class ArrangingCoins {

// https://leetcode.com/problems/arranging-coins/submissions/1763586038/?envType=problem-list-v2&envId=binary-search

    public static void main(String[] args) {
        int n = 8;
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
    // Binary Search Approach
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
