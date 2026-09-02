public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String s = "3200014888";
        String result = largest3SameDigitNumber(s);
        System.out.println("The largest 3 same digit number in the string is: " + result);
    }
    /*
    LeetCode Problem: 2264, Link :- https://leetcode.com/problems/largest-3-same-digit-number-in-string
    Logic :
        1. We will iterate through the input string and check for every position if the current character and the previous two characters are the same.
        2. If they are the same, we will calculate the sum of their numeric values.
        3. We will keep track of the maximum sum found so far and the corresponding substring.
        4. Finally, we will return the substring with the maximum sum.

    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string once.
    Space Complexity: O(1), since we are using a constant amount of space to store the variables.
    */
    public static String largest3SameDigitNumber(String num) {
        String s= "";
        int c = -1, i=2;
        while(i<num.length()){
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                int z = (num.charAt(i) - '0') + (num.charAt(i-1) - '0') + (num.charAt(i-2) - '0');
                if (z > c) {
                    c = z;
                    s = num.substring(i - 2, i + 1);
                }
            }
            i++;
        }
        return s;
    }
}
