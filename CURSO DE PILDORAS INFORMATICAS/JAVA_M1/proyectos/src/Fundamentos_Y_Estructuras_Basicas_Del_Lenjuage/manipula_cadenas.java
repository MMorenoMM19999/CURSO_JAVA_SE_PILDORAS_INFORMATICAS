
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

/**
 *
 * @author Angel
 */
public class manipula_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre = "Miguel";
        System.out.println("mi nombre es :"+nombre);
        System.out.println("mi nombre tiene:"+nombre.length()+"caracteres");
        System.out.println("la primera letra de "+ nombre +" es  "+ nombre.charAt(0)); 
       
        int ultimal;
        
        ultimal= nombre.length();
        System.out.println("y la ultima letra es la: " +nombre.charAt(ultimal-1));
         //manipulacion de cadenas ll
         
         String frase = "hoy es un estupendo dia para aprender a programar en java ";
          String frase_resumen = frase.substring(0,29) + "  irnos a la playa y olvidarnos de todo...";
          System.out.println(frase_resumen);
          
          
          
          //manipula cadenas lll
           
         String alumno1 = "david ";
         String alumno2 = "david";
         System.out.println(alumno1.equals(alumno2));
       }
    
}
