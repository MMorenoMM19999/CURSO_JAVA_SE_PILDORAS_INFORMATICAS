


package Graficos;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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
public class PruebaCheck {

    
    public static void main(String[] args) {
        
        
    MarcoCheck mimarco = new MarcoCheck();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class MarcoCheck extends JFrame{
    
    public MarcoCheck(){
        
        setBounds(550,300,550,350);
        
        setVisible(true);
        
        LaminaCheck milamina = new LaminaCheck();
        
        add(milamina);
        
        
    
    
    }

}
    
class LaminaCheck extends JPanel{
    
    public LaminaCheck(){
        
        setLayout(new BorderLayout());
        
        Font miletra =new Font("Serif",Font.PLAIN,24);
        
        texto = new JLabel("en un lugar de la mancha de cuyo nombre...");
        
        texto.setFont(miletra);
        
        JPanel laminatexto = new JPanel();
        
        laminatexto.add(texto);
        
        add(laminatexto,BorderLayout.CENTER);
        
        check1 = new JCheckBox("Negrita");
        
        check2 = new JCheckBox("Cursiva");
        
        check1.addActionListener(new ManejaChecks());
        
        check2.addActionListener(new ManejaChecks());
        
        JPanel laminaChecks = new JPanel();
        
        laminaChecks.add(check1);
        
        laminaChecks.add(check2);
        
        add(laminaChecks,BorderLayout.SOUTH);
        
                
        
    }
    
    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
       
            int tipo=0;
            
            if(check1.isSelected()) tipo+=Font.BOLD;
            
            if(check2.isSelected()) tipo+=Font.ITALIC;
            
            texto.setFont(new Font("Serif",tipo,24));
      
        }
        
    }
    private JLabel texto;
    private JCheckBox check1,check2;
}








