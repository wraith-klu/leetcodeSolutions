// https://leetcode.com/problems/reverse-string-prefix/description/?envType=problem-list-v2&envId=two-pointers


public class ReverseStringPrefix {
    public static void main(String[] args) {
        String s = "wraith";
        int k = 3;
        String result = reverseStringPrefix(s, k);
        System.out.println(result);
    }
    public static String reverseStringPrefix(String s, int k) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = k-1;
        while (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        return new String(a);
    }
}
