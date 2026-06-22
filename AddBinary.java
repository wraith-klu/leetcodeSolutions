public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        String ans = addBinary(a, b);
        System.out.println("Sum of binary strings: " + ans);
    }
    /*
    LeetCode Problem - 67, Link: https://leetcode.com/problems/add-binary/
    Logic:
        1. We can use two pointers to traverse both binary strings from the end (least significant bit) to the beginning (most significant bit).
        2. We maintain a carry variable to keep track of any carry that may occur during the addition.
        3. For each pair of bits (and the carry), we calculate the sum and determine the resulting bit and the new carry.
        4. We append the resulting bit to a StringBuilder and reverse it at the end to get the final binary sum.

    Time Complexity: O(max(m, n)) - We traverse both strings once, where m and n are the lengths of the two binary strings.
    Space Complexity: O(max(m, n)) - The space used by the StringBuilder to store the result can be at most the length of the longer string plus one (in case of a carry).
    */
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }
}
