


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.*;





/**
 *
 * @author Angel
 */
public class DisposicionMuelle {

    
    public static void main(String[] args) {
        
        
    Muelle muellez = new Muelle();
    
    muellez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    muellez.setVisible(true);
    
    }
    
}

class Muelle extends JFrame{
    
    public Muelle(){
        
      
        setTitle("Marco en Muelle");
        
        setBounds(300,400,1000,350);
        
        LaminaMuella mila = new LaminaMuella();
        add(mila);

       
    }

}
    
class LaminaMuella extends JPanel{
    
    public LaminaMuella(){
        
        JButton boton1 = new JButton(" boton 1");
        JButton boton2 = new JButton("boton 2");
        JButton boton3 = new JButton("boton 3");
        
        SpringLayout miLayout = new SpringLayout();
        
        setLayout(miLayout);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        Spring mimuelle = Spring.constant(10,10,100);
        
        Spring muelle_rigido =Spring.constant(80);
        
        miLayout.putConstraint(SpringLayout.WEST, boton1, mimuelle,SpringLayout.WEST, this);
        miLayout.putConstraint(SpringLayout.WEST, boton2, muelle_rigido,SpringLayout.EAST, boton1);
        miLayout.putConstraint(SpringLayout.WEST, boton3, muelle_rigido,SpringLayout.EAST, boton2);
        miLayout.putConstraint(SpringLayout.EAST, this, mimuelle,SpringLayout.EAST, boton3);
        
    }
    
}









