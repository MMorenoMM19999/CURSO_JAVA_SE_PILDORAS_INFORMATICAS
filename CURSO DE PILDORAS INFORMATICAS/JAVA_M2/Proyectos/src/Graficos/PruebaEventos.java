


package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class PruebaEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoBotones mimarco = new MarcoBotones();
    
    mimarco.setVisible(true);
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}


class MarcoBotones extends JFrame{
    
    public MarcoBotones(){
        
        setTitle("prueba con fuentes");
     
        setBounds(700,300,500,300);
        
        laminaBotones x = new laminaBotones();
        add(x);
        
      
     
    }
    
}

class laminaBotones extends JPanel implements ActionListener{
    
    JButton botonAzul = new JButton("Azul");
     JButton botonAmarilo = new JButton("Amarillo");
     JButton botonRojo = new JButton("Rojo");
    
    
    public laminaBotones(){
        add(botonAzul);
        add(botonAmarilo);
        add(botonRojo);
        
        botonAzul.addActionListener(this);
         botonAmarilo.addActionListener(this);
          botonRojo.addActionListener(this);
    }    


    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado =e.getSource();
      if(botonPulsado==botonAzul){
          setBackground(Color.BLUE);
          
      } else if(botonPulsado==botonAmarilo){
          setBackground(Color.YELLOW);
      }else{
          setBackground(Color.red);
      }
    }
}








