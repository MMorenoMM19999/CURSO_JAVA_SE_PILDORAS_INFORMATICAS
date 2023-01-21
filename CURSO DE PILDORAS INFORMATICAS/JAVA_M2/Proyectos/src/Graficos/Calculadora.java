
package Graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Marco_calculadora kf = new Marco_calculadora();
       kf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kf.setVisible(true);
    }
    
}
class Marco_calculadora extends JFrame{
    
    public Marco_calculadora(){
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
    LaminaCalculadora b = new LaminaCalculadora();
    add(b);
    
    
    }
    
    
}


class LaminaCalculadora extends JPanel{
    
    public LaminaCalculadora(){
        
        principio=true;
        
        setLayout(new BorderLayout());
        
        pantalla = new JButton("0");
        
        pantalla.setEnabled(false);
        
        add(pantalla,BorderLayout.NORTH);
        
        milamina = new JPanel();
        
        milamina.setLayout(new GridLayout(4,4));
        
        ActionListener insertar =new insertarnumero();
        ActionListener orden =new AccionOrden();
        
        
        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("/",orden);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("*",orden);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("-",orden);
        ponerBoton("0",insertar);
        //ponerBoton(".");
        ponerBoton("=",orden);
        ponerBoton("+",orden);
        
        add(milamina,BorderLayout.CENTER);
        ultimaOperacion="=";
    }
    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        
        boton.addActionListener(oyente);
        
        milamina.add(boton);
    }
    private class insertarnumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
    
        String entrada= e.getActionCommand();
        
        if(principio){
            
             pantalla.setText("");
             principio=false;
        
        }
       
         pantalla.setText(pantalla.getText()+entrada);
        }
        
        
    }
    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String operacion =e.getActionCommand();
            
            
            
        
            calcular(Double.parseDouble(pantalla.getText()));
        
            ultimaOperacion=operacion;
            
            principio=true;
        
        }
    public void calcular (double x){
        
        if(ultimaOperacion.equals("+")){
            resultado+=x;
        }else if(ultimaOperacion.equals("-")){
            resultado-=x;
        }else if(ultimaOperacion.equals("*")){
            resultado*=x;
        }else if(ultimaOperacion.equals("/")){
            resultado/=x;
        }
        else if(ultimaOperacion.equals("=")){
            resultado=x;
        }
        pantalla.setText(""+resultado);
    }
    
    
}
   private JPanel milamina; 
   private JButton pantalla;
   private boolean principio;
   private double resultado;
   private String ultimaOperacion;
}





