
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class acceso_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave = "juan";
        
        String pass ="";
        
        while(clave.equals(pass)==false){
            pass= JOptionPane.showInputDialog("introduce la contraseña, por favor :");
            if(clave.equals(pass)==false){
                System.out.println("contraseña incorrecta ");
            }

        }
        
        System.out.println("contrasña correcta. Acceso permitido ");
    }
    
}
