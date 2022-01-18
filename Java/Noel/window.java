package Java.Noel;
import java.awt.*;
import javax.swing.JFrame;

public class window {
    public static final int  ht = 300 ; 
    public static final int  lg = 300 ; 

    public static void main (String [] arg ) {
         JFrame f = new JFrame() ; 

         f.setTitle("Window") ;
         f.setBackground(Color.gray); 
         f.setSize(ht,lg); 
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.add (new Draw()) ;
          
     }

}
