public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 1, 5, 9, 7};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /* Bubble Sort Algorithm : - Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
       compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated
       until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.
    */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < n-i; j++) {                    // till n-i because the last i elements are already in place
                if (arr[j] < arr[j - 1]) {                     // swap arr[j] and arr[j-1] if they are in wrong order
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
