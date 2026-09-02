public class ReformatTheString {
    public static void main(String[] args) {
        String s = "a0b1c2";
        String result = reformat(s);
        System.out.println(result);
    }
    /*
    LeetCode Problem: 1417, Link :- https://leetcode.com/problems/reformat-the-string
    Logic :
        1. We will create two StringBuilder objects to store the digits and letters separately.
        2. We will iterate through the input string and append each character to the appropriate StringBuilder based on whether it is a digit or a letter.
        3. We will check the lengths of the two StringBuilders. If the difference in lengths is greater than 1, we will return an empty string since it is not possible to reformat the string.
        4. We will determine which StringBuilder has more characters and use it as the first one to start appending characters alternately.
        5. We will create a new StringBuilder to build the result by appending characters from both StringBuilders alternately.
        6. Finally, we will return the result as a string.

    Time Complexity: O(n), where n is the length of the input string, since we are iterating through the string once.
    Space Complexity: O(n), where n is the length of the input string, since we are using two StringBuilder objects to store the digits and letters separately.
    
    */
    public static String reformat(String s) {
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                letters.append(c);
            }
        }
        
        int dLen = digits.length();
        int lLen = letters.length();
        
        if (Math.abs(dLen - lLen) > 1) {
            return "";
        }
        
        StringBuilder first;
        StringBuilder second;
        if (dLen >= lLen) {
            first = digits;
            second = letters;
        } else {
            first = letters;
            second = digits;
        }
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < second.length()) {
            result.append(first.charAt(i));
            result.append(second.charAt(i));
            i++;
        }
        if (first.length() > second.length()) {
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
