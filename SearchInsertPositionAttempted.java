public class SearchInsertPositionAttempted {

// https://leetcode.com/problems/search-insert-position/description/
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid; // Found exact match
            } else if (nums[mid] < target) {
                start = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        return start;
    }
}
