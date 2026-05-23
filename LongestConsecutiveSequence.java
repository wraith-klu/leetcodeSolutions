import java.util.HashSet;

// Leetcode Problem : 128, Link: https://leetcode.com/problems/longest-consecutive-sequence/

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }
    /*
    Logic:
        > Convert the array to a HashSet to remove duplicates and allow O(1) lookup time.
        > Iterate through each number in the HashSet.
        > For each number, count the consecutive numbers in the HashSet.
        > Return the maximum count.
    */
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int c = 0;
        for(int num : set) {
            int currentNum = num;
            int count = 1;

            // Count consecutive numbers
            while (set.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }

            c = Math.max(c, count);
        }
        return c;
    }
}