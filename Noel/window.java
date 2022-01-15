package Noel;
import java.awt.*;

public class window {
    public static final int  ht = 300 ; 
    public static final int  lg = 300 ; 

    public static void main (String [] arg ) {
         Frame f = new Frame() ; 

         f.setTitle("Window") ;
         f.setBackground(Color.gray); 
         f.setSize(ht,lg); 
         f.setVisible(true);
         f.add (new Draw()) ; 
     }

}
