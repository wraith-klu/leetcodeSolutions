public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 0, 1};
        int result = findPeakElement(arr);
        System.out.println("Peak element index: " + result);
    }
    /*
    LeetCode Problem : 162, Link: https://leetcode.com/problems/find-peak-element/
    Logic:
        > We use a binary search approach to find a peak element in the array.
        > We initialize two pointers, s and e, to represent the start and end of the search range.
        > We calculate the mid index and compare the element at mid with the element at mid + 1.
        > If the element at mid is greater than the element at mid + 1, it means there is a peak element in the left half of the array (including mid), so we move the end pointer to mid.
        > Otherwise, if the element at mid is less than or equal to the element at mid + 1, it means there is a peak element in the right half of the array (excluding mid), so we move the start pointer to mid + 1.
        > We continue this process until s and e converge, at which point s (or e) will be pointing to a peak element.

    Time Complexity: O(log n) due to the binary search approach, where n is the number of elements in the input array.
    Space Complexity: O(1) since we are using only a constant amount of extra space
    */
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int s=0, e=n-1;
        while(s<e) {
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
    
}
