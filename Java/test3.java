package Java ;
public class test3 { 
    public static void main ( String [] args ) {
         int T[] = new int [6] ; 
          int i; 
          T[0] = 1 ; 
          for ( i = 1 ; i < T.length ; i ++ )
              T[i] = T[i-1] + 2 ;
          for( i = 0 ; i < T.length ; i ++ ) 
               System.out.print ("T["+i+"] = " + T[i]) ; 
          for ( int  v : T ) 
          System.out.print (" T = " + v ) ; 
    }
}