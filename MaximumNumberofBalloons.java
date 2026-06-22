public class MaximumNumberofBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        int result = maxNumberOfBalloons(text);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1189, Link :- https://leetcode.com/problems/maximum-number-of-balloons
    Logic :
        1. We will count the occurrences of each character in the string that are needed to form the word "balloon".
        2. We will then calculate how many times we can form the word "balloon" using the counts of the characters.
        3. Since 'l' and 'o' are needed twice in the word "balloon", we will divide their counts by 2 before calculating the minimum.

    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string once to count the characters.
    Space Complexity: O(1), since we are using a fixed number of variables to count the characters and calculate the result.
    */
    public static int maxNumberOfBalloons(String text) {
        int bc=0, ac=0, lc=0, oc=0, nc=0;
        for(char c:text.toCharArray()){
            if(c=='b') bc++;
            else if(c=='a') ac++;
            else if(c=='l') lc++;
            else if(c=='o') oc++;
            else if(c=='n') nc++;
        }
        if(bc==1 && (lc < 2 || oc < 2)) return 0;
        int r = Math.min(bc, Math.min(ac, Math.min(lc/2, Math.min(oc/2, nc))));
        return r;
    }
}
