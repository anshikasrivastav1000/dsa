package BinarySearch;

public class BinarySearchSqrt {
    public int mySqrt(int x) {
        long start= 1;
        long end =x;

        long answer = 0;

        while(start <= end){
            long mid = (start + end)/2;
            if(mid * mid <= x){
                answer = mid;
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return (int)answer;
    }
}