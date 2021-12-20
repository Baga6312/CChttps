import java.lang.Math; 
import java.util.Scanner;

class nigga {
    private static Scanner scan;

    public static void main (String args[]){

        scan = new Scanner(System.in); 

        System.out.println ("donner la taille du tableau") ; 
        int n=scan.nextInt() ;
        int T[]=new int [n] ;  
        int i ; 

        for (i=0 ; i < n ; i ++ ) {
            T[i] = (int)(Math.random()*(30-10+1)+10);
        }

        System.out.println (" affichage de tableau ") ;
        System.out.print ("  |  ");

        for (i=0 ; i <n ; i ++ ){
            System.out.print(T[i]); 
            System.out.print("  | ");
        }

    }
}
