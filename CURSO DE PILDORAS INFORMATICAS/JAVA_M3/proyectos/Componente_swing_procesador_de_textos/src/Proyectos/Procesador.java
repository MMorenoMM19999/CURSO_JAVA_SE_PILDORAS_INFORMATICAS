


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledEditorKit;





/**
 *
 * @author Angel
 */
public class Procesador {

    
    public static void main(String[] args) {
        
        
    MenuProcesador_I3 Procesador3 = new MenuProcesador_I3();
    
    Procesador3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class MenuProcesador_I3 extends JFrame{
    
    public MenuProcesador_I3(){
        
        setVisible(true);
        
        setBounds(500,300,550,400);
        
        
        
        LaminaProcesador13 mkl = new LaminaProcesador13();
        add(mkl);
        
    
    
    }

}
    
class LaminaProcesador13 extends JPanel{
    
    public LaminaProcesador13(){
        
        setLayout(new BorderLayout());
/////////////////////////////////////////////////////////////////////////////        
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
/////////////////////////////////////////////////////////////////////////////
         fuente = new JMenu("Fuente");
         estilo = new JMenu("Estilo");
         tamaño = new JMenu("Tamaño");

/////////////////////////////////////////////////////////////////////////////        

        configurar_menu("Arial","fuente","Arial",9,10);
        configurar_menu("Courier","fuente","Courier",9,10);
        configurar_menu("Verdana","fuente","Verdana",9,10);
 //////////////////////////////////////////////////////////////////////                       
       // configurar_menu("Negrita","estilo","",Font.BOLD,1);
       // configurar_menu("Cursiva","estilo","",Font.ITALIC,1);
       JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",new ImageIcon("src/imagenes1/iconoMenu.jpg"));
       JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",new ImageIcon("src/imagenes1/iconoMenu.jpg"));
       
       negrita.addActionListener(new StyledEditorKit.BoldAction());
       cursiva.addActionListener(new StyledEditorKit.ItalicAction());
       
       estilo.add(negrita);
       estilo.add(cursiva);
 //////////////////////////////////////////////////////////////////////////
        /* configurar_menu("12","tamaño","",9,12);
         configurar_menu("16","tamaño","",9,16);
         configurar_menu("20","tamaño","",9,20);
         configurar_menu("24","tamaño","",9,24);
*/
        ButtonGroup tamaño_letra = new ButtonGroup();
        
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veinte_cuatro = new JRadioButtonMenuItem("24");
        
        tamaño_letra.add(doce);
        tamaño_letra.add(dieciseis);
        tamaño_letra.add(veinte);
        tamaño_letra.add(veinte_cuatro);
         
        
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",12));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",16));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",20));
        veinte_cuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",24));
        
        tamaño.add(doce);
        tamaño.add(dieciseis);
        tamaño.add(veinte);
        tamaño.add(veinte_cuatro);
        
/////////////////////////////////////////////////////////////////////////////       

        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamaño);
 ////////////////////////////////////////////////////////////////////////////       
        laminaMenu.add(miBarra);
 ////////////////////////////////////////////////////////////////////////////       
    add(laminaMenu,BorderLayout.NORTH);
        
     miarea = new JTextArea();
    add(miarea,BorderLayout.CENTER);
    
    }
public void configurar_menu (String rotulo, String menu,String tipo_letra,int estilos,int tam ){
    
  JMenuItem elem_menu = new JMenuItem(rotulo) ;
    if(menu=="fuente"){
        
        fuente.add(elem_menu);
        
        
        
    }else if(menu=="estilo"){
        
        estilo.add(elem_menu);
        
        
    }/*else if(menu=="tamaño"){
        
        tamaño.add(elem_menu);
        
        elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
    }*/
    
    elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));
    
}
   private class Gestiona_Eventos implements ActionListener{
 
       String tipo_texto,menu;
       int estilo_letra,tamaño_letra;

        public Gestiona_Eventos(String elemento,String texto2,int estilo2,int tam_letra2) {
            
            tipo_texto=texto2;
            estilo_letra=estilo2;
            menu=elemento;
            tamaño_letra=tam_letra2;
            
        }
       
       
        @Override
        public void actionPerformed(ActionEvent e) {
           
            letras=miarea.getFont();
            if(menu=="Arial"|| menu=="Courier"||menu=="Verdana"){
                estilo_letra=letras.getStyle();
                tamaño_letra=letras.getSize();
            }else if(menu=="Negrita"|| menu=="Cursiva"){
                
                tipo_texto=letras.getFontName();
                tamaño_letra=letras.getSize();
                
            }
            
            miarea.setFont(new Font(tipo_texto,estilo_letra,tamaño_letra));
            
        
        }
       
   }
   private JTextArea miarea; 
   private JMenu fuente, tamaño, estilo;
   private Font letras;
}








