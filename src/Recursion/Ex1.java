package Recursion;

public class Ex1 {

    public static void print(int n){
        //base case
        if(n == 0){
            return;
        }

        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }


    public static void main(String[] args){
        //print 321123 (recursion)
        int n = 5;
        print(n);
    }

}
