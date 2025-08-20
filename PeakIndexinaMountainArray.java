public class PeakIndexinaMountainArray {

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};

        int result = peakIndex(arr);
        System.out.println(result);
    }
    public static int peakIndex(int[] arr){
        int start =0;
        int end = arr.length - 1;

        while(start< end){
            int mid = start + (end - start)/2;

            if(arr[mid]< arr[mid + 1] ){
                start = mid + 1;    // right search
            }else if(arr[mid] > arr[mid + 1]){
                end = mid;            // left search
            }
        }
        return start;
    }
}
