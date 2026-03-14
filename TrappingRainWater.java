// https://leetcode.com/problems/trapping-rain-water/?envType=problem-list-v2&envId=two-pointers


public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int ans = trap(height);
        System.out.println("Maximum traped water is : " + ans);

    }
    
    public static int trap(int[] height) {
        int s = 0, e = height.length - 1;
        int sMax = 0, eMax = 0;
        int water = 0;

        while (s < e) {

            if (height[s] < height[e]) {

                if (height[s] >= sMax) {
                    sMax = height[s];
                } else {
                    water += sMax - height[s];
                }

                s++;

            } else {

                if (height[e] >= eMax) {
                    eMax = height[e];
                } else {
                    water += eMax - height[e];
                }

                e--;
            }
        }

        return water;
    }
}
