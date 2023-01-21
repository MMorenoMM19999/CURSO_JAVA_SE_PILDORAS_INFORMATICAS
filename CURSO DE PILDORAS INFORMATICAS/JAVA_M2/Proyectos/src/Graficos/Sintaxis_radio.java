


package Graficos;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 *
 * @author Angel
 */
public class Sintaxis_radio {

    
    public static void main(String[] args) {
        
        
    Marco_radio_sintaxix mimarco = new Marco_radio_sintaxix();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class Marco_radio_sintaxix extends JFrame{
    
    public Marco_radio_sintaxix(){
        
        setBounds(550,300,550,350);
        
        setVisible(true);
        
        Lamina_radio_sintaxix m = new Lamina_radio_sintaxix();
        
        add(m);
        
        
    
    
    }

}
    
class Lamina_radio_sintaxix extends JPanel{
    
    public Lamina_radio_sintaxix(){
        
        
        
       ButtonGroup migrupo1= new ButtonGroup();
       ButtonGroup migrupo2= new ButtonGroup();
        
      JRadioButton boton1 = new JRadioButton("Azul",false);
      JRadioButton boton2 = new JRadioButton("Rojo",true);
      JRadioButton boton3 = new JRadioButton("Verde",false);
      JRadioButton boton4 = new JRadioButton("Masculino",false);
      JRadioButton boton5 = new JRadioButton("Femenino",false);

      migrupo1.add(boton1);
      migrupo1.add(boton2);
      migrupo1.add(boton3);
      migrupo2.add(boton4);
      migrupo2.add(boton5);
         
         add(boton1);
         add(boton2);
         add(boton3);
         add(boton4);
         add(boton5);
       
         
    }

   
}








