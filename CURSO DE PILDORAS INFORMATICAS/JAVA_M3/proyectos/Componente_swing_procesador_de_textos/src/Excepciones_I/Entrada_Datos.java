


package Excepciones_I;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class Entrada_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("¿   Que deseas hacer ?");   
        System.out.println("1.introducir datos ");   
        System.out.println("2.Salir del programa ");   
        
        
        Scanner entrada = new Scanner(System.in);
        
        int decision = entrada.nextInt();
        
        if(decision==1){
            
            try {
                pedirDatos();
            } catch (InputMismatchException e) {
                System.out.println("Que demonios acabas de introducir en la edad ???");
            }
            
            
        }else{
            
            System.out.println("Adios");
            
            System.exit(0);
            
        }
        entrada.close();
        
    }
    
    
static void pedirDatos() throws InputMismatchException{
    
    try {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor : ");
         
        String nombre_usuario= entrada.nextLine();
        
        System.out.println("Introduce edad, por favor ");
        
        int edad = entrada.nextInt();
        
        System.out.println("hola " + nombre_usuario + " el año que vienes tendras " + (edad) + "Años");
      
        entrada.close();
        
    
    } catch (Exception e) {
        System.out.println("que has introducido en l edad algo esta mal...!!!");
    }
    System.out.println("hameos terminado ");
    
    
}


}







