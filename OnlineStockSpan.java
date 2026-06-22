import java.util.*;

/*
LeetCode Problem : 901, Link: https://leetcode.com/problems/online-stock-span/
Logic:
    > Use a stack to keep track of the stock prices and their corresponding spans.
    > For each new price, pop elements from the stack while the top of the stack has a price less than or equal to the current price. 
      For each popped element, add its span to the current span.
    > Push the current price and its span onto the stack.
    > Return the current span.

Time Complexity: O(n) in the worst case, where n is the number of calls to the next method. Each price is pushed and popped at most once.
Space Complexity: O(n) in the worst case, if all prices are in increasing order, we will push all of them onto the stack.
*/

public class OnlineStockSpan {

    Stack<int[]> stack;

    public OnlineStockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price) {

            span += stack.peek()[1];

            stack.pop();
        }

        stack.push(new int[]{price, span});

        return span;
    }

    public static void main(String[] args) {

        OnlineStockSpan s = new OnlineStockSpan();

        System.out.println(s.next(100)); // 1
        System.out.println(s.next(80));  // 1
        System.out.println(s.next(60));  // 1
        System.out.println(s.next(70));  // 2
        System.out.println(s.next(60));  // 1
        System.out.println(s.next(75));  // 4
        System.out.println(s.next(85));  // 6
    }
}