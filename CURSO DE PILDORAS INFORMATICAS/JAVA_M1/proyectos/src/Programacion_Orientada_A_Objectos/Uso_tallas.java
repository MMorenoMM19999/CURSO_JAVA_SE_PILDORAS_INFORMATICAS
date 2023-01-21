
package Programacion_Orientada_A_Objectos;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Uso_tallas {

    
    enum Talla {
        
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
   private Talla (String abreviatura){
       this.abreviatura=abreviatura;
   }
    public String dameAbreviatura(){
        
       return abreviatura; 
    }   
   
   private String abreviatura;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("escribe una talla :MINI,MEDIANO, GRANDE, MUY_GRANDE : ");
        String entrada_datos = entrada.next().toUpperCase();
        Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla : " + la_talla);
        System.out.println("Abreviaturas : " + la_talla.dameAbreviatura());
    
    }
    
}
