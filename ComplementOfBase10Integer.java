// https://leetcode.com/problems/complement-of-base-10-integer/?envType=daily-question&envId=2026-03-11

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        int n = 5;
        int result = bitwiseComplement(n);
        System.out.println(result);
    }
    public static int bitwiseComplement(int n) {
        if(n==0) return 1;

        int mask = 0;
        int t = n;

        while (t > 0) {
            mask = (mask << 1) | 1;
            t >>= 1;
        }

        return n ^ mask;
    }
}

/*
   Core Logic->
   We need to find the complement of the binary representation of the given integer.
   
   Create a mask with all bits = 1 having same length as n
   
   XOR it with n
   
   n = 101010
   mask = 111111
   result = 010101

*/