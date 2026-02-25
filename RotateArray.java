// https://leetcode.com/problems/rotate-array/description/?envType=problem-list-v2&envId=array

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotate(nums, k);
        System.out.println("Rotated array: " + java.util.Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;                                   // handle k > n

        reverse(nums, 0, n - 1);                    // step 1 --> Rotate whole Array
        reverse(nums, 0, k - 1);                   // step 2 --> Reverse entire array
        reverse(nums, k, n - 1);                  // step 3 --> Reverse remaining elements(k to n)
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
