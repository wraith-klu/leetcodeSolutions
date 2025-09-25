public class ToeplitzMatrix {

// https://leetcode.com/problems/toeplitz-matrix/description/

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        boolean result = isToeplitzMatrix(matrix);
        System.out.println("Is Toeplitz Matrix: " + result);
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for (int row = 0; row < rowLength - 1; row++) {
            for (int col = 0; col < colLength - 1; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}