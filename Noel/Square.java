package Noel;
import java.awt.*; 
 
public class Square {
    private int xc =  window.lg/2 ;
    private int  yc = window.ht/2; 

    public Square(Graphics g) {
        g.fillRect(xc, yc, 10, 60);
    }
}
