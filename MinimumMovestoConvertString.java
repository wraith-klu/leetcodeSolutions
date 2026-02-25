public class MinimumMovestoConvertString {

// https://leetcode.com/problems/minimum-moves-to-convert-string/description/?envType=problem-list-v2&envId=greedy

    public static void main(String[] args) {
        String s = "XXX000XXXX0XX";
        int result = minMoves(s);
        System.out.println("Minimum m to convert string: " + result);
    }
    public static int minMoves(String s) {
        int m = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (s.charAt(i) == 'X') {
                m++;
                i += 3;                         // Skip the next two characters as they will be converted in this move
            } else {
                i++;
            }
        }

        return m;
    }
}
