
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class entrada_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String num1 = JOptionPane.showInputDialog("introduce un numero ");
       
       double num2 = Double.parseDouble(num1);
        System.out.println("la raiz de :" + num2 + "es");
        System.out.printf("%1.2f",Math.sqrt(num2));
    }
    
}
