from typing import List

class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        nums.sort()

        ans = []
        j = 0
        for i in range(nums[0], nums[-1] + 1):
            if nums[j] == i:
                j += 1
            else:
                ans.append(i)

        return ans
    
def main():
    nums = list(map(int, input("Enter array elements: ").split()))
    obj = Solution()
    print("Missing Elements =", obj.findMissingElements(nums))

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 3731. Link: https://leetcode.com/problems/find-missing-elements/    
Logic:
    To find the missing elements in an array, we can follow these steps:
        1. Sort the input array to arrange the elements in ascending order.
        2. Initialize an empty list `ans` to store the missing elements and a pointer `j` to track the current index in the sorted array.
        3. Iterate through the range from the minimum element (nums[0]) to the maximum element (nums[-1]) of the sorted array.
            - If the current number `i` matches the element at index `j` in the sorted array, increment `j`.
            - If it does not match, append `i` to the `ans` list as it is a missing element.
        4. Return the list of missing elements.
    
Time Complexity: O(n log n) - The sorting step takes O(n log n) time, and the subsequent iteration through the range takes O(n) time.
Space Complexity: O(n) - We are using an additional list to store the missing elements, which can take up to O(n) space in the worst case.    
"""