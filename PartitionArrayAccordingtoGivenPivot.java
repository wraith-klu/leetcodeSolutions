import java.util.*;

public class PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] ans = pivotArray1(nums, pivot);
        System.out.print("Partitioned Array Using Arrays: "+ Arrays.toString(ans));
             
        System.out.println();
        int[] ans2 = pivotArray2(nums, pivot);
        System.out.print("Partitioned Array Using ArrayLists: "+ Arrays.toString(ans2));
        
    }
    /*
    LeetCode Problem - 2161, Link: https://leetcode.com/problems/partition-array-according-to-given-pivot/
    Logic:
        1. We can create three separate lists (or arrays) to store elements less than, equal to, and greater than the pivot.
        2. We iterate through the input array and populate these three lists based on the comparison with the pivot.
        3. Finally, we concatenate these three lists to form the final partitioned array.

    Time Complexity: O(n) - We iterate through the input array a few times (once for counting and once for concatenation).
    Space Complexity: O(n) - We use additional space to store the three separate lists (or arrays) for the partitioning process.
    */
    public static int[] pivotArray1(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int idx = 0;
        for (int num : nums) {
            if (num < pivot) {
                ans[idx++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                ans[idx++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                ans[idx++] = num;
            }
        }
        return ans;
    }
    /*
    Logic:
        1. Similar to the first approach, but instead of using arrays, we can use ArrayLists to store the elements less than, equal to, and greater than the pivot.
        2. We iterate through the input array and populate these three ArrayLists based on the comparison with the pivot.
        3. Finally, we concatenate these three ArrayLists to form the final partitioned array.

    Time Complexity: O(n) - We iterate through the input array a few times (once for counting and once for concatenation).
    Space Complexity: O(n) - We use additional space to store the three separate ArrayLists for the partitioning process.
    */
    public static int[] pivotArray2(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int num : less) {
            ans[idx++] = num;
        }
        for (int num : equal) {
            ans[idx++] = num;
        }
        for (int num : greater) {
            ans[idx++] = num;
        }
        return ans;
    }
}
