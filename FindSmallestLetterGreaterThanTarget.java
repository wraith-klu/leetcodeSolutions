public class FindSmallestLetterGreaterThanTarget {

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = nextGreatestLetter(letters, target);
        System.out.println("Smallest letter greater than target: " + result);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1; // Move to the end half
            } else {
                end = mid - 1; // Move to the start half
            }
        }

        // If start is out of bounds, wrap around to the first element
        return letters[start % letters.length];
    }
}
