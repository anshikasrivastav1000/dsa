package LinearSearch;

public class FindMini {
    public static void main(String[] args){
        int[] arr = {18,12,-7,3,29};

        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
   int ans = arr[0];
   for(int i = 1; i < arr.length;i ++){
       if(arr[i] < ans){
           ans = arr[i];

       }
   }
   return ans;
    }
}
