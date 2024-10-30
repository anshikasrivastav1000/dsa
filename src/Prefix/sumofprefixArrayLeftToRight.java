//package Prefix;
//
//public class sumofprefixArrayLeftToRight {
//    int prefix[];
//    public NumArray(int[] nums) {
//        int sum = 0;
//        int n = nums.length;
//        prefix = new int[n];
//        for(int i = 0; i< n; i++){
//            sum = sum + nums[i];
//            prefix[i] = sum;
//        }
//    }
//
//    public int sumRange(int left, int right) {
//        if( left == 0){
//            return prefix[right];
//        }
//        else{
//            return prefix[right] - prefix[left - 1];
//        }
//    }
//}
