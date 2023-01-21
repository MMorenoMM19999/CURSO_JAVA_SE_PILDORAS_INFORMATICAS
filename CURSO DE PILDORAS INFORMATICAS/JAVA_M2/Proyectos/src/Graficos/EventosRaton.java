
package Graficos;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 *
 * @author Angel
 */
public class EventosRaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoRaton mimarco = new MarcoRaton();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}

class MarcoRaton extends JFrame{
    
    public MarcoRaton(){
        
        setVisible(true);
     
        setBounds(700,300,600,450);
       //eventoRaton1 raton = new eventoRaton1();
       //eventosRaton2 r = new eventosRaton2();
       eventosRaton4 x = new eventosRaton4();
        //addMouseListener(raton);
       // addMouseListener(r);
        addMouseMotionListener(x);
    }
    
}
class eventoRaton1 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("has hecho click");
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("acabas de entrar ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("acabas de salir ");
   }
   

    
}



class eventosRaton2 extends MouseAdapter{
    
    public void mouseClicked(MouseEvent e) {
        System.out.println("coordenada en X :" + e.getX() + " coordenada en Y :" + e.getY());
    
    } 
    public void mousePressed(MouseEvent e){
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("has pulsado el boton izquierdo");
        }else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("has pulsado la rueda del raton");
            
        }else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("has pulsado el boton derecho");
        }
    }
    
}


class eventosRaton4 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("estas arrastrando");
   }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("estas moviendo");
   }
    
    
}