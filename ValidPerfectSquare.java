public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        boolean result = isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
    public static boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        long start = 1, end = num;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            
            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
