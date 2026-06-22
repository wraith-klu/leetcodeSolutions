# LeetCode 326: Power of Three, Link: https://leetcode.com/problems/power-of-three/
# Logic :-
    # A number n is a power of three if it can be expressed as 3^k, where k is an integer.
    # To determine if n is a power of three, we can repeatedly divide n by 3 until n is no longer divisible by 3.
    # If after dividing n by 3 repeatedly we end up with 1, then n is a power of three. Otherwise, it is not.

# Time Complexity: O(log n) - In the worst case, we will divide n by 3 until we reach 1, which takes log base 3 of n steps.
# Space Complexity: O(1) - We are using a constant amount of space to store the variable n and the loop counter.

def isPowerOfThree(n):
    if n <= 0:
        return False
    while n % 3 == 0:
        n //= 3
    return n == 1

n = int(input("Enter a number: "))

if isPowerOfThree(n):
    print(f"Yes, {n} is a power of 3.")
else:    
    print(f"No, {n} is not a power of 3.")
