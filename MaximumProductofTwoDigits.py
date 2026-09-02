class Solution:
    def maxProduct(self, n: int) -> int:
        m1=-1
        m2=-1
        while n>0:
            r = n%10
            if r>m1:
                m2 = m1
                m1 = r
            elif r>m2:
                m2 = r
            n //= 10

        return m1*m2



def main():
    n = int(input("Enter a number: "))
    obj = Solution()
    print("Maximum Product of Two Digits =", obj.maxProduct(n))

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 3536. Link: https://leetcode.com/problems/maximum-product-of-two-digits/
Logic:
    To find the maximum product of two digits in a number, we can iterate through each digit of the number and keep track of the two largest digits found so far.
    1. Initialize two variables, m1 and m2, to store the largest and second largest digits, respectively.
    2. While the number is greater than 0, extract the last digit using modulo operation.
    3. Compare the extracted digit with m1 and m2 to update them accordingly.
    4. After processing all digits, return the product of m1 and m2.

Time Complexity: O(d) - where d is the number of digits in the number. We need to traverse all digits once.
Space Complexity: O(1) - We are using a constant amount of space regardless of the input size.
"""