import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=binary-search

public class IntersectionofTwoArraysTwo {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int pointer1 = 0;
        int pointer2 = 0;
        int index = 0;
        int[] intersection = new int[Math.min(nums1.length, nums2.length)];
        
        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] == nums2[pointer2]) {
                intersection[index++] = nums1[pointer1];
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
        
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
