
package Excepciones_I;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Areas_conExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.printf("elige una opcion : \n1: cuadrado  \n2: rectangulo  \n3:triangulo  \n4: circulo");
      
       int figura= entrada.nextInt();  
        /*
        try {
             figura = entrada.nextInt();
          //  entrada.close();
        } catch (Exception e) {
            System.out.println("ha ocurrido un error ");
        }finally{
            entrada.close();
        }
        */
        
        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado : "));
                 System.out.printf("el area del cuadrado es " + Math.pow(lado,2));
                 
                break;
                 case 2:
                     int base =Integer.parseInt(JOptionPane.showInputDialog("intorduce la base :"));
                     int altura = Integer.parseInt(JOptionPane.showInputDialog("intorduce la altura: "));
                     System.out.printf("el area del rectagulo es : "+base*altura );
                   break;
                case 3:
                      base =Integer.parseInt(JOptionPane.showInputDialog("intorduce la base :"));
                      altura = Integer.parseInt(JOptionPane.showInputDialog("intorduce la altura: "));
                     System.out.printf("el area del triangulo es : "+(base*altura)/2 );
                    break;
                case 4:
                     int radio =Integer.parseInt(JOptionPane.showInputDialog("intorduce la radio :"));
                    System.out.printf("el area del circulo es : ");
                    System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
                  break;
                     
            default:
                System.out.println("la opcion no es correcta");
        }
        
        
         //  
    }
  //   private int figura;  
}
