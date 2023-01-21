
package Graficos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
public class EventosFoco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoFoco mimarco = new MarcoFoco();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}

class MarcoFoco extends JFrame{
    
    public MarcoFoco(){
        
        setVisible(true);
     
        setBounds(300,300,600,450);
      
        
      
        add(new laminaFoco());
   
    }
    
}


class laminaFoco extends JPanel {

public void paintComponent (Graphics g){
    
    super.paintComponent(g);
    setLayout(null);
    
    cuadro1 =new JTextField();
    cuadro2 = new JTextField();
    cuadro1.setBounds(120, 10, 150,20);
    cuadro2.setBounds(120, 50, 150,20);
    add(cuadro1);
    add(cuadro2);
    
    lanzaFocos elfoco = new lanzaFocos();
    cuadro1.addFocusListener(elfoco);
}

class lanzaFocos implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
   
    }

    @Override
    public void focusLost(FocusEvent e) {
        String email = cuadro1.getText();
        boolean comprobacion =false;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                comprobacion=true;
            }
        }
       if(comprobacion){
           System.out.println("correcto");
       }else{
           System.out.println("incorrecto");
       }
    }
    
}

JTextField cuadro1;
JTextField cuadro2;
    

}


