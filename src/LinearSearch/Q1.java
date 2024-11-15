package LinearSearch;

public class Q1 {

    public static void main(String[] args){
  int[] nums ={23,45,1,2,4,6,17};
  int target = 17;
  int ans = linearSearch(nums,target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);
    }
    //this will return element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //if the target not found this will execute if none of the return statement above have executed
        //hence the target not found it will return -1

        return - 1;
    }
    ////this will return index
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
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
