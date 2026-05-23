import java.util.HashSet;

// LeetCode Problem : 2540, Link: https://leetcode.com/problems/minimum-common-value/
public class MinimumCommonValue {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7};
        System.out.println(minimumCommonValue(arr1, arr2));
    }
    public static int minimumCommonValue(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                return num; 
            }
        }

        return -1; 
    }
}