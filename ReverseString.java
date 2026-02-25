import java.util.Arrays;

// https://leetcode.com/problems/reverse-string/?envType=problem-list-v2&envId=two-pointers

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s){
        int i=0, j= s.length-1;
        while (i<j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;

            i++;
            j--;
        }
        return;
    }
}
