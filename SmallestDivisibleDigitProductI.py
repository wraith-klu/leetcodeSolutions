class Solution:
    def product(self, n):
        p = 1
        while n > 0:
            r = n % 10
            p *= r
            n //= 10
        return p

    def smallestNumber(self, n: int, t: int) -> int:
        while True:
            if self.product(n) % t == 0:
                return n
            n += 1

def main():
    n = int(input("Enter the no : "))
    t = int(input("Enter the no : "))
    obj = Solution()
    print(f"The smallest number whose product of digits is divisible by {t} is: {obj.smallestNumber(n, t)}")

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 3345. Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/
Logic:
    The problem requires finding the smallest integer greater than or equal to n such that the product of its digits is divisible by t. 
    We can achieve this by iterating through integers starting from n and calculating the product of their digits. 
    If the product is divisible by t, we return that integer.

Time Complexity: O(k * d) - where k is the number of integers we check starting from n, and d is the number of digits in each integer. In the worst case, we may have to check many integers before finding one that satisfies the condition.
Space Complexity: O(1) - We use a constant amount of space to store the product and the current integer being checked.
"""