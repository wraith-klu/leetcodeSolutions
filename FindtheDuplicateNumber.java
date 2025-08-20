public class FindtheDuplicateNumber {

    // https://leetcode.com/problems/find-the-duplicate-number/description/
    // Amazon Question
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };

        int result = findDuplicate(nums);
        System.out.println(result);
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];

            }
        }
        return -1;
    }
}
