public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int index = search(nums, target);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        int indexOfMaxElement = searchMax(nums);

        // If array is not rotated
        if (indexOfMaxElement == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        if (nums[0] <= target && target <= nums[indexOfMaxElement]) {
            return binarySearch(nums, 0, indexOfMaxElement, target);
        } else {
            return binarySearch(nums, indexOfMaxElement + 1, nums.length - 1, target);
        }
    }

    // Find Pivot(Max) value
    public static int searchMax(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // If already sorted
        if (nums[start] <= nums[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // binary search
    public static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
