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
public class Dialogos_Cuadros_Dialogo {

    
    public static void main(String[] args) {
        
        
    Marco_Dialogos p = new Marco_Dialogos();
    
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p.setVisible(true);
    
    }
    
}

class Marco_Dialogos extends JFrame{
    
    public Marco_Dialogos(){
        
      
        setTitle("Marco en Dialogo");
        
        setBounds(500,300,400,250);
        
        add(new Lamina_Cuadros());

       
    }

}
    
class Lamina_Cuadros extends JPanel{
    
    public Lamina_Cuadros(){
       
        boton1 = new JButton("boton 1");
        boton2 = new JButton("boton 2");
        boton3 = new JButton("boton 3");
        boton4 = new JButton("boton 4");
      
      boton1.addActionListener(new Accion_botones());
      boton2.addActionListener(new Accion_botones());
      boton3.addActionListener(new Accion_botones());
      boton4.addActionListener(new Accion_botones());
      
      add(boton1);
      add(boton2);
      add(boton3);
      add(boton4);
        
    }
    
 private class Accion_botones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
       
            if(e.getSource()==boton1){
            
            //System.out.println("Has pulsado el boton 1");
            JOptionPane.showMessageDialog(Lamina_Cuadros.this,"Mensaje de prueba","Advertencia",0);
            
            }else if(e.getSource()==boton2){
            
                //System.out.println("Has pulsado el boton 2");
            JOptionPane.showInputDialog(Lamina_Cuadros.this,"instroduce tu nombre ","introduccion datos ",2);
                
            }else if(e.getSource()==boton3){
            
               //System.out.println("HAs pulsado el boton 3");
            JOptionPane.showConfirmDialog(Lamina_Cuadros.this,"elige opcion ","v comfirmar",1);
            
            }else if(e.getSource()==boton4){
                
               // System.out.println("has pulsado el boton4");
            
               JOptionPane.showOptionDialog(Lamina_Cuadros.this,"elige","v opciones",1,1,null,null,null);
            
               
            }
        
        }
     
 }
 
 private JButton boton1,boton2,boton3;
 private JButton boton4;
    
}







