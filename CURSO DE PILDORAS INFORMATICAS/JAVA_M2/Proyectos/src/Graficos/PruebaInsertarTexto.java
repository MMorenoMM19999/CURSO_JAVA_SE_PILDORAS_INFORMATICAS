


package Graficos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
public class PruebaInsertarTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoPrueba ndg = new MarcoPrueba();
    
    ndg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ndg.setVisible(true);
    
    }
    
}

class MarcoPrueba extends JFrame{
    
    public MarcoPrueba(){
        
        setTitle("Prueba Acciones");
        setBounds(500,300,500,350);
       
        LaminaPruebaInsetar hf = new LaminaPruebaInsetar();
      
        add(hf);
    }
    
    
}

class  LaminaPruebaInsetar extends JPanel{
    
    public LaminaPruebaInsetar(){
        
        micampo = new JTextField(20);
        
        escuchaTexto el_evento = new escuchaTexto();
         
        Document midoc =micampo.getDocument();
         
        midoc.addDocumentListener(el_evento);
        
        add(micampo);
        
      
  }
    
 private class escuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
      
            System.out.println("haz insertado texto");
        
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
      
            System.out.println("has removido texto");
        
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
      
        
        }
     
     
     
 }   
    
    
    private JTextField micampo;
    private JButton miboton;
    private JLabel resultado;
    
    
    
    
    
}






