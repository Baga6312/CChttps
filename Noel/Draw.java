package Noel;
import java.awt.*; 

public class Draw extends Canvas { 
    private tree A ; 
    public Draw() {
        setBackground(Color.white); 
        setForeground(Color.green);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR)) ; 
       A = new tree (8,Color.yellow) ;
    }
    public void paint (Graphics g) {
     new Triangle (g) ;
     new Square (g) ; 
        A.Draw(g);
    }

}
