import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
    /*
    LeetCode Problem: 412, Link :- https://leetcode.com/problems/fizz-buzz
    Logic :
        1. We will iterate from 1 to n.
        2. For each number, we will check if it is divisible by 3 and 5, if yes, we will add "FizzBuzz" to the list.
        3. If it is only divisible by 3, we will add "Fizz" to the list.
        4. If it is only divisible by 5, we will add "Buzz" to the list.
        5. If it is not divisible by either, we will add the number itself to the list.

    Time Complexity: O(n), where n is the input number, since we are iterating from 1 to n.
    Space Complexity: O(n), since we are storing the result in a list of size n.
    */
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        int i=1;
        while(i<=n){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
            i++;
        }
        return list;
    }
}
