from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        s = 1
        k=0
        for i in range(len(nums)):
            if nums[i] != 0:
                s *= nums[i]
            elif nums[i] == 0:
                k +=1

        for i in range(len(nums)):
            if k==1:
                if nums[i] == 0:
                    nums[i] = s
                else:
                    nums[i] = 0
            elif k==0:
                nums[i] = s//nums[i]
            else:
                nums[i] = 0
        
        return nums

def main():
    nums = list(map(int, input("Enter array elements: ").split()))
    obj = Solution()
    print("Product of Array Except Self =", obj.productExceptSelf(nums))

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 238. Link: https://leetcode.com/problems/product-of-array-except-self/    
Logic:
    To find the product of an array except self, we can follow these steps:
        1. Initialize a variable `s` to store the product of all non-zero elements and a counter `k` to count the number of zeros in the array.
        2. Iterate through the array to calculate the product of non-zero elements and count the zeros.
        3. Iterate through the array again to update each element based on the number of zeros:
            - If there is one zero, set the position of that zero to `s` and all other positions to 0.
            - If there are no zeros, set each position to `s` divided by the element at that position.
            - If there are more than one zero, set all positions to 0.
        
Time Complexity: O(n) - We need to traverse the array twice, which takes linear time.
Space Complexity: O(1) - We are using a constant amount of space regardless of the input size, as we are modifying the input array in place.    
"""