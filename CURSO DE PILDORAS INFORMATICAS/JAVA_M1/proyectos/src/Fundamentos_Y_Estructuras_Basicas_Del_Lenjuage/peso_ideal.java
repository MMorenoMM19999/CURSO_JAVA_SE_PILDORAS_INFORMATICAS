
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class peso_ideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero ="";
        
        do{
            genero=JOptionPane.showInputDialog("introduce tu genero(H/M)");
            
            
                    
        }
        while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        int altura =Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
        int pesoideal=0;
        if(genero.equalsIgnoreCase("H")){
            pesoideal= altura-110;
        }
        else if(genero.equalsIgnoreCase("M")){
            pesoideal=altura-120;
        }
        System.out.println("tu peso ideal es: " + pesoideal + " KG ");
    }
    }
    

