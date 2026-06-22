public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    /*
    LeetCode Problem: 1732, Link :- https://leetcode.com/problems/find-the-highest-altitude
    Logic :
        1. We will keep track of the current altitude and the maximum altitude.
        2. We will iterate through the gain array and update the current altitude and the maximum altitude.

    Time Complexity: O(n), where n is the length of the gain array, since we are iterating through the array once.
    Space Complexity: O(1).
    */
    public static int largestAltitude(int[] gain) {
        int m =0, s=0;
        for(int n : gain){
            s += n;
            m = Math.max(m,s);
        }
        
        return m;
    }
}