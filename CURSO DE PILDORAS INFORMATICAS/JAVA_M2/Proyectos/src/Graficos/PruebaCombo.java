


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
public class PruebaCombo {

    
    public static void main(String[] args) {
        
        
    MarcoCombo combo = new MarcoCombo();
    
    combo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class MarcoCombo extends JFrame{
    
    public MarcoCombo(){
        
        setVisible(true);
        
        setBounds(550,300,550,400);
        
        LaminaCombo lamina = new LaminaCombo();
        
        add(lamina);
        
        
    
    
    }

}
    
class LaminaCombo extends JPanel{
    
    public LaminaCombo(){
        
        setLayout(new BorderLayout());
        
        texto= new JLabel("en un lugar de la manchade cuyo nombre ....");
        
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        
        add(texto,BorderLayout.CENTER);
        
        JPanel lamina_Norte = new JPanel();
        
        micombo= new JComboBox();
                
        micombo.setEditable(true);
        
        micombo.addItem("Serif");
         micombo.addItem("SanSerif");
          micombo.addItem("Monospaced");
           micombo.addItem("Dialog");
        
           evento_Combo escucha = new evento_Combo();
           
           micombo.addActionListener(escucha);
           
           
           lamina_Norte.add(micombo);
           
        add(lamina_Norte,BorderLayout.NORTH);
       
         
         
    }
   private class evento_Combo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
      
      texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
        
        }
       
   }
    
private JLabel texto;
private JRadioButton boton1,boton2,boton3,boton4;
private JComboBox micombo;   
}








