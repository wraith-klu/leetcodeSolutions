public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    /*
    LeetCode Problem: 205, Link :- https://leetcode.com/problems/isomorphic-strings
    Logic :
        1. We will use two arrays to keep track of the last seen index of each character in both strings.
        2. We will iterate through both strings simultaneously and check if the last seen index of the current characters in both strings are the same.
        3. If they are not the same, it means that the characters are not isomorphic and we will return false.
        4. If they are the same, we will update the last seen index of the current characters in both arrays.

    Time Complexity: O(n), where n is the length of the input strings.
    Space Complexity: O(1), since the size of the arrays is fixed (256 for ASCII characters).
    */
    public static boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(a[c1] != b[c2]) {
                return false;
            }
            a[c1] = i + 1;
            b[c2] = i + 1;
        }
        return true;
    }
}
