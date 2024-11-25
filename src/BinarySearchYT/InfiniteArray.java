package BinarySearchYT;

public class InfiniteArray {

    public static void main(String[] args) {
//start with the box of size of 2

        int[] arr ={3, 5, 7,9,10,90
        ,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

        static int ans(int[] arr,int target){
        // first find the range
        //first start with a box of size 2
        int start= 0;
        int end = 1;
        //condition for the target lie in the range
        //keep doubling the size when target element is grater then end
        while (target > arr[end]){
            int newStart = end + 1; ///this is my newStart
            //double the box value
           // end = privies end + size box*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
      return   binarySearch(arr,target,start,end);
    }

    //normal binary search

    public static int binarySearch(int[] nums, int target,int start,int end) {


        while (start <= end) {
            int mid = (start + end) / 2;
            if (  target < nums[mid]) {
                end = mid - 1;
            } else if ( target > nums[mid] ) {
                start =mid + 1;

            }else {
                return mid;
            }

        }
        return -1;
    }
}
