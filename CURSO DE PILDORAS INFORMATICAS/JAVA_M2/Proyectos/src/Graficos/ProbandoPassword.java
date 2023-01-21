


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
public class ProbandoPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoPassword ndg = new MarcoPassword();
    
    ndg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ndg.setVisible(true);
    
    }
    
}

class MarcoPassword extends JFrame{
    
    public MarcoPassword(){
        
        setTitle("Prueba Acciones");
        setBounds(400,300,550,400);
       
        LaminaPassword hf = new LaminaPassword();
      
        add(hf);
    }
    
    
}

class  LaminaPassword extends JPanel{
    
    public LaminaPassword(){
        
        setLayout(new BorderLayout());
        
        JPanel lamina_superior = new JPanel();
        
        lamina_superior.setLayout(new GridLayout(2,2));
        
        add(lamina_superior,BorderLayout.NORTH);
        
        JLabel etiqueta1 = new JLabel("usuario");
        
        JLabel etiqueta2 = new JLabel("contraseña");
        
        JTextField c_usuario = new JTextField(15);
        
        Comprueba_pass mievento = new Comprueba_pass();
        
         c_contra = new JPasswordField(15);
        
         c_contra.getDocument().addDocumentListener(mievento);
         
        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(c_contra);
        
        JButton enviar = new JButton("Enviar");
        add(enviar,BorderLayout.SOUTH);
        
        
        
      
  }
    
  private class Comprueba_pass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
        
            char [] contraseña;
            
            contraseña=c_contra.getPassword();
            
            if(contraseña.length<8 || contraseña.length>12){
                c_contra.setBackground(Color.red);
            }else{
                c_contra.setBackground(Color.WHITE);
            }
            
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
     
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
     
        }
        
    
  }
    
    

    
    
     private  JPasswordField c_contra;
    
    
}






