public class MaxConsecutiveOnes {
    // https://leetcode.com/problems/max-consecutive-ones/description/

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, temp = 0, i = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if (c < temp) {
                    c = temp;
                }
                temp = 0;  
            }
            i++;
        }

        if (c < temp) {
            c = temp;
        }

        return c;
    }
}
