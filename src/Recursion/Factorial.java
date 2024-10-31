package Recursion;



public class Factorial {

    public static long factorial(int n){

        if( n <= 1){
            return 1;
        }
        long answer = n * factorial(n - 1);
        return answer;


    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(factorial(n));
    }
}
