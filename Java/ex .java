package Java ;
// ex page 60 le livre de java 
import java.util.*; 
  class statistique {
     public static void main ( String arg[]) {
         int nbCB = 0  ; 
          int nbCheque = 0 ; 
          int nbVirement = 0 ; 
          int nbDebit = 0 ; 
          float prctCB = 0 ; 
          float prctCh ; 
          float prctVi ; 
          try (Scanner scan = new Scanner (System.in)) {
            System.out.println(" Nombre de paiements par carte bleue ") ;
              nbCB = scan.nextInt () ; 
              System.out.println ("Nombre de cheques emi :") ; 
              nbCheque = scan.nextInt() ; 
              System.out.println(" Nombre de virement automatique") ;
              nbVirement = scan.nextInt() ;
        } 
          nbDebit = nbCB + nbCheque + nbVirement;
          prctCB =(float) nbCB / nbDebit * 100 ;
          prctCh =(float) nbCheque / nbDebit *100 ; 
          prctVi=(float) nbVirement / nbDebit * 100 ; 
          System.out.println ("vous avez emis " + nbDebit + " ordres de debit") ; 
          System.out.println ("dont"+ prctCB+ "% par carte bleue") ; 
          System.out.println ("    "+prctCh+"% par cheque ") ; 
          System.out.println ("    "+prctVi+"% par virement ") ; 
           
        }
 }