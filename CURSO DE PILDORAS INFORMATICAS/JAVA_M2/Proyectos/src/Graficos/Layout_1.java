


package Graficos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class Layout_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Marco_layout g = new Marco_layout();
    
    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    g.setVisible(true);
    
    }
    
}

class Marco_layout extends JFrame{
    
    public Marco_layout(){
        
        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);
       
         
        
        Panel_Layout h = new Panel_Layout();
       // h.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(h);
    }
    
    
}

class  Panel_Layout extends JPanel{
    
    public Panel_Layout(){
        
        setLayout(new BorderLayout());

        add(new JButton("Amarillo"),BorderLayout.NORTH);
         add(new JButton("Rojo"),BorderLayout.SOUTH);
          add(new JButton("Azul"),BorderLayout.WEST);
         add(new JButton("Verde"),BorderLayout.EAST);
          add(new JButton("Negro"),BorderLayout.CENTER);
          
    }
    
    
    
}