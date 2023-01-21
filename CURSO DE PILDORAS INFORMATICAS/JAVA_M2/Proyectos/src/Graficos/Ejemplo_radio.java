


package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 *
 * @author Angel
 */
public class Ejemplo_radio {

    
    public static void main(String[] args) {
        
        
    Marco_radio1 mimarcoh = new Marco_radio1();
    
    mimarcoh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class Marco_radio1 extends JFrame{
    
    public Marco_radio1(){
        
        setVisible(true);
        
        setBounds(550,300,500,350);
        
        Lamina_radio1 mhh = new Lamina_radio1();
        
        add(mhh);
        
        
    
    
    }

}
    
class Lamina_radio1 extends JPanel{
    
    public Lamina_radio1(){
        
        setLayout(new BorderLayout());
        
        texto= new JLabel("en un lugar de la manchade cuyo nombre ....");
        
        
        add(texto,BorderLayout.CENTER);
        
        ButtonGroup migrupo1 = new ButtonGroup();
        
        boton1= new JRadioButton("Pequeño",false);
        boton2= new JRadioButton("Mediano",true);
        boton3= new JRadioButton("Grande",false);
        boton4= new JRadioButton("Muy grande",false);
        
        JPanel lamina_radio = new JPanel();
        
        evento_radio mievento = new evento_radio();
         
        boton1.addActionListener(mievento);
        boton2.addActionListener(mievento);
        boton3.addActionListener(mievento);
        boton4.addActionListener(mievento);
        
      migrupo1.add(boton1);
      migrupo1.add(boton2);
      migrupo1.add(boton3);
      migrupo1.add(boton4);
  
      lamina_radio.add(boton1);
      lamina_radio.add(boton2);
      lamina_radio.add(boton3);
      lamina_radio.add(boton4);
      
      add(lamina_radio,BorderLayout.SOUTH);
         
       
         
         
    }
   private class evento_radio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
      
        if(e.getSource()==boton1){
           // System.out.println("has pulasdo el 1");
        
           texto.setFont(new Font("Serif",Font.PLAIN,10));
        
        }else if(e.getSource()==boton2){
              texto.setFont(new Font("Serif",Font.PLAIN,12));
        }else if(e.getSource()==boton3){
              texto.setFont(new Font("Serif",Font.PLAIN,18));
        }else if(e.getSource()==boton4){
              texto.setFont(new Font("Serif",Font.PLAIN,24));
        }
        
        
        
        }
       
   }
    
private JLabel texto;
private JRadioButton boton1,boton2,boton3,boton4;
   
}








