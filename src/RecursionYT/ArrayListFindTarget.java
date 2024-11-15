package RecursionYT;

import java.util.ArrayList;

public class ArrayListFindTarget {
    public static void main(String[] args){
  int[] arr = {2,3,1, 4, 4,5};
  ArrayList<Integer> ans = find(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> find(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find(arr, target, index + 1, list);
    }
}
