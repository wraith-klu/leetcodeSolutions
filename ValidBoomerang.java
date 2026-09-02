public class ValidBoomerang {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        boolean result = new ValidBoomerang().isBoomerang(points);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1037, Link :- https://leetcode.com/problems/valid-boomerang
    Logic :
        1. We will check if the three points are distinct.
        2. We will check if the three points are collinear by calculating the area of the triangle formed by the three points.
        3. If the area is zero, then the points are collinear and we return false. Otherwise, we return true.
    
    Time Complexity: O(1), since we are performing a constant number of operations.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables.
    */
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        // Check if the three points are collinear
        return (y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }
}