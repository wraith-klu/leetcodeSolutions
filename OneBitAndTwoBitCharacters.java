// https://leetcode.com/problems/1-bit-and-2-bit-characters/submissions/1943069245/?envType=problem-list-v2&envId=array

public class OneBitAndTwoBitCharacters {
    public static void main(String[] args) {
        int[] bits = {1,0,0};
        boolean result = isOneBitCharacter(bits);
        System.out.println(result);
    }
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0, n= bits.length - 1;
        while(i<n){
            if(bits[i]==0){
                i++;
            }else{
                i+=2;
            }
        }
        return i == n;

    }
}


/*
Core Logic->
 
We must decode the array from left to right because characters are formed sequentially.
 
Rule while decoding

If you see 0
→ it is a one-bit character
→ move 1 step
 
If you see 1
→ it must form a two-bit character (10 or 11)
→ move 2 steps

-> if i reach the last index, then return true, otherwise return false
 */