public class ContainerWithMostWater {

// https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(height);
        System.out.println("Maximum area: " + maxArea);
    }
    
    /*
    Leetcode Problem : 11, Link: https://leetcode.com/problems/container-with-most-water/
    Logic:
        > Initialize two pointers, one at the beginning of the array (left) and one at the end of the array (right).
        > Calculate the area formed by the lines at the left and right pointers and update the maximum area if necessary.
        > Move the pointer that has the shorter line towards the other pointer, as this may increase the area.
        > Repeat this process until the left pointer is no longer less than the right pointer.
        > Return the maximum area found.
     */

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = width * currentHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
