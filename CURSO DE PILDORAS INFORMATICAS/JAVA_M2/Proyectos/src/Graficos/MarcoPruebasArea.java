


package Graficos;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;




/**
 *
 * @author Angel
 */
public class MarcoPruebasArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoPruebaArea nddfg = new MarcoPruebaArea();
    
    nddfg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    nddfg.setVisible(true);
    
    }
    
}

class MarcoPruebaArea extends JFrame{
    
    public MarcoPruebaArea(){
        
        setTitle("Probando Area de Texto");
      
        setBounds(500,300,500,350);
       
        setLayout(new BorderLayout());
        
        laminaBotones= new JPanel();
        
        botonInsertar = new JButton("insertar");
        
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
      
                areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme ");
            
            }
        });
        laminaBotones.add(botonInsertar);
        
        botonSaltoLinea = new JButton("Salto de linea ");
        
        botonSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
          boolean saltar =!areaTexto.getLineWrap();
          
          areaTexto.setLineWrap(saltar);

          /*if(saltar){
              
              botonSaltoLinea.setText("quitar salto");
              
          }else{
              
              botonSaltoLinea.setText("salto linea ");
              
          }*/
        
          botonSaltoLinea.setText(saltar ? "quitar salto" :  "salto de linea");
          
            }
        });
    
        laminaBotones.add(botonSaltoLinea);
        add(laminaBotones,BorderLayout.SOUTH);
        areaTexto= new JTextArea(8,20);
        laminaConBarras= new JScrollPane(areaTexto);
        add(laminaConBarras,BorderLayout.CENTER);
        
    }
    
   
    private  JPasswordField c_contra;
    private JButton botonInsertar,botonSaltoLinea;
    private JScrollPane laminaConBarras;
    private JPanel laminaBotones;
    private JTextArea areaTexto;




}
    









