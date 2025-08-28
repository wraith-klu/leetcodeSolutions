public class JumpGame {

// https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=greedy

    public static void main(String[] args) {
        int[] nums = {1,0,3,2,1,0,4};
        boolean canReachEnd = canJump(nums);
        System.out.println("Can reach the last index: " + canReachEnd);
    }

    public static boolean canJump(int[] nums) {
        int maxReachable = 0;
        for(int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }
        return true;
    }
}