public class FindMinimuminRotatedSortedArrayTwo {

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/?envType=problem-list-v2&envId=binary-search

    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
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
        if (nums.length <= 1) return -1;
        
        int start = 0;
        int end = nums.length - 1;
        
        // If array is not rotated
        if (nums[start] < nums[end]) return -1;
        
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
            
            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // Check if start is pivot
                if (start < nums.length - 1 && nums[start] > nums[start + 1]) return start;
                start++;
                // Check if end is pivot
                if (end > 0 && nums[end - 1] > nums[end]) return end - 1;
                end--;
                continue;
            }
            
            // Decide which half to search
            if ((nums[start] < nums[mid]) || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
