package Java ;
import java.util.* ; 

public class test2 {

 public static int  saisir (int n) {
     try (Scanner scan = new Scanner (System.in)){
      do {
          System.out.println ("donenr un la taille du tableau ")  ; 
          n = scan.nextInt() ; 
         }while (!(n>0)&&(n<100)) ; 
         return n ;   
  }
}
  public static  void remp (int n){
   int T[] = new int [n] ;
   int i ;   
    for (i = 0 ; i < n ; i ++ ) 
    T[i] = (int)(Math.random()*(15-3+1)+3);   
  }
  public static void aff ( int n ,int T[]) {
      System.out.println ("le tableau ") ; 
      for (int i = 0 ; i < n ; i ++ ) 
        System.out.println (T[i] + " ") ;
    }
    public static void main(String[] args) {
      int n = 0; 
      int T[] = new int [n] ;
      saisir(n);
      remp(n) ;
      aff ( n,T) ; 

    }
}
