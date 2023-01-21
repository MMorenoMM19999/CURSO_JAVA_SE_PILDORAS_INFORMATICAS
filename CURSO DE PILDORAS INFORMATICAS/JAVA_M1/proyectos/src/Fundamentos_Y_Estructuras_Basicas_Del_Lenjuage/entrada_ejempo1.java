
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class entrada_ejempo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduce tu nombre, por favor :");
        String nombre_usuario= entrada.nextLine();
        System.out.println("introduce tu edad, por favor:");
        int edad= entrada.nextInt();
        System.out.println("hola " + nombre_usuario + " el año que viene tendras : "+ (edad+1));
        
        
    }
    
}
