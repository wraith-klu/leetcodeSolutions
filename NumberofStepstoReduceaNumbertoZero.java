// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + result);
    }
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    public static int helper(int num, int count) {
        if(num==0) return count;

        if(num%2==0) {
            return helper(num/2, count+1);
        } else {
            return helper(num-1, count+1);
        }
    }
}
