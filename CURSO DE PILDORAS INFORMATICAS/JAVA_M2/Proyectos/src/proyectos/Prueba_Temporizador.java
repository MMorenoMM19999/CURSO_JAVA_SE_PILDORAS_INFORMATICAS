
package proyectos;


import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 *
 * @author Angel
 */
public class Prueba_Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
//  DameLaHora b =new DameLaHora();
    DameLaHora oyente = new DameLaHora();
    
    Timer mitemporizador = new Timer(5000,oyente);
   
    mitemporizador.start();
    //
    
        JOptionPane.showConfirmDialog(null,"pulsa aceptar para deterner");
        
        System.exit(0);

    }   
}

class DameLaHora implements ActionListener{

       public void actionPerformed (ActionEvent e){
   
             Date ahora = new Date();

             System.out.println("Te pongo la hora cada 5 sg : " +ahora);

             Toolkit.getDefaultToolkit().beep();
    }
       
}