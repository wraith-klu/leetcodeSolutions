public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + java.util.Arrays.toString(nums1));
    }

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
