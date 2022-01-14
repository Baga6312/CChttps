package Java ;
import java.lang.Math ; 
import java.util.Scanner;
   class kmd {
        public static void main (String arg[]){
            try (Scanner scan = new Scanner (System.in)) {
                int n ;
                System.out.println("enter the array length") ;  
                n = scan.nextInt(); 
                 while (!((n>0)&&(n<100))){
                     System.out.println ("the array length must be in[1..100]") ; 
                }
                int i=0 ;
                int j = 0 ; 
                int T[][] = new int [n][n] ; 
                for (i=0; i< n ; i ++ ) {
                    for (j=0 ;j<n; j++ ){
                       T[i][j] =(int)( Math.random()*(1-0+1)+0)  ; 
                    }      
                }
                System.out.println("ur array contains") ; 
                for (i=0;i<n;i++){
                    System.out.println() ; 
                    for (j=0;j<n;j++){
                       System.out.print (T[i][j]) ; 
                       System.out.print ("\t");
                    }
                    System.out.println ();
                       
                }
            }
        }
   }