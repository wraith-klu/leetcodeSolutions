public class JumpGameTwo {

// https://leetcode.com/problems/jump-game-ii/description/?envType=problem-list-v2&envId=greedy
    public static int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        int minJumps = jump(nums);
        System.out.println("Minimum number of jumps to reach the last index: " + minJumps);
    }
}
