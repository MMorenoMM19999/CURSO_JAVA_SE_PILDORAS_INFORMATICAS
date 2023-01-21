


package Graficos;

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





/**
 *
 * @author Angel
 */
public class MarcoMenu {

    
    public static void main(String[] args) {
        
        
    FrameMenu menu = new FrameMenu();
    
    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class FrameMenu extends JFrame{
    
    public FrameMenu(){
        
        setVisible(true);
        
        setBounds(550,350,550,350);
        
        
        
          MenuLamina menuNuevo =new MenuLamina();
        add(menuNuevo);
        
    
    
    }

}
    
class MenuLamina extends JPanel{
    
    public MenuLamina(){
       JMenuBar mibarra = new JMenuBar();
       
       JMenu archivo = new JMenu("Archivo");
       
       JMenu edicion = new JMenu("Edicion");
       
       JMenu herramientas = new JMenu("Herramientas");
       
       JMenu opciones = new JMenu("Opciones");
       
       JMenuItem guardar = new JMenuItem("Guardar");
       
       JMenuItem guardar_como = new JMenuItem("Guardar Como");
       
       JMenuItem cortar = new JMenuItem("Cortar");
       
       JMenuItem pegar = new JMenuItem("Pegar");
       
       JMenuItem copiar = new JMenuItem("Copiar");
       
       JMenuItem generales = new JMenuItem("Generales");
       
       JMenuItem opcion1 = new JMenuItem("opcion 1");
       
       JMenuItem opcion2 = new JMenuItem("opcion 2");
       
       opciones.add(opcion1);
       
       opciones.add(opcion2);
       
       //edicion.add(opciones);
       //
       
       archivo.add(guardar);
       
       archivo.add(guardar_como);
       
       edicion.add(cortar);
       
       edicion.add(pegar);
       
        edicion.add(copiar);
       //
       
       edicion.addSeparator();
       edicion.add(opciones);
       
       
       
       archivo.add(generales);
       
       mibarra.add(archivo);
       
       mibarra.add(edicion);
       
       mibarra.add(herramientas);
       
       add(mibarra);
       
       
        
    }


}








