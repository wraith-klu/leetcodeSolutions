import java.util.*;

// https://leetcode.com/problems/assign-cookies/?envType=problem-list-v2&envId=array

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {7, 9, 6, 12, 4, 3};
        int[] s = {4, 9, 5, 12, 2, 6};

        System.out.println("Number of content is : "+ findContentChildren(g, s) );
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content = 0;
        int i=0, j=0;
        while(i<g.length && j<s.length){
            if(g[i]<= s[j]){
                content++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return content;
    }
}