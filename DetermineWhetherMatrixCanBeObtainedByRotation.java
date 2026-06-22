public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        boolean ans = findRotation(mat, target);
        System.out.println("Can the matrix be obtained by rotation? " + ans);
    }
    /*
    LeetCode Problem - 1886, Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    Logic:
        1. We can check for all four possible rotations (0, 90, 180, and 270 degrees) of the input matrix.
            Rotation formula -:
                rotated[j][n - 1 - i] = mat[i][j];   // Rotate 90 degrees clockwise: new_row = old_col, new_col = n - 1 - old_row
        2. For each rotation, we compare the rotated matrix with the target matrix.
        3. If any of the rotations matches the target matrix, we return true; otherwise, we return false after checking all rotations.

    Time Complexity: O(n^2) - We check up to 4 rotations, and each rotation involves comparing two n x n matrices, which takes O(n^2) time.
    Space Complexity: O(n^2) - We use additional space to store the rotated matrix for each rotation, which takes O(n^2) space.
    */
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {   // Check for 0, 90, 180, and 270 degrees rotation
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            mat = rotateMatrix(mat);
        }
        return false;
    }
    public static int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];   // Rotate 90 degrees clockwise: new_row = old_col, new_col = n - 1 - old_row
            }
        }
        return rotated;
    }
    public static boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
