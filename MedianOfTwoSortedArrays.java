import java.util.Arrays;

// https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=array

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] newArray = new int[m + n];
        for (int i = 0; i < m; i++) {
            newArray[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            newArray[m + i] = nums2[i];
        }
        Arrays.sort(newArray);

        if ((m + n) % 2 == 0) {
            double median = (newArray[(m + n) / 2 - 1] + newArray[(m + n) / 2]) / 2.0;
            return median;
        } else {
            double median = newArray[(m + n) / 2];
            return median;
        }
    }
}
