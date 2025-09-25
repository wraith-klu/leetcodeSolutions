public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean result = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;   
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}
