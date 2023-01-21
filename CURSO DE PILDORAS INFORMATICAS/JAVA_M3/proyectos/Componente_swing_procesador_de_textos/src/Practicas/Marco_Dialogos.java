

package Practicas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class Marco_Dialogos extends JFrame {

      public Marco_Dialogos(){
          setTitle("Pruebas de dialogos");
          setBounds(500, 300,600,450);
          
          JPanel lamina_cuadricula = new JPanel();
          
          lamina_cuadricula.setLayout(new GridLayout(2,3));
          
          String primero[]={"Mensajes","Confirmar","Opcion","Entrada"};
          
          lamina_tipo= new Lamina_Botones("Tipo", primero);
          
          lamina_tipo_mensajes = new Lamina_Botones("Tipo de mensaje",new String []{
          
              "ERROR_MESSAGE",
              "INFORMATION_MESSAGE",
              "WARRING_MENSSAGE",
              "PLAIN_MESSAGE"
              
              
          });
          
          lamina_mensaje= new Lamina_Botones("Mensaje", new String[]{
              
              "Cadena",
              "Icono",
              "Componente",
              "Otros",
              "Object[]"
              
              
          });
          
          lamina_tipo_opcion = new Lamina_Botones("Confirmar",new String[]{
             
              "DEFAULT_OPTION",
              "YES_NO_OPTION",
              "YES_NO_CANCEL_OPTION",
              "OK_CANCEL_OPTION"
              
              
          });
          
          lamina_opciones = new Lamina_Botones("Opcion",new String[]{
             
              "String[]",
              "Icon[]",
              "Object[]"
              
              
          });
          lamina_entrada = new Lamina_Botones("Entrada",new String[]{
             
              "campo de texto",
              "Combo"
              
          });
          
          setLayout(new BorderLayout());
          
          lamina_cuadricula.add(lamina_tipo);
          lamina_cuadricula.add(lamina_tipo_mensajes);
          lamina_cuadricula.add(lamina_mensaje);
          lamina_cuadricula.add(lamina_tipo_opcion);
          lamina_cuadricula.add(lamina_opciones);
          lamina_cuadricula.add(lamina_entrada);
          
          //construimos lamina inferior
          
          JPanel lamina_mostrar =new JPanel();
          
          JButton boton_mostrar = new JButton("Mostrar");
          
          boton_mostrar.addActionListener(new accionMostrar());
          
          lamina_mostrar.add(boton_mostrar);
          
          add(lamina_mostrar,BorderLayout.SOUTH);
          
          add(lamina_cuadricula,BorderLayout.CENTER);
          
         // add(lamina_cuadricula);
          
          
      }
      

//--------------------------------PROPORCIONA EL MENSAJE-----------------------------      
      
  public Object dameMensaje(){
      
      String s =lamina_mensaje.dameSeleccion();
      
      if(s.equals("Cadena")){
          return cadenaMensaje;
      }else if(s.equals("Icono")){
          return iconoMensaje;
      }else if(s.equals("Componente")){
          return componenteMensaje;
      }else if(s.equals("Otros")){
          return objectoMensaje;
      }else if(s.equals("Object[]")){
          return new Object[]{cadenaMensaje,
              iconoMensaje,
              componenteMensaje,
              objectoMensaje
          };
      }else{
          return null;
      }
      
  }    
          
//---------------------DEVUELVE TIPO ICONO Y TAMBIEN Nº BOTONES DE CONFIRMAR---------------------------------------- 
      public int dameTipo(Lamina_Botones lamina){
          
          String s = lamina.dameSeleccion();
          
          if(s.equals("ERROR_MENSSAGE")|| s.equals("YES_NO_OPTION")){
              return 0;
              
          }else if(s.equals("INFORMATION_MESSAGE")|| s.equals("YES_NO_CANCEL_OPTION")){
              return 1;
              
          }else if(s.equals("WARRING_MESSAGE")|| s.equals("OK_CANCEL_OPTION")){
              return 2;
          }else if(s.equals("QUESTION_MESSAGE")){
              return 3;
          }else if(s.equals("PLAIN_MESSAGE")|| s.equals("DEFAULT_OPTION")){
              return -1;
          }else{
              return 0; 
          }
      }
        
//----------------------------DA OPCIONES A LA LAMINA OPCION--------------------------------- 
      public Object dameOpciones(Lamina_Botones lamina ){
          String s = lamina.dameSeleccion();
          
          if(s.equals("String[]")){
              return new String[]{"Amarillo","Azul","Rojo"};
              
          }else if(s.equals("Icon[]")){
               
               return new Object[]{new ImageIcon("src/imagenes1/azul.jpg"),new ImageIcon("src/imagenes1/amarillo.jpg"), new ImageIcon("src/imagenes1/rojo.jpg")};
              
          }else if(s.equals("Objecto[]")){
          
                return new Object[]{cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objectoMensaje
                };
          
          }else{
              
              return null;
              
          }
      }
      
      
      
//------------------------------------------------------------- 
  
      private class accionMostrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           // System.out.println(lamina_tipo_mensajes.dameSeleccion());
        if(lamina_tipo.dameSeleccion().equals("Mensaje")){
            JOptionPane.showMessageDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes));
        }else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
            JOptionPane.showConfirmDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_opcion),dameTipo(lamina_tipo_mensajes));
        }else if(lamina_tipo.dameSeleccion().equals("Entrada")){
            
            if(lamina_entrada.dameSeleccion().equals("Campo de texto")){
                 JOptionPane.showInputDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes));
            }else{
                JOptionPane.showInputDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes),null,new String[]{"Amarillo","Azul","Rojo"},"Azul");
            }
            
           // JOptionPane.showInputDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes));
           
        }else if(lamina_tipo.dameSeleccion().equals("Opcion")){
            
            JOptionPane.showOptionDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",1,dameTipo(lamina_tipo_mensajes),null, (Object[]) dameOpciones(lamina_opciones),null);
        
        }
           
        }
          
      }
    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes,lamina_mensaje,lamina_tipo_opcion,lamina_opciones,lamina_entrada;
    
    private String cadenaMensaje="Mensaje";
    private Icon iconoMensaje= new ImageIcon("src/imagenes1/Imagenes1.gif");
    private Object objectoMensaje= new Date();
    private Component componenteMensaje = new Lamina_ejemplo();


}
class Lamina_ejemplo extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 =(Graphics2D)g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
        
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);
        
    }
    
}