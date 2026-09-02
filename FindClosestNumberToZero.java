public class FindClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {3, -2, 2, 5, -1};
        int closestNumber = findClosestNumberToZero(nums);
        System.out.println("The closest number to zero is: " + closestNumber);
    }
    /*
    LeetCode Problem: 2239, Link :- https://leetcode.com/problems/find-closest-number-to-zero
    Logic :
        1. We will initialize a variable ans to the first element of the input array.
        2. We will iterate through the input array and compare the absolute value of each element with the absolute value of ans.
        3. If the absolute value of the current element is less than the absolute value of ans, we will update ans to the current element.
        4. If the absolute value of the current element is equal to the absolute value of ans, we will check if the current element is greater than ans. If it is, we will update ans to the current element.
            -> We are doing this because we want to return the positive number in case of a tie.
        5. Finally, we will return ans as the closest number to zero.   

    Time Complexity: O(n), where n is the length of the input array, since we are iterating through the array once.
    Space Complexity: O(1), since we are using a constant amount of space to store the variable ans.
    */
    public static int findClosestNumberToZero(int[] nums) {
        int ans = nums[0];
        for (int n : nums) {
            if (Math.abs(n) < Math.abs(ans)) {
                ans = n;
            } else if (Math.abs(n) == Math.abs(ans) && n > ans) {
                ans = n;
            }
        }
        return ans;
    }
}
