package RecursionYT;

public class PatternTriangle {
    public static void main(String[] args){
     triangle(4,0);
        Normaltriangle(4,0);
    }
    static void Normaltriangle(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){

            Normaltriangle(r, c+1);
            System.out.print ("*");
        }else{

            Normaltriangle(r-1 ,0);
            System.out.println();
        }
    }

    static void triangle(int r , int c){
        if(r == 0){
           return;
        }
        if(c < r){
            System.out.print ("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1 ,0);
        }
    }
}
