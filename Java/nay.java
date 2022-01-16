package Java;

import java.util.*;
public class nay {
    public static void main(String[] args) {
        int n ; 
        try (Scanner scan = new Scanner(System.in)) {
            do{
              System.out.print("donner un entier") ; 
              n = scan.nextInt() ; 
            }while (!(n>0)&&(n<10)) ;
        }
            System.out.println() ; 
    }
}
