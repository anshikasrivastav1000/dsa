package BinarySearch;

public class UpperBound {

    public static void main(String[] args){
        int[] arr ={1,3,3,5,5,5,5,7,8,9};
        int k = 5;

        //range -0,size -1

        int start = 0;
        int end = arr.length -1;
        int answer = -1;
        while(start <= end){
            int mid = (start + end )/2;

            if(arr[mid] >= k){
                answer = mid;
                end = mid -1; //left

            }else {
                start = mid + 1;//right
            }

        }
        System.out.println(answer);
    }

}
