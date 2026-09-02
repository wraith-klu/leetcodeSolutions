
from typing import List

class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)
        m = -1
        for i in range(n-1, -1, -1):
            x = arr[i]
            arr[i] = m
            m = max(x, m)

        return arr
        
        

def main():
    arr = [17, 18, 5, 4, 6, 1]
    result = Solution()
    print(result.replaceElements(arr))

if __name__ == "__main__":
    main()