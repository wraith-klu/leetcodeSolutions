public class AddStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(addStrings(num1, num2));
    }
    /*
    LeetCode Problem: 415, Link :- https://leetcode.com/problems/add-strings
    Logic :
        1. We will iterate through both strings from right to left.
        2. For each position, we will add the corresponding digits along with any carry from the previous position.
        3. We will append the units digit of the sum to the result and update the carry.
        4. We will continue until we have processed all digits in both strings and there is no carry left.

    Time Complexity: O(max(m, n)), where m and n are the lengths of the two input strings.
    Space Complexity: O(max(m, n)), for storing the result.
    */
    public static String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0) {
            int d1 = 0;
            if(i >= 0){
                d1 = num1.charAt(i) - '0';
            }
            int d2 = 0;
            if(j >= 0){
                d2 = num2.charAt(j) - '0';
            }
            int sum = d1 + d2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}
