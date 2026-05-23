import java.util.ArrayList;

// LeetCode Problem : 1539, Link: https://leetcode.com/problems/kth-missing-positive-number/

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int kthMissing = findKthMissingPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + kthMissing);
        int kthMissingBinarySearch = findKthPositiveMissingNo(arr, k);
        System.out.println("The " + k + "th missing positive number using binary search is: " + kthMissingBinarySearch);
        int kthMissing1 = findKthMissingPositive1(arr, k);
        System.out.println("The " + k + "th missing positive number using HashSet approach is: " + kthMissing1);
    }

    /*
      Kth Missing Positive Number Algorithm : -
        We can use a two-pointer approach to find the kth missing positive number.
        We maintain a pointer for the current number we are checking and another pointer for the index in the array.
        We iterate through the numbers starting from 1 and check if they exist in the array.
        If a number is missing, we decrement k. When k reaches 0, we have found our kth missing positive number.
     */
    public static int findKthMissingPositive(int[] arr, int k) {
        int current = 1;
        int i = 0;

        while (true) {

            // number exists in array
            if (i < arr.length && arr[i] == current) {
                i++;
            }

            // number is missing
            else {
                k--;

                if (k == 0) {
                    return current;
                }
            }

            current++;
        }
    }
   /* Logic for Kth Missing Positive Number using Binary Search:

        1. In a perfect sorted array without missing numbers:

            Index : 0 1 2 3
            Value : 1 2 3 4

        So expected value at index i should be: expected = i + 1

        2. But due to missing numbers, actual value becomes larger.

        Example:

            arr = [2,3,4,7,11]
            At index 3:
                actual value = 7
                expected value = 4

            Missing numbers before index 3: 7 - 4 = 3

            Missing numbers are: [1,5,6]

        3. Formula: missing = arr[i] - (i + 1)

        4. Using Binary Search:
            - If missing < k
                → kth missing number lies on right side
            - Else
                → kth missing number lies on left side

        5. After binary search ends: answer = start + k

        because:
        - start = count of array elements before answer
        - k = kth missing number position

        6. Time Complexity  : O(log n)
        Space Complexity : O(1)

*/

    public static int findKthPositiveMissingNo(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {

            int m = s + (e - s) / 2;

            int missing = arr[m] - (m + 1);

            if (missing < k) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s + k;
    }

    public static int findKthMissingPositive1(int[] arr, int k) {

        int mc =0, pc=0, i=1, n = arr.length-1, z = arr[n];
        ArrayList<Integer> list = new ArrayList<>();
        while(i<z){
            if(arr[pc]==i) pc++;
            else{
                mc++;
                list.add(i);
            }

            if(mc == k) return list.get(mc-1);
            i++;
        }
        if(mc != k){
            return (z+(k-mc));
        }
        return 0;
    }
}
