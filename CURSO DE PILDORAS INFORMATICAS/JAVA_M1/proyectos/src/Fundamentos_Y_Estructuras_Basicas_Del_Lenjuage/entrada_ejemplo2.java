
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class entrada_ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre = JOptionPane.showInputDialog("introduce tu nombre po favor :");
       String edad = JOptionPane.showInputDialog("introduce tu edad por favor :");
       int edad_usuario = Integer.parseInt(edad);
       edad_usuario++;
       System.out.print("hola " + nombre + " el año que viene tendras :" + edad_usuario + " años ") ;
               
               }
    
}
