import java.util.*;

public class SortColors {
    // https://leetcode.com/problems/sort-colors/submissions/1878636097/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sorter.sortColors(nums);

        System.out.print("Sorted colors: " + Arrays.toString(nums));
        
    }

    // Dutch National Flag Algorithm

    public void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {                            // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // Using Selection Sort

    // public void sortColors(int[] nums) { 

    //     for(int i=0; i<nums.length-1; i++){
    //         int minIndex = i;
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[j]<nums[minIndex]){
    //                 minIndex = j;
    //             }
    //         }
    //         int temp = nums[minIndex];
    //         nums[minIndex] = nums[i];
    //         nums[i] = temp;
    //     }
    // }

}
