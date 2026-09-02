import java.util.*;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    LeetCode Problem: 1089, Link :- https://leetcode.com/problems/duplicate-zeros
    Logic :
        1. We will iterate through the array and for each element, we will check if it is zero.
        2. If it is zero, we will append two zeros to a StringBuilder. Otherwise, we will append the element to the StringBuilder.
        3. Finally, we will copy the first n elements of the StringBuilder back to the original array.

    Time Complexity: O(n), where n is the length of the input array, since we are iterating through the array once.
    Space Complexity: O(n), since we are using a StringBuilder to store the elements.
    */
    public static void duplicateZeros(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num);
            if (num == 0) {
                sb.append(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sb.charAt(i) - '0';
        }
    }
}
