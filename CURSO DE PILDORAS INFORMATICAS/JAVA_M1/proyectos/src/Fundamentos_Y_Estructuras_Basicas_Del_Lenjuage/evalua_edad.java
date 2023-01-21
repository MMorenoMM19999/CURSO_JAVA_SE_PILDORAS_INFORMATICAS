package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import java.util.Scanner;



/**
 *
 * @author Angel
 */
public class evalua_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("introduce tu edad,por favor: ");
        int edad = entrada.nextInt();
        
        if(edad<18){
            System.out.println("eres un adolecente compa");            
        }else if (edad<40){
            System.err.println("eres joven compa");
               
        }else if(edad <65){
            System.out.println("eres maduro compa");;
        }else{
            System.out.println("cuidate compa");
        }
        
        
        
        
        
    }
    
}
