import java.util.Arrays;

public class NonOverlappingIntervals {

// https://leetcode.com/problems/non-overlapping-intervals/description/?envType=problem-list-v2&envId=greedy

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {3, 4},
            {4, 7},
            {6, 8}
        };
        int result = eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // int count = 0;
        // for (int i = 1; i < intervals.length; i++) {
        //     if(intervals[i][0] != intervals[i-1][1]) count++;
        // }

//        return count;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int removals = 0, lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                removals++;           // remove current (ends later or equal)
            } else {
                lastEnd = intervals[i][1]; // keep it
            }
        }
        return removals;
    }
}
