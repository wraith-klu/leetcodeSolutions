import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("Length of unique elements: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1; // Length of unique elements
    }
}
