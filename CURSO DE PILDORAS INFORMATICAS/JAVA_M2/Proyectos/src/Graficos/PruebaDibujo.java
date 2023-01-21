


package Graficos;

import java.awt.Color;
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
public class PruebaDibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoConDibujo mimarco = new MarcoConDibujo();
    
    mimarco.setVisible(true);
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}


class MarcoConDibujo extends JFrame{
    
    public MarcoConDibujo(){
        
        setTitle("prueba de Dibujo");
     
        setSize(400,400);
        
        laminaConFiguras x = new laminaConFiguras();
        add(x);
        
     
    }
    
}

class laminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 =(Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
      
        
        g2.draw(rectangulo);
        
        //dibujar la elipse
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        
       
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,250));
        double centroenX = rectangulo.getCenterX();
        double centroenY = rectangulo.getCenterY();
        double radio =150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroenX,centroenY,centroenX+radio,centroenY+radio);
        g2.draw(circulo);
        
        
        /*
       g.drawRect(100, 100, 200, 200);
       g.drawLine(100,100, 300,200);
       g.drawArc(50,100, 100,200, 120, 150);
    
*/
        
        
        
}
    
}








