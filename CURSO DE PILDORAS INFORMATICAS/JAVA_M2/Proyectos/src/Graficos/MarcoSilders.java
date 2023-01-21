


package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;





/**
 *
 * @author Angel
 */
public class MarcoSilders {

    
    public static void main(String[] args) {
        
        
    FrameSilders combox = new FrameSilders();
    
    combox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class FrameSilders extends JFrame{
    
    public FrameSilders(){
        
        setVisible(true);
        
        setBounds(550,400,550,350);
        
        LaminaSilders laminas = new LaminaSilders();
        
        add(laminas);
        
        
    
    
    }

}
    
class LaminaSilders extends JPanel{
    
    public LaminaSilders(){
        
        setLayout(new BorderLayout());
        
        rotulo = new JLabel("en un lugar de la mancha de cuyo nombre...");
        
        add(rotulo,BorderLayout.CENTER);
        
        control = new JSlider(8,50,12);
        
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        
        control.setFont(new Font("Serif",Font.ITALIC,10));
        
        control.addChangeListener(new escuchas());
        
        JPanel laminaSilders = new JPanel();
        
        laminaSilders.add(control);
        
        
        
               
         add(laminaSilders,BorderLayout.NORTH);
    }
    
    private class escuchas implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
        
            //contador++;
            //System.out.println("estas manipulando el deslizante :" +control.getValue());
            
            rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
        
        }
        
        
    }
    
private JLabel texto,rotulo;
 private JSlider control;
 private static int contador;
}








