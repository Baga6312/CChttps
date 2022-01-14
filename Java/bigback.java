package Java ;
public class bigback {
   public static void main ( String [] args ) {
       int T[] = new int [6] ; 
       int i ;
       T[0] = 1 ; 
        for (i=1 ; i <T.length; i++ ) 
        T[i] = T [i-1] + 2 ; 
        for( int v : T ) 
         System.out.println (" T " + v );
   } 
}
