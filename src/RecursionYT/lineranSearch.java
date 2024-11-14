package RecursionYT;

public class lineranSearch {
    public static void main(String[] args){
      int[] arr = {2,3,4,6,7};
        System.out.println(find(arr,4,0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target ||  find(arr,target,index + 1);
    }
    static int findindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] ==target ){
            return index;
        } else{
            return
                findindex(arr,target,index + 1);}
    }
    static int findlast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] ==target ){
            return index;
        } else{
            return
                    findlast(arr,target,index - 1);}
    }
}
