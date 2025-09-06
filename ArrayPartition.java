// https://leetcode.com/problems/array-partition/description/?envType=problem-list-v2&envId=greedy

public class ArrayPartition {

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = arrayPairSum(nums);
        System.out.println("Maximized sum of pairs: " + result);
    }
    public static int arrayPairSum(int[] nums) {
        java.util.Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
    // public static int arrayPairSum(int[] nums) {
    //     int[] freq = new int[20001];  // Range: -10000 to 10000
        
    //     // Count frequencies
    //     for (int num : nums) {
    //         freq[num + 10000]++;
    //     }
        
    //     int sum = 0;
    //     boolean isFirst = true;
        
    //     // Iterate through frequencies to form pairs
    //     for (int i = 0; i < freq.length; i++) {
    //         while (freq[i] > 0) {
    //             if (isFirst) {
    //                 sum += i - 10000;  // Convert back to original number
    //             }
    //             isFirst = !isFirst;
    //             freq[i]--;
    //         }
    //     }
        
    //     return sum;
    // }
}