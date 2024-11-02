package Recursion;

public class Ex3 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
     //base case
        if( n ==1){
            return true;
        }

        //recursive case
        if(n % 3 != 0){
            return false;
        }

        return isPowerOfThree(n/3);
    }

}
