package Java ;
import java.util.* ;
  class ffs {
       public static void main (String arg[]){ 
           int a = 0; 
           int b = 0; 
           int c = 0; 
           int d = 0;
           float pr = 0 ; 
           float pri = 0 ; 
           float pro = 0 ; 
           try (Scanner scan =new Scanner(System.in)){
               System.out.println (" nombre de paiement") ; 
               a = scan.nextInt() ;  
               System.out.println (" nombre de cheque ") ; 
               b = scan.nextInt() ; 
               System.out.println (" nombre de virement") ; 
               c = scan.nextInt() ; 
           }
           d = a + b + c ; 
           pr = (float) a / c *100 ;
           pri = (float) b / d *100 ; 
           pro = (float) c / d * 100 ; 
           System.out.println ("vous avez emis" + d + "ordres de debit") ; 
           System.out.println ("dont" + pr + " % par carte bleue") ;
           System.out.println ("    "+pri+"% par cheque") ; 
           System.out.println ("    "+pro+"%par virement") ; 
           System.err.println() ; 
       }
  }
