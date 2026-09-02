public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        int totalBottles = numWaterBottles(numBottles, numExchange);
        System.out.println("Total number of bottles that can be drunk: " + totalBottles);
    }
    /*
    LeetCode Problem: 1518, Link :- https://leetcode.com/problems/water-bottles
    Logic :
        1. We will initialize a variable c to the number of bottles we can drink initially, which is equal to numBottles.
        2. We will also initialize a variable s to the number of empty bottles we have, which is also equal to numBottles.
        3. We will enter a while loop that continues as long as the number of empty bottles (s) is greater than or equal to the number of bottles needed for an exchange (numExchange).
        4. Inside the loop, we will calculate how many new bottles we can get by exchanging the empty bottles (s/numExchange) and add that to our total count (c).
        5. We will then update the number of empty bottles (s) to be the sum of the new empty bottles from the exchange and any remaining empty bottles (s%numExchange).
        6. Finally, we will return the total count of bottles that can be drunk (c).

    Time Complexity: O(log(n)), where n is the number of bottles, since we are reducing the number of empty bottles in each iteration of the loop.
    Space Complexity: O(1), since we are using a constant amount of space to store the variables c and s.
    */
    public static int numWaterBottles(int numBottles, int numExchange) {
        int c = numBottles, s=numBottles;
        while(s>=numExchange){
            int ex = s/numExchange;
            c += ex;
            s = ex + (s%numExchange);
        }
        return c;
    }
}
