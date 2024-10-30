package Prefix;

public class SmOfPrefixArray {

        public int[] runningSum(int[] nums) {
            int n = nums.length;

            int prefix[] = new int[n];

            int sum = 0;

            for(int i = 0; i <n ; i++){
                sum = sum + nums[i];

                prefix[i] =sum;

            }
            return prefix;
        }

}
