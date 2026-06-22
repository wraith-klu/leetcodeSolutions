public class FurthestPointFromOrigin {
    public static void main(String[] args) {
        String moves = "L_RL__R";
        int ans = furthestDistanceFromOrigin(moves);
        System.out.println("Furthest Distance from Origin: " + ans);
    }
    /*
    LeetCode Problem - 2731, Link: https://leetcode.com/problems/furthest-point-from-origin/
    Logic:
        1. Count the number of 'L', 'R', and '_' characters in the input string.
        2. Calculate the absolute difference between the counts of 'R' and 'L'.
        3. Add the count of '_' characters to the absolute difference to get the furthest distance from the origin.

    Time Complexity: O(n) - We iterate through the input string once.
    Space Complexity: O(1) - We use only a constant amount of extra space.
    */
    public static int furthestDistanceFromOrigin(String moves) {
        int n= moves.length();
        int rc=0, lc=0, c=0;
        for(int i=0; i<n; i++){
            if(moves.charAt(i)=='L') lc++;
            else if(moves.charAt(i)=='R') rc++;
            else c++;
        }
        return (c+(Math.abs(rc-lc)));
    }
}
