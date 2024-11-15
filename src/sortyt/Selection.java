package sortyt;

public class Selection {
    public static void main(String [] args){
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        sort(arr,n);


    }
    static void sort(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            int smallestInx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[smallestInx]){
                    smallestInx = j;
                }
            }
            int temp = arr[smallestInx];
            arr[smallestInx] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
