


package Excepciones_I;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class VariasExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        try {
            Division();
        } catch (ArithmeticException e) {
        
            System.out.println("Estas dividiendo por 0 ");
        
        }catch(NumberFormatException g){
            
            System.out.println("no has introducido un numero entero compa");
          System.out.println("se ha generado un error de este tipo : " + g.getClass().getName());
        
        }
    
    
    }
  
    static void Division (){
        int num1 =Integer.parseInt(JOptionPane.showInputDialog("introduce el dividendo : "));
        int num2 =Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor :"));
     
        System.out.println("El resultado es :" + num1/num2);
    
    
    }
    
    
}
