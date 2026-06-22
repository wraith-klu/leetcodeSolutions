public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits1(num));
        System.out.println(addDigits2(num));
    }
    /*
    LeetCode Problem: 258, Link :- https://leetcode.com/problems/add-digits
    Logic :
        Formula to find the digital root of a number is:
        digital_root(n) = 1 + (n - 1) % 9,
        where n is the input number.

    Time Complexity: O(1) for addDigits1.
    Space Complexity: O(1).
    */
    public static int addDigits1(int num) {
        if(num == 0) return 0;
        return 1+(num-1) % 9;
    }

    /*
    Logic :
        1. We will keep summing the digits of the number until the number becomes a single digit.
        2. We will use a helper function sum to calculate the sum of digits of a number.

    Time Complexity: O(log n), where n is the input number, since we are summing the digits of the number repeatedly.
    Space Complexity: O(1).
    */
   
    public static int addDigits2(int num) {
        while(num >= 10){
            num = sum(num);
        }
        return num;
    }
    public static int sum(int n){
        int s =0;
        while(n>0){
            int r = n%10;
            s += r;
            n /= 10;
        }
        return s;
    }
}
