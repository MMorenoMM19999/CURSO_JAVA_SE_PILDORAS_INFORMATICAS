


package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class TrabajandoConFuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoConFuentes mimarco = new MarcoConFuentes();
    
    mimarco.setVisible(true);
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}


class MarcoConFuentes extends JFrame{
    
    public MarcoConFuentes(){
        
        setTitle("prueba con fuentes");
     
        setSize(400,400);
        
        laminaConFuentes x = new laminaConFuentes();
        add(x);
        
        x.setForeground(Color.BLUE);
     
    }
    
}

class laminaConFuentes extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 =(Graphics2D) g;
        
        Font mifuente = new Font("Courie",Font.BOLD,26);
        g2.setFont(mifuente);
      
       // g2.setColor(Color.red);
        g2.drawString("juan", 100,100);
        g2.setFont(new Font("Arial",Font.ITALIC,24));
      //  g2.setColor(new Color(128,90,50).brighter());
         g2.drawString("curso de java ", 100,200);
}
    
}








