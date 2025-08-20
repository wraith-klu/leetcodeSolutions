import java.util.Arrays;

public class PlusOne {

// https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        int[] digits = { 1,3,9,9 };
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 0]
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits; // No carry needed
            } else {
                digits[i] = 0; // Carry over

                // If we’re at the first digit and it was 9
                if (i == 0) {
                    int[] newNumber = new int[digits.length + 1];
                    newNumber[0] = 1;
                    return newNumber;
                }
            }
        }
        return digits;
    }
}
