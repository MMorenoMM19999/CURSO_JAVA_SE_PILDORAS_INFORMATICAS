
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class compruebe_email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int arroba=0;
      boolean punto = false;
        String mail =JOptionPane.showInputDialog("introduce el email :");
        for(int i=0;i<mail.length();i++){
            
            if(mail.charAt(i) =='@'){
                arroba++;
            }
            if(mail.charAt(i)== '.'){
                punto=true;
            }
        }
        
        if(arroba==1 && punto==true){
            System.out.println("es correcto");
        }else{
            System.out.println("no es correcto");
        }
        
    }
    
}
