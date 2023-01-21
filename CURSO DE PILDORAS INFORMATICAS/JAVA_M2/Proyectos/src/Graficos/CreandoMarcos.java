

package Graficos;

import javax.swing.*;

/**
 *
 * @author Angel
 */
public class CreandoMarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    miMarco x = new miMarco();
    x.setVisible(true);
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        setSize(500,300);
       // setLocation(500,300);
       // setBounds(500,300,250,250);
       // setResizable(false);
        setTitle("mi ventana");
    }
    
}


