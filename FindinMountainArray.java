// public class FindinMountainArray {

// // https://leetcode.com/problems/find-in-mountain-array/description/

//     public static void main(String[] args) {
//         int[] mountainArr  = {1,2,3,4,5,3,1};
//         int target = 3;
//     }
//     public static int findIndexInLeftSubArray(int[] mountainArr, int target){
//         int e = binarySerachForMaxValueIndex(mountainArr, target);
//         int start = 0;
//         int end = e;

//         while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (mountainArr[mid] < target) {
//                 start = mid + 1; // right search
//             } else if (mountainArr[mid] > target) {
//                 end = mid; // left search
//             }else{
//                 return mid;
//             }
//         }        return -1;
//     }
//     public static int binarySerachForMaxValueIndex(int[] mountainArr, int target){
//         int start = 0;
//         int end = mountainArr.length - 1;

//         while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (mountainArr[mid] < mountainArr[mid + 1]) {
//                 start = mid + 1; // right search
//             } else if (mountainArr[mid] > mountainArr[mid + 1]) {
//                 end = mid; // left search
//             }
//         }
//         return start;
//     }
// }
