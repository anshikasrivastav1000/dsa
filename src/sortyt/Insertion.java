package sortyt;

public class Insertion {
    public  static void main(String[] args){
  int[] arr = {5, 6,9,7,3};
  int n =5;
     sort(arr,n);
    }
    static void sort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] >  curr){
                arr[prev + 1] = curr;
             prev--;
            }
            arr[prev+1] = curr;
        }


    }



}
