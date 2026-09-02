from typing import List


class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()

        n = len(nums)
        return max(
            nums[n-1] * nums[n-2] * nums[n-3],
            nums[0] * nums[1] * nums[n-1]
        )

def main():
    nums = list(map(int, input("Enter array elements: ").split()))
    obj = Solution()
    print("Maximum Product of Three Numbers =", obj.maximumProduct(nums))

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 628. Link: https://leetcode.com/problems/maximum-product-of-three-numbers/
Logic:
    To find the maximum product of three numbers in an array, we can sort the array and consider two possible cases:
        1. The product of the three largest numbers.
        2. The product of the two smallest numbers (which could be negative) and the largest number.
    We return the maximum of these two products.

Time Complexity: O(n log n) - We need to sort the array, which takes O(n log n) time.
Space Complexity: O(1) - We are using a constant amount of space regardless of the input size.
"""