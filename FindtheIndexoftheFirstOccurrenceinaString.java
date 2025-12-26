// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        System.out.print("The index of the first occurrence of the needle in the haystack is: ");
        System.out.println(result);
    }
    // public static int strStr(String haystack, String needle) {

    //     return haystack.indexOf(needle);
    // }
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<=n-m; i++){
            int j = 0;

            while(j<m && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
}
