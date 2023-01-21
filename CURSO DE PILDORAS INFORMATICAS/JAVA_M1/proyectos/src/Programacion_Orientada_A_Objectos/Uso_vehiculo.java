
package Programacion_Orientada_A_Objectos;

import Programacion_Orientada_A_Objectos.coche;

/**
 *
 * @author Angel
 */
public class Uso_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    coche micohce1 = new coche();
    micohce1.esteble_color("rojo");
    
    furgoneta mifurgoneta = new furgoneta(7,500);
    mifurgoneta.esteble_color("azul");
    mifurgoneta.configura_Asientos("si");
    mifurgoneta.configura_climatizador("si");
        System.out.println(micohce1.dime_datos_generales() + " " + micohce1.dime_color());
        System.out.println(mifurgoneta.dimeDatosFurgoneta()+"  " + mifurgoneta.dime_datos_generales());
    }
    
}
