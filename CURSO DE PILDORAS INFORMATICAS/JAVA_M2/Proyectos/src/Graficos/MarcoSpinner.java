


package Graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
public class MarcoSpinner {

    
    public static void main(String[] args) {
        
        
    FrameSpinners spinner = new FrameSpinners();
    
    spinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class FrameSpinners extends JFrame{
    
    public FrameSpinners(){
        
        setVisible(true);
        
        setBounds(550,350,550,350);
        
        
        
        add(new Laminaspinner());
        
        
    
    
    }

}
    
class Laminaspinner extends JPanel{
    
    public Laminaspinner(){
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,20,1){
            
      public Object getNextValue(){
        return super.getPreviousValue();
    }
    public Object getPreviousValue(){
        return super.getNextValue();
    }
            
            
        });
        
        Dimension d= new Dimension(200,20);
        
        control.setPreferredSize(d);
        
        add(control);
       
        
    }
    /*
private class MiModeloLoJspinner extends SpinnerNumberModel{
    
    public MiModeloLoJspinner(){
        super(5,0,10,1);
    }
    public Object getNextValue(){
        return super.getPreviousValue();
    }
    public Object getPreviousValue(){
        return super.getNextValue();
    }
    
    
}*/
    

}








