package LinearSearch;

public class SearchInRange {
    public static void main(String[] args){
int[] arr = {18,12,-7,3,29};
int target = 3;
        System.out.println(linearSearch(arr,target,1,4));
    }
    static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index < end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if the target not found this will execute if none of the return statement above have executed
        //hence the target not found it will return -1

        return - 1;
    }
}
