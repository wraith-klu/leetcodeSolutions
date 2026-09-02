from typing import List

class Solution:
    def maxLoot(self, nums, id, dp):
        if id>=len(nums):
            return 0
        
        if dp[id] != -1:
            return dp[id]

        steal = nums[id] + self.maxLoot(nums, id+2, dp)
        skip = self.maxLoot(nums, id+1, dp)

        dp[id] = max(steal, skip)
        return dp[id]

    def rob(self, nums: List[int]) -> int:
        dp = [-1] * len(nums)
        return self.maxLoot(nums, 0, dp)

def main():
    nums = list(map(int, input("Enter the values of nums separated by spaces: ").split()))
    obj = Solution()
    print(f"The maximum amount of money that can be robbed is: {obj.rob(nums)}")

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 198. Link: https://leetcode.com/problems/house-robber/
Logic:
    To solve the House Robber problem, we can use dynamic programming with memoization. The idea is to decide for each house whether to rob it or skip it. 
    If we rob the current house, we cannot rob the next one, so we move to the house after the next. If we skip the current house, we can consider robbing the next one.
    
    We can implement this using a recursive function that checks if the maximum loot from the current index has already been computed and stored in a dp array. 
    If it has, we return that value; otherwise, we compute it recursively and store it in the dp array for future reference.

Time Complexity: O(n) - Each house is considered only once, and the result is stored in the dp array.
Space Complexity: O(n) - We use an additional array of size n to store the computed maximum loot values.
"""