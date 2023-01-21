


package Proyectos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.*;





/**
 *
 * @author Angel
 */
public class Procesador_3_barra {

    
    public static void main(String[] args) {
        
        
    MenuProcesador_III menuH = new MenuProcesador_III();
    
    menuH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
    }
    
}

class MenuProcesador_III extends JFrame{
    
    public MenuProcesador_III(){
        
        setVisible(true);
        
        setBounds(500,300,550,400);
        
        
        
        LaminaH mkdl = new LaminaH();
        add(mkdl);
        
    
    
    }

}
    
final class LaminaH extends JPanel{
    
    public LaminaH(){
        
        setLayout(new BorderLayout());
/////////////////////////////////////////////////////////////////////////////        
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
/////////////////////////////////////////////////////////////////////////////
         fuente = new JMenu("Fuente");
         estilo = new JMenu("Estilo");
         tamaño = new JMenu("Tamaño");

/////////////////////////////////////////////////////////////////////////////        

        configurar_menu("Arial","fuente","Arial",9,10,"");
        configurar_menu("Courier","fuente","Courier",9,10,"");
        configurar_menu("Verdana","fuente","Verdana",9,10,"");
 //////////////////////////////////////////////////////////////////////                       
        configurar_menu("Negrita","estilo","",Font.BOLD,1,"src/imagenes1/iconoMenu.jpg");
        configurar_menu("Cursiva","estilo","",Font.ITALIC,1,"src/imagenes1/iconoMenu.jpg");
 //////////////////////////////////////////////////////////////////////////
         configurar_menu("12","tamaño","",9,12,"");
         configurar_menu("16","tamaño","",9,16,"");
         configurar_menu("20","tamaño","",9,20,"");
         configurar_menu("24","tamaño","",9,24,"");

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
    
    JToolBar barra = new JToolBar();
    
    
    JButton azulBarra = new JButton(new ImageIcon("src/imagenes1/amarillo.jpg"));
    JButton amarilloBarra = new JButton(new ImageIcon("src/imagenes1/azul.jpg"));
    JButton rojoBarra = new JButton(new ImageIcon("src/imagenes1/rojo.jpg"));
   
    barra.add(azulBarra);
    barra.add(amarilloBarra);
    barra.add(rojoBarra);
    
    JButton negritaBarra = new JButton("negrita",new ImageIcon("src/imagenes1/iconoMenu.jpg"));
    JButton cursivaBarra = new JButton("cursiva",new ImageIcon("src/imagenes1/iconoMenu.jpg"));
    JButton subrallado = new JButton("subrallar",new ImageIcon("src/imagenes1/iconoMenu.jpg"));
   
    negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
    cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
    subrallado.addActionListener(new StyledEditorKit.UnderlineAction());
    
    barra.add(negritaBarra);
    barra.add(cursivaBarra);
    barra.add(subrallado);
    
    amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_Amarillo", Color.yellow));    
    azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_azul", Color.BLUE));
    rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_rojo", Color.red));
    
    JButton a_izquierda = new JButton("Izquierda");
    JButton a_derecha = new JButton("Derecha");
    JButton a_justificado = new JButton("Justificado");
    JButton a_centrado = new JButton("Centrado");
   
    a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("centrado",0));
    a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 1));
    a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
    a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
    
    barra.add(a_centrado);
    barra.add(a_derecha);
    barra.add(a_izquierda);
    barra.add(a_justificado);
    
    
    
    
    
    
   
    
    barra.setOrientation(1);
   
    
    add(barra,BorderLayout.WEST);
    
    }
    
    
public void configurar_menu (String rotulo, String menu,String tipo_letra,int estilos,int tam,String ruta_icono){
    
  JMenuItem elem_menu = new JMenuItem(rotulo,new ImageIcon(ruta_icono) );
    if("fuente".equals(menu)){
        
        fuente.add(elem_menu);
        
        
        
    }else if("estilo".equals(menu)){
        
        estilo.add(elem_menu);
        
        
    }else if("tamaño".equals(menu)){
        
        tamaño.add(elem_menu);
        
        elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
    }
    
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
            
            if("Arial".equals(menu)|| "Courier".equals(menu)|| "Verdana".equals(menu)){
                estilo_letra=letras.getStyle();
                tamaño_letra=letras.getSize();
            }else if("Negrita".equals(menu)|| "Cursiva".equals(menu)){
                
                tipo_texto=letras.getFontName();
                tamaño_letra=letras.getSize();
                
            }else if("12".equals(menu)|| "16".equals(menu)|| "20".equals(menu)|| "24".equals(menu)){
                
                tipo_texto=letras.getFontName();
                estilo_letra=letras.getStyle();
                
            }
            
            miarea.setFont(new Font(tipo_texto,estilo_letra,tamaño_letra));
            
        
        }
       
   }
   private JTextArea miarea; 
   private JMenu fuente, tamaño, estilo;
   private Font letras;
}








