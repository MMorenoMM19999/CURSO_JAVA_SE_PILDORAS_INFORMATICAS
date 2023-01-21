


package Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class PruebaAcciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoConAccion mimarco = new MarcoConAccion();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mimarco.setVisible(true);
    
    }
    
}

class MarcoConAccion extends JFrame{
    
    public MarcoConAccion(){
        
        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);
       
        
        
        panelAccion milamia = new panelAccion();
        add(milamia);
    }
    
    
}

class  panelAccion extends JPanel{
    
    public panelAccion(){
        
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/imagenes/iconoFR.png"),Color.BLUE);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/imagenes/iconoFR.png"),Color.YELLOW);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/imagenes/iconoFR.png"),Color.RED);
        
     add(new JButton(accionAmarillo));
      add(new JButton(accionAzul));
       add(new JButton(accionRojo));
    /*    JButton botonAmarillo = new JButton("Amarillo");
         JButton botonAzul = new JButton("Azul");
         JButton botonRojo = new JButton("Rojo");
        
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
  */
     
    }
    


  private class AccionColor extends AbstractAction{
    
    public AccionColor(String nombre, Icon icono,Color color_boton){
        putValue(Action.NAME,nombre);
        putValue(Action.SMALL_ICON,icono);
        putValue(Action.SHORT_DESCRIPTION, "poner lamina de color " + nombre);
        putValue("color_de_fondo", color_boton);
    
    }


    public void actionPerformed(ActionEvent e) {
        Color c =(Color)getValue("color_fondo");
       
        setBackground(c);
        
        System.out.println("Nombre :" + getValue(Action.NAME)+ " Descripcion : " + getValue(Action.SHORT_DESCRIPTION));        
    }
 
    
  }
}
