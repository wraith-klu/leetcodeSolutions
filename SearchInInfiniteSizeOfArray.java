public class SearchInInfiniteSizeOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 20, 23, 27, 29, 31, 35, 39, 41, 43, 45,
                48, 50, 54, 55, 59, 66, 67, 69, 70, 73, 75, 76, 77, 79, 81, 83, 87, 88, 90, 92, 97, 99, 100 };
        int target = 9;

        int index = findIndexOfTarget(nums, target);
        System.out.println("Target found at index : " + index);
    }

    public static int findIndexOfTarget(int[] nums, int target) {
        int s = 0, e = 1;
        while (target> nums[e]) {
            s = e + 1;
            e = e * 2;

        }
        return binarySearch(nums, s, e, target);
    }

    public static int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
