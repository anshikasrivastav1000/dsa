//package TwoPointer;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class SunOFAnElement {
//
//        public List<List<Integer>> threeSum(int[] nums) {
//
//            Arrays.sort(nums);
//
//            List<List<Integer>> answer = new ArrayList<ArrayList<Integer>>();
//            int n = nums.length;
//
//            for(int i = 0; i< n; i++){
//                int target = -nums[i];
//                int j = i  + 1;
//                int k = n -1;
//
//                while(j < k ){
//
//                    if(nums[j] + nums[k] == target)
//                    {
//
//                    }else if(nums[j] + nums [k] >target){
//                        k --;
//
//                    }else {
//                        j++;
//                    }
//
//                }
//
//            }
//
//
//
//    }
//}
