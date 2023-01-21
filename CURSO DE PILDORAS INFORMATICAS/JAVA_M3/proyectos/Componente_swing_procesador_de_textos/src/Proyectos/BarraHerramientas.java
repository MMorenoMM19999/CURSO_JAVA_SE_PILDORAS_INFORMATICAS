


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class BarraHerramientas {

    
    public static void main(String[] args) {
        
        
    Barra her = new Barra();
    
    her.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class Barra extends JFrame{
    
    public Barra(){
        
        setVisible(true);
        setTitle("MArco con Barra");
        setBounds(500,300,600,450);
        
        
        
        laminaMM = new JPanel();
        add(laminaMM);
        
        //configura acciones 
    
     Action  accionAzul = new AccionColor ("Azul",new ImageIcon("src/imagenes1/azul.jpg"),Color.blue);
     Action  accionAmarillo = new AccionColor ("Amarillo",new ImageIcon("src/imagenes1/amarillo.jpg"),Color.YELLOW);
     Action  accionRojo = new AccionColor ("Rojo",new ImageIcon("src/imagenes1/rojo.jpg"),Color.RED);
     
     JMenu menu = new JMenu("Color");
     
     menu.add(accionAzul);
     menu.add(accionAmarillo);
     menu.add(accionRojo);
     
     JMenuBar barra_menus = new JMenuBar();
     barra_menus.add(menu);
     setJMenuBar(barra_menus);
     
     //construccion de la barra de herramientas
     JToolBar barra = new JToolBar();
    
     barra.add(accionAzul);
     barra.add(accionAmarillo);
     barra.add(accionRojo);
     
     add(barra,BorderLayout.NORTH);
     
    }


    
private class AccionColor extends AbstractAction{
    
    public AccionColor(String nombre,Icon icono, Color c){
        
        putValue(Action.NAME,nombre);
        putValue(Action.SMALL_ICON,icono);
        putValue(Action.SHORT_DESCRIPTION,"color de fondo " + nombre);
        putValue("Color ",c);
        
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Color c = (Color)getValue("Color");
            
            laminaMM.setBackground(c);
                  
        }
    
    

   
    
}
 private JPanel laminaMM;
 private JTextPane miarea; 
 private JMenu fuente, tamagno, estilo;
}







