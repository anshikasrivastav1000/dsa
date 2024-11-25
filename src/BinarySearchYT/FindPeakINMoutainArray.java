package BinarySearchYT;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class FindPeakINMoutainArray {

    public int peakIndexInMountainArray(int[] arr) {
    int start =0;
    int end= arr.length -1;

    while(start < end){

        int mid = start + end /2;

        if(arr[mid] > arr[mid +1]){

            //you're in dec part of the array
            //this may be the ans ,but look at left
            //this is why end !=mid - 1
            end = mid;
        }else{
            //you are in asc part of the array
            start = mid + 1;  //because we know that mid +1 element > mid element
        }
        //in the end ,start === end and pointing to the largest number because of the 2 check above
        //start and end are always trying to find max element in above 2 checks
        //hence ,when they are pointing to just one element ,that is the max one because that is above 2 checks says
        //At: every point of the time for start and end ,they have the best possible answer till that time
        //if we are saying that one item is remaining ,hence cuz of above line that is the best possible ans

 }
    return start; //or end both are equal
    }
}
