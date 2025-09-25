import java.util.Arrays;

// https://leetcode.com/problems/sum-in-a-matrix/description/

public class SumInAMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {7,2,1},
                {6,4,2},
                {6,5,3},
                {3,2,1}
        };
        System.out.println(nums.length);
        System.out.println(nums[0].length);
        int sum = matrixSum(nums);
        System.out.println("Sum of all elements in the nums: " + sum);
    }
    public static int matrixSum(int[][] nums) {
        int m = nums.length, n = nums[0].length;

        // Step 1: Sort each row
        for (int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }

        int totalSum = 0;

        // Step 2: For each column (from rightmost to leftmost)
        for (int col = n - 1; col >= 0; col--) {
            int maxNo = 0;
            for (int row = 0; row < m; row++) {
                maxNo = Math.max(maxNo, nums[row][col]);
            }
            totalSum += maxNo;
        }

        return totalSum;
    }
    // public static int sumMatrix(int[][] nums) {
    //     int totalSum = 0;
    //     for (int col = 0; col < nums[0].length; col++) {
    //         int maxNo = Integer.MIN_VALUE;
    //         for (int row = 0; row < nums.length; row++) {
    //             maxNo = Math.max(maxNo, nums[row][col]);
    //         }
    //         totalSum += maxNo;
    //     }
    //     return totalSum;
    // }
}
