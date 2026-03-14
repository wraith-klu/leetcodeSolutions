import java.util.HashSet;

// https://leetcode.com/problems/happy-number/?envType=problem-list-v2&envId=two-pointers

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean result = isHappy(n);
        System.out.println(result);
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}