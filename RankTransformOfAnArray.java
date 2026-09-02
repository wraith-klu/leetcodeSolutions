import java.util.*;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] rankTransformedArray = arrayRankTransform(arr);
        System.out.print("The rank transformed array is: ");
        System.out.println(Arrays.toString(rankTransformedArray));
    }
    /*
    LeetCode Problem: 1331, Link :- https://leetcode.com/problems/rank-transform-of-an-array
    Logic :
        1. We will create a copy of the input array and sort it.
        2. We will use a HashMap to store the rank of each unique number.
        3. We will iterate through the sorted array and assign ranks to each unique number.
        4. We will then iterate through the original array and replace each number with its rank from the HashMap.
        5. Finally, we will return the rank-transformed array.

    Time Complexity: O(n log n), where n is the length of the input array, due to sorting.
    Space Complexity: O(n), since we are using a HashMap to store the ranks of the numbers.
    */
    public static int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : copy) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
