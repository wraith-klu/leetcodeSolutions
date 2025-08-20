import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/remove-element/submissions/1733270727/?envType=problem-list-v2&envId=array

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val); // now returns int
        System.out.println(k); // prints number of kept elements
        System.out.println(Arrays.toString(nums)); // nums is modified in place
    }

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }

        // put values back into nums
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size(); // return count of kept elements
    }
}
