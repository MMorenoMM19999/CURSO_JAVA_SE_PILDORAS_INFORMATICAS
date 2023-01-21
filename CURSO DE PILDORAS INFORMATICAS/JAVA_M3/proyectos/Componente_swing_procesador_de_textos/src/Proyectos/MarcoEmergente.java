


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledEditorKit;





/**
 *
 * @author Angel
 */
public class MarcoEmergente {

    
    public static void main(String[] args) {
        
        
    MarcoEmergenteM emergente = new MarcoEmergenteM();
    
    emergente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class MarcoEmergenteM extends JFrame{
    
    public MarcoEmergenteM(){
        
        setVisible(true);
        
        setBounds(100,100,300,250);
        
        
        
        LaminaEmergente laminaMM = new LaminaEmergente();
        add(laminaMM);
        
    
    
    }

}
    
class LaminaEmergente extends JPanel{
    
    public LaminaEmergente(){
        
        setLayout(new BorderLayout());
/////////////////////////////////////////////////////////////////////////////        
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
/////////////////////////////////////////////////////////////////////////////
         fuente = new JMenu("Fuente");
         estilo = new JMenu("Estilo");
         tamagno = new JMenu("Tamaño");
         
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        
        laminaMenu.add(miBarra);
        add(laminaMenu,BorderLayout.NORTH);
        
        miarea = new JTextPane();
        add(miarea,BorderLayout.CENTER);

        JPopupMenu emergentex = new JPopupMenu();
        
        JMenuItem opcion1 = new JMenuItem("opcion1");
        JMenuItem opcion2 = new JMenuItem("opcion2");
        JMenuItem opcion3 = new JMenuItem("opcion3");
        
        emergentex.add(opcion1);        
        emergentex.add(opcion2);        
        emergentex.add(opcion3);
        
        miarea.setComponentPopupMenu(emergentex);
   
    
    
    }
    
    

   private JTextPane miarea; 
   private JMenu fuente, tamagno, estilo;
   
}








