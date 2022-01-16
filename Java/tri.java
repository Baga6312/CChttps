package Java ;
import java.util.*;

public class tri {
       int n;
    private String p ; 
       private double [] note ;
    double moyenne; 
       public void Etudient () {
           try (Scanner scan = new Scanner (System.in)) {
            System.out.println ("donenr le nom de l'etudient") ; 
               n = scan.nextInt() ; 
               System.out.println ("donner le prenom de l'etudient") ; 
               p = scan.next() ;
               System.out.println ("combien y - a - t il de note pour l'etudient" ) ; 
               System.out.println (p + " " + n + " : ") ; 
               int mb = scan.nextInt() ; 
               note = new double [mb] ; 
               for (int i = 0 ; i < note.length ; i ++ ) {
                   System.out.print("entrer la note n "+i+++" : "  ) ; 
                   note [i]  = scan.nextDouble() ; 
               }
        } 
           moyenne = calculmoyenne () ; 
        }
           private double calculmoyenne() {
                double somme = 0.0 ; 
                for (double vn : note ) 
                somme = somme + vn ; 
                return somme/note.length; 
           }
           public void affihetud () {
               System.out.print (" les notes de " + p+ " " + n + " sont : ") ; 
               for( double vn : note ) 
               System.out.print (" " + vn);
               System.out.println () ; 
               System.out.println ("sa moyenne vaut " + moyenne ) ; 
            //    double quellemoyenne() {
                //    return moyenne ; 

               }
           }

       
    