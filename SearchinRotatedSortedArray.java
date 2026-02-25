import java.util.*;

public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();
        // int index = search(nums, target);
        // System.out.println(index);
        System.out.println("Index of target is : " + binarySearchInRotated(nums, target));

        sc.close();
    }
    // Find mid → identify sorted half → check range → shrink search space

    public static int binarySearchInRotated(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // public static int search(int[] nums, int target) {
    // int pivot = searchMax(nums);

    // // If array is not rotated
    // if (pivot == -1) {
    // return binarySearch(nums, 0, nums.length - 1, target);
    // }

    // if (nums[0] <= target && target <= nums[pivot]) {
    // return binarySearch(nums, 0, pivot, target);
    // } else {
    // return binarySearch(nums, pivot + 1, nums.length - 1, target);
    // }
    // }

    // // Find Pivot(Max) value
    // public static int searchMax(int[] nums) {
    // int start = 0;
    // int end = nums.length - 1;

    // // If already sorted
    // if (nums[start] <= nums[end]) {
    // return -1;
    // }

    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (mid < end && nums[mid] > nums[mid + 1]) {
    // return mid;
    // }
    // if (mid > start && nums[mid] < nums[mid - 1]) {
    // return mid - 1;
    // }

    // if (nums[mid] >= nums[start]) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // // binary search
    // public static int binarySearch(int[] nums, int start, int end, int target) {
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (nums[mid] == target)
    // return mid;
    // if (nums[mid] < target)
    // start = mid + 1;
    // else
    // end = mid - 1;
    // }
    // return -1;
    // }
}
