public class LengthofLastWord {

// https://leetcode.com/problems/length-of-last-word/description/

    public static void main(String[] args) {
        String s = "Hello World ";
        int result = lengthOfLastWord(s);
        System.out.println("The length of the last word in the string \"" + s + "\" is: " + result);
    }
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
}
