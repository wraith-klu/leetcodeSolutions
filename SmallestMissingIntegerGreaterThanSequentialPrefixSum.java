import java.util.HashSet;

class SmallestMissingIntegerGreaterThanSequentialPrefixSum{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = missingInteger(nums);
        System.out.println(result); // Output: 15
    }
    /*
    Leetcode - 3001, Link: https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
    Logic:
            1. Initialize a variable s with the first element of the array.
            2. Iterate through the array starting from the second element.
            3. If the current element is not equal to the previous element + 1, break the loop.
            4. Otherwise, add the current element to s.
            5. Create a HashSet to store all the elements of the array.
            6. While the HashSet contains s, increment s by 1.
            7. Return s as the smallest missing integer greater than the sequential prefix sum.

    Time Complexity: O(n), where n is the length of the input array. We iterate through the array once to calculate the sequential prefix sum and then check for the smallest missing integer.
    Space Complexity: O(n), where n is the length of the input array. We use a HashSet to store the elements of the array, which requires additional space.
    */
    public static int missingInteger(int[] nums) {
        int s = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1] + 1)
                break;
            s += nums[i];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        while(set.contains(s))
            s++;

        return s;
    }
}