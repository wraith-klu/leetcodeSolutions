public class FindMinimuminRotatedSortedArray {

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=binary-search

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int result = findMin(nums);
        System.out.println("Minimum element: " + result);
    }
    public static int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return nums[0];
        }
        return nums[pivot + 1];
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Check if mid is pivot
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            
            // Check if previous element is pivot
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }
            
            // Decide which half to search
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
