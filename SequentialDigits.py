def sequentialDigits(low: int, high: int) -> list[int]:
    ans = []
    digits = "123456789"

    for length in range(2, 10):
        for start in range(10 - length):
            num = int(digits[start:start + length])
            if low <= num <= high:
                ans.append(num)

    return ans

"""
Leetcode Problem: 1291. Link: https://leetcode.com/problems/sequential-digits/
Logic:
    Generate all possible sequential digits within the given range.
    Use a string of digits "123456789" to create numbers of varying lengths.
    Then check if each generated number falls within the specified range [low, high].
    Then return the list of valid sequential digits.

Time Complexity: O(1) - The number of sequential digits is constant and does not depend on the input size.
Space Complexity: O(1) - The space used for the result list is constant and does not depend on the input size.
"""


def main():
    low = int(input("Enter low: "))
    high = int(input("Enter high: "))

    result = sequentialDigits(low, high)

    print("Sequential Digits:", result)


if __name__ == "__main__":    # We are using this to run the main function only when this script is executed directly, not when imported as a module.
    main()