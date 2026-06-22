import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
    /*
    LeetCode Problem: 1833, Link :- https://leetcode.com/problems/maximum-ice-cream-bars
    Logic :
        1. We will sort the costs array in ascending order.
        2. We will keep adding the costs of ice cream bars to a sum until the sum exceeds the number of coins we have.
        3. We will keep track of the number of ice cream bars we can buy.

    Time Complexity: O(n log n), where n is the length of the costs array, since we are sorting the array.
    Space Complexity: O(1), since we are using only a constant amount of extra space.
    */
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int s=0, c=0;
        for(int i=0; i<costs.length; i++){
            s += costs[i];
            if(s<=coins){
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}
