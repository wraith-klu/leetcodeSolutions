public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + java.util.Arrays.toString(nums1));
    }
    
    /*
    LeetCode Problem : 88, Link: https://leetcode.com/problems/merge-sorted-array/
    Logic:
        > Create a new array merged of size m + n to hold the merged elements.
        > Copy the first m elements from nums1 into the merged array.
        > Copy the n elements from nums2 into the merged array starting from index m.
        > Sort the merged array using Arrays.sort().
        > Copy the sorted elements back into nums1.

    Time Complexity: O((m+n) log(m+n)), where m is the number of elements in nums1 and n is the number of elements in nums2, because we are sorting the merged array.
    Space Complexity: O(m+n), because we are using an additional array of size m+n to store the merged elements.
    */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        int[] merged = new int[k];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        java.util.Arrays.sort(merged);
        for (int i = 0; i < k; i++) {
            nums1[i] = merged[i];
        }

    }
}
