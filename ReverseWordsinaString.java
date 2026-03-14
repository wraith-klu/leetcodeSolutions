// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=problem-list-v2&envId=two-pointers

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "the  sky   is blue    ";
        String result = reverseWords(s);
        System.out.println(result);
    }
    public static String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");

        int i = 0, j = a.length - 1;
        while (i < j) {
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", a);
    }
}
