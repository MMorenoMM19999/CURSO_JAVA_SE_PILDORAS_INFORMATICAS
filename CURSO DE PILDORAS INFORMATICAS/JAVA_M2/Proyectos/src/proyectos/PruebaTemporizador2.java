
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
public class PruebaTemporizador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       reloj mireloj = new reloj(3000, true);
      
       mireloj.enMarcha();
    
   
    JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener ");
        System.exit(0);
    }
    
}

class reloj{
    public reloj(int intervalo,boolean sonido ){
        this.intervalo = intervalo;
        this.sonido = sonido;
        
    }
    
    public void enMarcha(){
        
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
        
    }
   private int intervalo;
   private boolean sonido;
   
   private class DameLaHora2 implements ActionListener{
     public void actionPerformed(ActionEvent evento){
         Date ahora = new Date();
         System.out.println("Te pongo la hora cada 3 sg :" + ahora);
     if(sonido){
         Toolkit.getDefaultToolkit().beep();
     }
     }   
   }
}