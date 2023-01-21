


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
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
public class DisposicionLibres {

    
    public static void main(String[] args) {
        
        
    Muelle libertam = new Muelle();
    
    libertam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    libertam.setVisible(true);
    
    }
    
}

class Muelle extends JFrame{
    
    public Muelle(){
        
      
        setTitle("Marco en Muelle");
        
        setBounds(450,350,600,400);
        
        LaminaLibre laminaf = new LaminaLibre();
        add(laminaf);

       
    }

}
    
class LaminaLibre extends JPanel{
    
    public LaminaLibre(){
        
        setLayout(new EnColumnas());
        
        JLabel nombre = new JLabel("Nombre :");
        JLabel apellido = new JLabel("Apellido : ");
        JLabel edad = new JLabel("Edad : ");
        JLabel telefono = new JLabel("Telefono : ");
        
        
        JTextField c_nombre = new JTextField();
        JTextField c_apellido = new JTextField();
        JTextField c_edad = new JTextField();
        JTextField c_telefono = new JTextField();
        
        /*
        nombre.setBounds(20,20,80,10);
        c_nombre.setBounds(100,17,100,20);
        apellido.setBounds(20,60,80,15);
        c_apellido.setBounds(100,55,100,20);
        //c_edad.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        */
        
        add(nombre);
        
        add(c_nombre);
        
        add(apellido);
        
        add(c_apellido);
        
        add(edad);
        
        add(c_edad);
            
        add(telefono);
         
        add(c_telefono);        
       
       
    }
    
}


class EnColumnas implements LayoutManager{

    @Override
    public void addLayoutComponent(String name, Component comp) {
    
    
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    
    
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
   
    
        return null;
   
    
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
   
    
        return null;
   
    
    }

    @Override
    public void layoutContainer(Container micontenedor) {
           
        int d= micontenedor.getWidth();
        
        x=d/2;
           
        int contador=0;
        
        int n = micontenedor.getComponentCount();
        
        for(int i =0;i<n;i++){
        
            contador++;
            
            Component c =micontenedor.getComponent(i);
            c.setBounds(x-100, y, 100, 20);
            x+=100;
            
            if(contador%2==0){
                
                x=d/2;
                
                y+=40;
                
            }
        }
        
        
    }
    
    int x;
    
    int y=20;
    
}






