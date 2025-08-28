public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babdssdddsad";
        int result = longestPalindrome(s);
        System.out.println("Length of the longest palindromic substring: " + result);
    }

    public static int longestPalindrome(String s) {
        int[] charCount = new int[128];  // ASCII characters

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Calculate palindrome length
        for (int count : charCount) {
            length += count / 2 * 2;  // Add even counts
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // Add 1 if we have any odd count (center position)
        if (hasOdd) {
            length++;
        }

        return length;
    }
}
