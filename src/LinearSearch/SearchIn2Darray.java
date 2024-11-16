package LinearSearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args){
        int[] [] arr = {
                {18, 12, -7, 3, 29},
                {18,12,3,9},
                {78,99,33,88},
                {55,77}
        };
        int target = 77;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] search(int [] [] arr,int target){
  for(int row = 0 ;row < arr.length;row++){
      for(int col = 0; col < arr[row].length;col ++){
          if(arr[row] [col] ==target){
           return new int[]{row,col};
          }
      }
  }
        return new int[]{-1,-1};
    }
}
