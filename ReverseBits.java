public class ReverseBits{
    public static void main(String[] args) {
        int n = 43261596;
        int result = new ReverseBits().reverseBits(n);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 190, Link :- https://leetcode.com/problems/reverse-bits
    Logic :
        1. We will convert the integer to a binary string representation.
        2. We will pad the binary string with leading zeros to make it 32 bits long.
        3. We will reverse the characters in the binary string.
        4. We will convert the reversed binary string back to an integer.
    
    Time Complexity: O(1), since the number of bits is fixed at 32.
    Space Complexity: O(1), since we are using a fixed amount of space for the character array and the binary string.
    */
    public int reverseBits(int n) {
        String s = String.format("%32s",
                Integer.toBinaryString(n)).replace(' ', '0');

        char[] arr = s.toCharArray();

        int i = 0, j = 31;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        long ans = Long.parseLong(new String(arr), 2);
        return (int) ans;
    }
}