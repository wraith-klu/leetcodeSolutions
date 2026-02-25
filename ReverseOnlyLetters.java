public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "ab-cd";
        String result = reverseOnlyLetters(s);
        System.out.println(result);
    }
    public static String reverseOnlyLetters(String s) {
        char[] ss = s.toCharArray();

        int i = 0;
        int j = ss.length - 1;

        while (i < j) {

            if (!Character.isLetter(ss[i])) {
                i++;
            } else if (!Character.isLetter(ss[j])) {
                j--;
            } else {
                char t = ss[i];
                ss[i] = ss[j];
                ss[j] = t;

                i++;
                j--;
            }
        }

        return new String(ss);
    }
}
