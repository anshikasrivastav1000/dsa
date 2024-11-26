//package BinarySearchYT;
////https://leetcode.com/problems/find-in-mountain-array/description/
//public class SearchInMountain {
//
//    int search (int[] arr,int target){
//        int peak = peakInMountain(arr);
//        int firstTry = binarySearch(arr,target,0,peak);
//        if(firstTry != -1){
//            return firstTry;
//
//        }
//
//    }
//
//    int peakInMountain(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start < end){
//            int mid = start + (end -start) /2;
//            if (arr[mid] > arr[  mid + 1]) {
//                end = mid;
//
//            }else {
//                start = mid+1;
//            }
//        }
//
//
//    }
//
//    int binarySearch(int[] arr, int target,int start,int end){
//
//       while(start <= end){
//
//           int mid = start +( end - start)/2;
//           if(arr[mid] == target){
//               return mid;
//           } else if (arr[mid] > target) {
//               end = mid - 1;
//
//           }else {
//               start = mid +1;
//           }
//
//
//       }
//       return  -1;
//    }
//
//}
