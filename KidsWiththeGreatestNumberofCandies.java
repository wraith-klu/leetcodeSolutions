import java.util.*;


class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        KidsWiththeGreatestNumberofCandies solution = new KidsWiththeGreatestNumberofCandies();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
    /*
    LeetCode Problem : 1431, Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    Logic:
        > First, we find the maximum number of candies that any kid currently has.
        > Then, we iterate through the list of candies for each kid and check if adding the extra candies to their current count would make it greater than or equal to the maximum number of candies found in the previous step.
        > We store the result (true or false) in a list and return it at the end.

    Time Complexity: O(n) where n is the number of kids, since we need to iterate through the list of candies twice (once to find the maximum and once to check each kid).
    Space Complexity: O(n) for the result list that stores the boolean values for each kid.
    */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies any kid has
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Determine if each kid can have the greatest number of candies with the extra candies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}