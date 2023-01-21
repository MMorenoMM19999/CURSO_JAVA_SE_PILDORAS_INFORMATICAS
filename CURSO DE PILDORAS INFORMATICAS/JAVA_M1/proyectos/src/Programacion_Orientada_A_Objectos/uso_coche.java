
package Programacion_Orientada_A_Objectos;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class uso_coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    coche micoche  = new coche();
    
    micoche.esteble_color(JOptionPane.showInputDialog("introduce el color :"));
        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dime_color());
        
    micoche.configura_Asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero??(si/no) :"));
         System.out.println(micoche.dime_asientos());
    micoche.configura_climatizador(JOptionPane.showInputDialog("¿¿tiene aclimatizador??(si/no) :"));
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_coche());
        System.out.println("el precio final del coche es :" + micoche.precio_coche());
    }
    
}
