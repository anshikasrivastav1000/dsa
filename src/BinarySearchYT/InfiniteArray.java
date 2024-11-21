//package BinarySearchYT;
////https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//public class InfiniteArray {
//
//    public static void main(String[] args) {
////start with the box of size of 2
//    }
//
//    static int ans(int[] nums,int target){
//        // first find the range
//        //first start with a box of size 2
//        int start= 0;
//        int end = 1;
//        //condition for the target lie in the range
//        while (target > nums[end]){
//            int newStart = end + 1;
//            //double the box value
//           // end = privios end + sizebox*2
//            end = end + (end - start + 1) * 2;
//        }
//    }
//    public static int search(int[] nums, int target,int start,int end) {
//
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if ( target < nums[mid] ) {
//                return end = mid -1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//               return  mid;
//            }
//        }
//        return -1;
//    }
//}
