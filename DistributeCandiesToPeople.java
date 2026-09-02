public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4;
        int[] result = distributeCandies(candies, num_people);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    /*
    LeetCode Problem: 1103, Link :- https://leetcode.com/problems/distribute-candies-to-people
    Logic :
        1. We will distribute candies to people in a cyclic manner.
        2. In each iteration, we will give the current person a number of candies equal to the iteration count.
        3. We will continue this process until all candies are distributed.

    Time Complexity: O(√n), where n is the number of candies, since we are giving candies in an arithmetic sequence.
    Space Complexity: O(1), since we are using a fixed amount of space for the variables (excluding the output array).
    */
    public static int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];

        int give = 1;
        int person = 0;
        while (candies > 0) {
            if (candies >= give) {
                result[person] += give;
                candies -= give;
            } else {
                result[person] += candies;
                candies = 0;
            }
            give++;
            person = (person + 1) % numPeople;
        }
        return result;
    }
}
