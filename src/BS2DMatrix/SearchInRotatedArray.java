package BS2DMatrix;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while(start <= end)
        {
            int mid = (start + end)/2;

            if(nums[mid] == target)
            {
                // element found and return the index
                return mid;
            }
            else if(nums[start] <= nums[mid]) // LEFT PART SORTED
            {
                if(target >= nums[start] && target <= nums[mid])
                {
                    end = mid - 1; // move to left
                }
                else
                {
                    start = mid + 1; // move to right
                }
            }
            else // RIGHT PART SORTED
            {
                if(target >= nums[mid] && target <= nums[end])
                {
                    start = mid + 1; // move to right
                }
                else
                {
                    end = mid - 1; // move to left
                }
            }
        }

        return -1;
    }
}
