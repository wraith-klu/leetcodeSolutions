import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// Microsoft Question
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDuplicates(nums);
        System.out.println(result);
    }
    
    public static List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
