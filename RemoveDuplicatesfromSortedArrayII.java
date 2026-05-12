import java.util.Arrays;

// Leetcode Problem No. 80, link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class RemoveDuplicatesfromSortedArrayII {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int ans = removeDuplicates(nums);
        System.out.print("Array after removing duplicates = ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Total elements = " + ans);  
    }
    /*
    Logic:
        > First 2 elements are always allowed
        > After that:
            > compare current element with nums[k-2]
            > if same → it would become 3rd duplicate → skip
            > if different → keep it
    */
    public static int removeDuplicates(int[] nums) {

        int k = 0;                      // k is the index of the next position to place a valid element
        for (int num : nums) {
            if (k < 2 || num != nums[k - 2]) { 
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}