import java.util.Arrays;

// https://leetcode.com/problems/diagonal-traverse/description/

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = findDiagonalOrder(mat);
        System.out.print("Diagonal Traversal: " + Arrays.toString(result));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int rows = mat.length;
        int cols = mat[0].length;

        int[] result = new int[rows * cols];
        int index = 0;
        int row = 0, col = 0;
        boolean goingUp = true;

        while (index < rows * cols) {
            result[index++] = mat[row][col];

            if (goingUp) { // moving up-right
                if (col == cols - 1) { 
                    row++;
                    goingUp = false;
                } else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else { // moving down-left
                if (row == rows - 1) {
                    col++;
                    goingUp = true;
                } else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;

    }
}
