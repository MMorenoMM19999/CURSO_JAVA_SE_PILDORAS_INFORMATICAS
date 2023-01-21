


package Graficos;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class Prueva_Acciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Marco_principal d = new Marco_principal();
    
    d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    d.setVisible(true);
    
    }
    
}

class Marco_principal extends JFrame{
    
    public Marco_principal(){
        
        setTitle("Prueba Varios");
        setBounds(80,100,300,200);
       
         
        
        lamina_principal f = new lamina_principal();
        add(f);
    }
    
    
}

class  lamina_principal extends JPanel{
    
    public lamina_principal(){
        
     
         JButton boton_nuevo = new JButton("Nuevo");
         add(boton_nuevo);
         boton_cerrar= new JButton("Cerrar_todo");

        add(boton_cerrar);
        
        OyenteNuevo miOyente = new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);

    }
    
    private class OyenteNuevo implements ActionListener{
      
        @Override
        public void actionPerformed(ActionEvent e) {
            marco_emergente marco = new marco_emergente(boton_cerrar);
            marco.setVisible(true);
      }
    }
    
JButton boton_cerrar;

}

   class marco_emergente extends JFrame{
    
    public marco_emergente(JButton boton_de_principal){
        contador++;
        setTitle("ventana " + contador);
    
        setBounds(40*contador, 40*contador, 300,150);
        CierraTodos oyentesCerrar = new CierraTodos();
        boton_de_principal.addActionListener(oyentesCerrar);
    }
    private class CierraTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
     dispose();
        }
        
    }
    
private static int contador=0;

   
 
    
  }

