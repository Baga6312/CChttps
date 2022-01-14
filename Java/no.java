package Java ;
import java.util.*; 
import java.lang.Math; 

 class nigge { 
      public  static void main (String arg[]) {
          int n ;
          try (Scanner scan = new Scanner( System.in)){
              System.out.println (" donnner un entier") ; 
             /* n = Integer.parseInt(arg[0]); */
             n = scan.nextInt() ; 

              while (!((n>0)&&(n<100))){
                   System.out.println(" donner un entier entre 0 et 100 ") ;  
              }

              int T[][] = new int [n][n] ; 
              int i , j ; 
               for (i=0 ; i < n ; i ++ )  {
                    for (j=0 ; j <n ; j ++ ){
                         T[i][j] = (int) (Math.random()*(1-0+1)+0) ; 
                    }
               }
                
               for ( i = 0 ; i < n  ;  i++ ) {
                   System.out.println() ; 
                    for ( j = 0 ; j < n ; j ++ ){ 
                         System.out.print(" ") ; 
                         System.out.print(T[i][j]) ; 
                    }
               }
          }
      }
 }