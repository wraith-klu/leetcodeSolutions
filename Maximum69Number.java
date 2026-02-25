public class Maximum69Number {

// https://leetcode.com/problems/maximum-69-number/description/?envType=problem-list-v2&envId=greedy

    public static void main(String[] args) {
        int num = 9669;
        int result = maximum69Number(num);
        System.out.println(result);
    }
    public static int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
