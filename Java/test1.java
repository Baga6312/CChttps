package Java ;
import java.util.* ; 

class test1 {
       public static void main(String [] parameter) {
             try (Scanner scan = new Scanner(System.in) ) {
             int n ;
             Double r ;  
             System.out.println("donner un entier ") ;
             n = scan.nextInt() ; 
             if ( n > 0 ){ 
                    r= Math.sqrt (n) ; 
             }else{
                   r = Math.sqrt (-n); 
            }
             System.out.println ("pour "+n+" la resultat est : " + r) ; 
          }
       }
}