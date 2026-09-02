import math
from typing import List

class Solution:
    def findGCD(self, nums: List[int]) -> int:
        return math.gcd(min(nums), max(nums))

def main():
    nums = list(map(int, input("Enter array elements: ").split()))
    obj = Solution()
    print("GCD =", obj.findGCD(nums))

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 1979. Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
Logic:
    To find the greatest common divisor (GCD) of an array, we can utilize the property that the GCD of the entire array is equal to the GCD of the minimum and maximum elements in the array.
        1. Find the minimum and maximum elements in the array.
        2. Use the built-in math.gcd function to compute the GCD of these two elements.

Time Complexity: O(n) - We need to traverse the array once to find the minimum and maximum elements.
Space Complexity: O(1) - We are using a constant amount of space regardless of the input size.
"""