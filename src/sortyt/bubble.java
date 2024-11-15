package sortyt;

public class bubble {
    public static void main(String[] args){

        int[] arr = {4, 5,6,2,8};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr,n);
    }
    static void bubbleSort(int[] arr,int n){
        for(int i = 0;i <n -1; i++){
            for(int j = 0; j <n -i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
