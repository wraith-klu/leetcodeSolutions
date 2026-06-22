def angleClock(hour: int, minutes: int) -> float:
    hour %= 12

    h_angle = 30 * hour + 0.5 * minutes
    m_angle = 6 * minutes

    diff = abs(h_angle - m_angle)

    return min(diff, 360 - diff)

# LeetCode Question - 1344, Link - https://leetcode.com/problems/angle-between-hands-of-a-clock/
# Logic:-
    # 1. The hour hand moves 30 degrees per hour and 0.5 degrees per minute.
    # 2. The minute hand moves 6 degrees per minute.
    # Formula for hour hand angle: h_angle = 30 * hour + 0.5 * minutes
    # Formula for minute hand angle: m_angle = 6 * minutes
    # 3. Calculate the angles of both hands and find the absolute difference. Using formula min(diff, 360 - diff) to get the smaller angle between the two hands.

# Time Complexity: O(1)
# Space Complexity: O(1)

hour = int(input("Enter the hour (1-12): "))
minutes = int(input("Enter the minutes (0-59): "))
ans = angleClock(hour, minutes)
print(f"The angle between the hour and minute hands is: {ans} degrees")


        