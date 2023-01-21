


package Graficos;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;




/**
 *
 * @author Angel
 */
public class EjemploArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoArea ndfg = new MarcoArea();
    
    ndfg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ndfg.setVisible(true);
    
    }
    
}

class MarcoArea extends JFrame{
    
    public MarcoArea(){
        
        setTitle("Prueba Acciones");
        setBounds(500,300,500,350);
       
        LaminaArea hf = new LaminaArea();
      
        add(hf);
    }
    
    
}

class  LaminaArea extends JPanel{
    
    public LaminaArea(){
        

        
         miarea = new JTextArea(8,20);
        
        JScrollPane laminaBarras = new JScrollPane(miarea);
            
        add(laminaBarras);
        
        JButton miboton = new JButton("Dale");
        
        miboton.addActionListener(new GestionaArea());
        
        add(miboton);
      
  }
    
  private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println(miarea.getText());
            
       }
  
    
  }
    

     private  JPasswordField c_contra;
    private JTextArea miarea;
    
}






