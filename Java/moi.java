package Java ; 
import java.util.*; 
 
public class moi {
  public static void main(String[] args) { 
    int n ; 
    try (Scanner scan = new Scanner( System.in)) {
        do { 
              System.out.println("donner un entier") ; 
              n = scan.nextInt() ; 
            }while(!(n>0)&&(n<100)) ;
        } 
    int T[][] = new int [n][n] ;
     int m = T[0].length/2; 
    for (int i = 0; i <n ; i ++ ){
      for (int j = i ; j <i ; j++ ){
        T[i][m+j] = (int) (Math.random()*(30-15+1)+15);
      }
    }
    for (int i = 0 ; i <n ; i ++ ) {
        System.out.println() ; 
    for (int j = i ; j <i ; j++ ) {
    System.out.print(T[i][m+j]+" ") ; 
    }
  }
 }
}