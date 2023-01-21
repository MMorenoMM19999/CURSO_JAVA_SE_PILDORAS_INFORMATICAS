/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class adivina_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int aleatorio =(int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int intentos =0;
        while(numero!=aleatorio){
            
            System.out.println("introduce un numero por favor");
            numero=entrada.nextInt();
            if(aleatorio<numero){
                System.out.println("mas bajo");
                intentos++;
            }
            else if(aleatorio>numero){
                System.out.println("mas alto");
                intentos++;
            }
        }
             System.out.println("correcto compa lo has conseguido en  " +  intentos + " intentos");   
    }
    
}
