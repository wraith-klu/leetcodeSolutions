public class LengthofLastWord {

// https://leetcode.com/problems/length-of-last-word/description/

    public static void main(String[] args) {
        String s = "Hello World ";
        int result = lengthOfLastWord(s);
        System.out.println("The length of the last word in the string \"" + s + "\" is: " + result);
        int res2 = method2(s);
        System.out.println("Length of last word : " + res2);
    }
    /*
    Leetcode Problem : 58, Link: https://leetcode.com/problems/length-of-last-word/
    Logic:
        > Trim the input string to remove leading and trailing spaces.
        > Initialize a counter (n) to 0 and an index (i) to the last character of the trimmed string.
        > Iterate backwards through the string until you encounter a space or reach the beginning of the string, incrementing the counter for each character encountered.
        > Return the counter as the length of the last word.

    Time Complexity: O(n), where n is the length of the input string, because in the worst case we may need to traverse the entire string once.
    Space Complexity: O(1), because we are using only a constant amount of extra space for the counter and index variables.
    */
    public static int lengthOfLastWord(String s) {
        s = s.trim(); 

        int n = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') {
            n++;
            i--;
        }
        return n;
    }
    public static int method2(String s){
        String[] w = s.split(" ");

        String z = w[w.length-1];
        return z.length();
    }
}
