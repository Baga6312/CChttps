package Java;
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Exemple extends JPanel{ 

    private Random rand = new Random();
    public static void main(String...s) {


        JFrame f = new JFrame() ;
        final Exemple exemple= new Exemple();
        f.add(exemple) ;
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JButton b = new JButton("repaint") ; 
         /*b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                exemple.repaint() ; 
            }
        });*/
        f.add(b, BorderLayout.SOUTH);
        f.setSize(200,200) ; 
        f.setVisible(true);


    }
    public Exemple() {
        setBackground(Color.GRAY);
    }    


    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.black);
        for (int i=0;i<10;i++){
            int nextInt = rand.nextInt(getHeight()-10); 
            int nextInt2 = rand.nextInt(getWidth()-10);
            g.fillRect(nextInt2, nextInt,10, 10);
        } 
    }
    
}
