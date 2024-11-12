package RecursionYT;

public class ex1 {
    static void print(int n){

        /// base case
        if( n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        print(n +1);
    }

    public static void main(String[] args){
  print(1);

    }

}
