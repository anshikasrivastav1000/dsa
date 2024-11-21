//package BinarySearchYT;
//
//import java.lang.foreign.StructLayout;
//
//public class FirstandlastPostionofelement {
//
//    public static void main(String[] args) {     }
//
//   public int[] searchRange(int[] nums,int target){
//        int[] ans ={-1,-1};
//        int[] nums = {5,7,7,8,8,10};
//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//       ans[0] = start;
//        ans[1] = end;
//        return ans;
//
//    }
//
//
//     int search(int[] nums, int target,boolean findStartIndex) {
//        int ans = -1;
//        int start=0;
//        int end = nums.length-1;
//         int mid = start + (start - mid)/2;
//        while (start <= end){
//            if( nums[mid] > target){
//                end =   mid-1;
//            }else if(nums[mid] < target)
//                start= mid+1;
//        }else{
//          ans = mid;
//          if(findStartIndex){
//              end = mid + 1;
//
//          }
//          else {start = mid +1;
//          }
//        }
//
//    }
//
//return ans;
//}
//
//
//
//}
