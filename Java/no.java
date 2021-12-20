import java.lang.Math ;
import java.util.Scanner ;

   class blackpple {
        public static void main (String arg[]){
            Scanner scan = new Scanner (System.in);
            System.out.println ("donner un entier") ; 
            int n = scan.nextInt(); 
            int T[][] = new int [n][n] ; 
            int i ,j;  
            for ( i=0 ; i<n ; i ++ )  { 
                for (j=0 ; j<n ; j++) {
                    T[i][j]=(int)(Math.random()*(1-0+1)+0) ; 
                }
            } 
            System.out.println ("affichage de tableau" );
            for ( i=0; i<n ; i ++ ) {
                System.out.println() ; 
                for (j=0; j<n ; j ++ ){
                    System.out.print(T[i][j]);
                    System.out.print("  ");
                }
            }
        }
   }
   class hardrock {
        public void urmom (String args[]){
            try (Scanner scan = new Scanner (System.in)) {
                System.out.println("donner un entier") ;
                scan.nextInt();
            } 
        }
   }
   