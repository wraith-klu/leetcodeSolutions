public class CheckifArrayIsSortedandRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        boolean result = check(nums);
        System.out.println(result);

    }
    public static boolean check(int[] nums){
        int breakCount = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){  // at last index compare with first index (Ex - i =4, the 4+1 % 5 = 0, compare last with first index value)
                breakCount++;
            }
        }
        return breakCount <= 1;
    }
}
