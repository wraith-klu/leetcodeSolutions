public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 1, 5, 9, 7};
        selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    /* Selection Sort Algorithm : - The selection sort algorithm divides the input list into two parts: a sorted
       sublist of items which is built up from left to right at the front (left) of the list and a sublist of the
       remaining unsorted items that occupy the rest of the list. Initially, the sorted sublist is empty and the
       unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest,
       depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost
       unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
    */

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;                                  // Assume the minimum is the first element of unsorted part
            for (int j = i + 1; j < n; j++) {                 // Iterate through the unsorted elements
                if (arr[j] < arr[minIndex]) {                // Update minIndex if the current element is smaller
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);                          // Swap the found minimum element with the first element of unsorted part
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
