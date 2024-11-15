package RecursionYT;

import java.util.ArrayList;

//return the list return take it in argument
public class ArrayListQ2 {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,4,5};
        System.out.println(find(arr,4,0));



    }

    static ArrayList<Integer> find(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answer = find(arr, target, index+ 1);
        list.addAll(answer);
        return list;
    }
}
