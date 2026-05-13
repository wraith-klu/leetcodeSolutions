import java.math.BigInteger;

// LeetCode Problem - 43, Link: https://leetcode.com/problems/multiply-strings/

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String ans = multiply(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " = " + ans);
    }
    public static String multiply(String num1, String num2) {
        // Convert the input strings to BigInteger for multiplication
        BigInteger n = new BigInteger(num1);
        BigInteger m = new BigInteger(num2);

        // Perform multiplication
        BigInteger product = n.multiply(m);

        // Convert the product back to a string and return
        return product.toString();
    }

}
