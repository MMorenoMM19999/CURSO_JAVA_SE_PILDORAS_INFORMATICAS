
package Graficos;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 *
 * @author Angel
 */
public class EventosTeclados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoConTecla mimarco = new MarcoConTecla();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}

class MarcoConTecla extends JFrame{
    
    public MarcoConTecla(){
        
        setVisible(true);
     
        setBounds(700,300,600,450);
       eventoTeclado tecla = new eventoTeclado();
        addKeyListener(tecla);
    
    }
    
}
class eventoTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra =e.getKeyChar();
        System.out.println(letra);
  }

    @Override
    public void keyPressed(KeyEvent e) {
       // int codigo =e.getKeyCode();
        //System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
   }

    
}