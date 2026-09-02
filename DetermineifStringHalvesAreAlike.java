public class DetermineifStringHalvesAreAlike{
    public static void main(String [] args){
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    /*
    Leetcode Question - 1704, Link - https://leetcode.com/problems/determine-if-string-halves-are-alike/
    Logic -
        1. We can use two pointers to check the first half and second half of the string.
        2. We can use a counter to keep track of the number of vowels in the first half and second half of the string.
        3. If the counter is zero, then the two halves are alike, otherwise they are not alike.
    
    Time Complexity - O(n), where n is the length of the string.
    Space Complexity - O(1)
    */
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int i=0, j=(n/2), c=0;
        while(j<n){
            char h1 = s.charAt(i);
            char h2 = s.charAt(j);
            if("aeiouAEIOU".contains(String.valueOf(h1))){
                c++;
            }
            if("aeiouAEIOU".contains(String.valueOf(h2))){
                c--;
            }
            j++;
            i++;
        }
        return c == 0;
    }
}