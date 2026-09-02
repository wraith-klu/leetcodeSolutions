class Solution:
    def fibo(self, n, dp):
        if n <= 1:
            return n

        if dp[n] != -1:
            return dp[n]

        dp[n] = self.fibo(n - 1, dp) + self.fibo(n - 2, dp)
        return dp[n]

    def fib(self, n):
        dp = [-1] * (n + 1)
        return self.fibo(n, dp)

def main():
    n = int(input("Enter the value of n: "))
    obj = Solution()
    print(f"The {n}th Fibonacci number is: {obj.fib(n)}")

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 509. Link: https://leetcode.com/problems/fibonacci-number/
Logic:
    To find the nth Fibonacci number, we can use dynamic programming with memoization. The Fibonacci sequence is defined as:
        - F(0) = 0
        - F(1) = 1
        - F(n) = F(n-1) + F(n-2) for n > 1

    We can implement this using a recursive function that checks if the value has already been computed and stored in a dp array. 
    If it has, we return that value; otherwise, we compute it recursively and store it in the dp array for future reference.
    
Time Complexity: O(n) - Each Fibonacci number from 0 to n is computed only once and stored in the dp array.
Space Complexity: O(n) - We use an additional array of size n+1 to store the computed Fibonacci numbers.
"""