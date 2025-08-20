public class MissingNumber {

// https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 4};
        int result = missingNumber(nums);
        System.out.println(result);
    }
    public static int missingNumber(int[] nums){
        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] ;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}
