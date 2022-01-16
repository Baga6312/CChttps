package Java; 
import java.util.*;

 public class ouu {
    public static void main(String[] args) {
        int n ; 
        try (Scanner scan = new Scanner(System.in)) {
            do{
              System.out.print("donner un entier") ; 
              n = scan.nextInt() ; 
            }while (!(n>0)&&(n<100)) ;
        }
        int T[][] = new int [n][n] ; 
        float m = T[0].length/2 ;
        System.out.println(m);
    }
 }