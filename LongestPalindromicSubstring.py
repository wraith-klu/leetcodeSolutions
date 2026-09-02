class Solution:
    def expandFromCenter(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1

        return r - l - 1

    def longestPalindrome(self, s: str) -> str:
        if len(s) < 1:
            return ""

        st = 0
        e = 0

        for i in range(len(s)):
            oddlen = self.expandFromCenter(s, i, i)
            evenlen = self.expandFromCenter(s, i, i + 1)

            maxlen = max(oddlen, evenlen)

            if maxlen > e - st:
                st = i - (maxlen - 1) // 2
                e = i + maxlen // 2

        return s[st:e + 1]

def main():
    s = input("Enter the string: ")
    obj = Solution()
    print(f"The longest palindromic substring is: {obj.longestPalindrome(s)}")

if __name__ == "__main__":
    main()

"""
Leetcode Problem: 5. Link: https://leetcode.com/problems/longest-palindromic-substring/
Logic:
    To find the longest palindromic substring, we can use the "expand around center" technique. 
    The idea is to consider each character (and the space between characters) as a potential center of a palindrome and expand outwards to check for palindromic substrings.
    For each character in the string, we check for both odd-length and even-length palindromes by expanding from the center. 
    We keep track of the start and end indices of the longest palindrome found during this process.    

Time Complexity: O(n^2) - We check each character and expand around it, which can take linear time in the worst case.
Space Complexity: O(1) - We use a constant amount of space to store the start and end indices of the longest palindrome.
"""