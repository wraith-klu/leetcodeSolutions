public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int result = reverse(x);
        System.out.println("Reversed integer: " + result);
    }
    public static int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
        //     return 0; // Return 0 if the reversed integer is out of bounds
        // }
        return (int) reversed;
    }
}
