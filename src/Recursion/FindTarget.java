package Recursion;

public class FindTarget {
    public static void recur(int index, int arr[],int target){

        if(index >= arr.length){
            return;
        }


        if(arr[index] ==target){
            System.out.println(index +" ");

        }
      recur(index + 1 ,arr ,target);


    }
    public static void main(String[] args){
        int arr[] = {1,2 ,3 ,4,3,6,7,3};
        int target = 3;
        recur(0,arr,target);

    }
}












