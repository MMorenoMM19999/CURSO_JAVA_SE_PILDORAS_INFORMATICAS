
package Graficos;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String fuente = JOptionPane.showInputDialog("introduce fuente : ");
    
    boolean estalafuente =false;
      
   String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    
   for(String nombreDeFuente: nombreDeFuentes){
       if(nombreDeFuente.equals(fuente)){
           estalafuente=true;
       }
      
       
   }   
   
   if(estalafuente){
       System.out.println("Fuente instalada con exito");
   }else{
       System.out.println("No esta instalada la fuente ");
    }
  }
}
