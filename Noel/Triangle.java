package Noel;
import java.awt.*;  

public class Triangle {
    private int xc = window.lg/2 ; 
    private int yc = window.ht/2 ; 
    private int [] px = {xc , xc + 10 , xc - 10 } ; 
    private int [] py = {yc -10 , yc+10 , yc +10 } ; 
    private int pn = 3 ; 
    public Triangle(Graphics g) { 
        g.fillPolygon(px, py , pn );
    }
    private int pX = window.lg/2-50 ;
    private int pY = window.ht/2-50 ; 
    private int [] xP ={0,10,-10 } ; 
    private int [] yP ={-10,10,-10} ; 
    private int nP= 3 ; 
    public Triangle(int lig, int col, Graphics g, Color c) {
        for (int i = 0 ;  i <nP ; i ++ ) { 
            xP[i] = xP[i] + (5*col) + pX ; 
            yP[i] = yP[i] + (15*lig) +pY ; 
        }
        g.setColor(c) ; 
        g.fillPolygon(xP,yP,nP);
    }
}
