


package Graficos;

import java.awt.Graphics;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class EscribiendoMarco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoConTexto mimarco = new MarcoConTexto();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}

class MarcoConTexto extends JFrame{
    
    public MarcoConTexto(){
        
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("primer texto");
        
        lamina milamia = new lamina();
        add(milamia);
    }
    
    
}

class  lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("estamos aprendiendo Swing ", 100,100);
        
    }
    
}



