# LeetCode Problem: 342: Power of Four, Link: https://leetcode.com/problems/power-of-four/
# Logic :-
    # A number n is a power of four if it can be expressed as 4^k, where k is an integer.
    # To determine if n is a power of four, we can repeatedly divide n by 4 until n is no longer divisible by 4.
    # If after dividing n by 4 repeatedly we end up with 1, then n is a power of four. Otherwise, it is not.

# Time Complexity: O(log n) - In the worst case, we will divide n by 4 until we reach 1, which takes log base 4 of n steps.
# Space Complexity: O(1) - We are using a constant amount of space to store the variable n and the loop counter.


def isPowerOfFour(n: int) -> bool:
    if n <= 0:
        return False
    while n % 4 == 0:
        n //= 4
    return n == 1

n = int(input("Enter a number: "))

if isPowerOfFour(n):
    print(f"Yes, {n} is a power of 4.")
else:
    print(f"No, {n} is not a power of 4.")