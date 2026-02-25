public class FibonacciNumber {

    // https://leetcode.com/problems/fibonacci-number/description/
    
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
