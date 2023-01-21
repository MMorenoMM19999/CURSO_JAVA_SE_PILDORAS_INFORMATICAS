
package fichero_directorios;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int elementos =Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz "));
        
        int bum_aleat[]=new int [elementos];
        
        for(int i=0; i<bum_aleat.length;i++){
            
            bum_aleat[i]=(int)(Math.random()*100);
            
        }
        
           for(int elem :bum_aleat){
            
               System.out.println(elem);
            
        }
        
        
    
    }
    
}
