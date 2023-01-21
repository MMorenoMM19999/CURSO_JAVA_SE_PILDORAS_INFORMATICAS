


package Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class Eventos_Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoVentana mimarco = new MarcoVentana();
    MarcoVentana mimarco2 = new MarcoVentana();
   mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    mimarco.setTitle("vantana");
    mimarco2.setTitle("ventana2");
    mimarco.setBounds(300, 300, 500, 350);
    mimarco2.setBounds(900, 300, 500, 350);
    }
    
}


class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        
      //  setTitle("respondiendo");
     
       // setBounds(300,300,500,350);
        setVisible(true);
        
        M_Ventana oyente = new M_Ventana();
        addWindowListener(oyente);
    }
    
}

class M_Ventana  implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta ");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("cerrando Ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("la ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada ");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada");
    }
    
   
    
}








