public class UglyNumberII {
    public static void main(String[] args) {
        int n = 10;
        int result = nthUglyNumber(n);
        System.out.println("The " + n + "th ugly number is: " + result);
    }
    /*
    Leetcode Problem : 264, Link: https://leetcode.com/problems/ugly-number-ii/
    Logic :-
        > Create an array to store the ugly numbers.
        > Initialize the first ugly number as 1.
        > Use three pointers to keep track of the next multiple of 2, 3, and 5.
        > For each iteration, calculate the next ugly number as the minimum of the next multiples of 2, 3, and 5.
        > Update the pointers accordingly.
        > Return the nth ugly number from the array.
    */
    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];

        ugly[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for(int i = 1; i < n; i++) {

            int next2 = ugly[i2] * 2;
            int next3 = ugly[i3] * 3;
            int next5 = ugly[i5] * 5;

            int nextUgly = Math.min(next2, Math.min(next3, next5));

            ugly[i] = nextUgly;

            if(nextUgly == next2) {
                i2++;
            }

            if(nextUgly == next3) {
                i3++;
            }

            if(nextUgly == next5) {
                i5++;
            }
        }

        return ugly[n - 1];
    }
}
