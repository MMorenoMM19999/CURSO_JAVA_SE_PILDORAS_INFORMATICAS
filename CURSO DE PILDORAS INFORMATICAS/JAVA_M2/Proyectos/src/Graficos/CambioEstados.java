
package Graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 *
 * @author Angel
 */
public class CambioEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoEstado mimarco = new MarcoEstado();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}

class MarcoEstado extends JFrame{
    
    public MarcoEstado(){
        
        setVisible(true);
     
        setBounds(300,300,500,350);
       
     CambiaEstado v = new CambiaEstado();
        
        addWindowStateListener(v);
    }
    
}
class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
   
        //System.out.println("la ventana a cambiado de estado ");    
       // System.out.println(e.getNewState());
       if(e.getNewState()== Frame.MAXIMIZED_BOTH){
           System.out.println("la ventana esta a pantalla completa ");
       }else if( e.getNewState()==Frame.NORMAL){
           System.out.println("la ventana esta normal");
       }else if(e.getNewState()==Frame.ICONIFIED){
           System.out.println("la ventana esta minimizada");
           
       }
        
        
    }
    
  
    
}