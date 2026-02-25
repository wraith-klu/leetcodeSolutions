// https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=problem-list-v2&envId=two-pointers

public class ReverseVowelsofaString {
    public static void main(String[] args) {
        String s = "IceCreAm";

        String answer = reverseVowels(s);
        System.out.println(answer);
    }
    
    public static String reverseVowels(String s) {

        char[] a = s.toCharArray();

        int i = 0, j = a.length - 1;

        while (i < j) {

            while (i < j && !isVowel(a[i]))
                i++;
            while (i < j && !isVowel(a[j]))
                j--;

            char t = a[i];
            a[i] = a[j];
            a[j] = t;

            i++;
            j--;
        }

        return new String(a);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
