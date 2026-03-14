// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=problem-list-v2&envId=two-pointers

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 15, 3, 10};
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }
    public static boolean checkIfExist(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            for (int k = j; k >= 0; k--) {
                if (arr[i] == 2 * arr[k] && k != i) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
