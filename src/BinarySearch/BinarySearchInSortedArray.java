package BinarySearch;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 10};
        int target = 9;

        // Static method ko directly call karenge
        System.out.println(search(arr, target));
    }

    // Static method banaya
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Mid calculate karte waqt integer overflow se bachne ke liye ye formula use karein
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target element mil gaya
            } else if (nums[mid] < target) {
                start = mid + 1; // Right side pe move karein
            } else {
                end = mid - 1; // Left side pe move karein
            }
        }
        return -1; // Target element nahi mila
    }
}
