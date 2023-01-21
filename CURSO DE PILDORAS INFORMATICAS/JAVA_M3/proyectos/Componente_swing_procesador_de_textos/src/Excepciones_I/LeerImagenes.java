

package Excepciones_I;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Angel
 */
public class LeerImagenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcoImagen mimarco = new MarcoImagen();
    
    mimarco.setVisible(true);
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
}


class MarcoImagen extends JFrame{
    
    public MarcoImagen(){
        
        setTitle("Marco con imagen");
     
        setBounds(750,300,300,200);
        
        laminaConImagen x = new laminaConImagen();
        add(x);
        
      
    }
    
}

class laminaConImagen extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //File miimagen = new File("src/imagenes/IconoFR.png");
        try {
            //para que se cargue la imagen hay qeu corregir el enlace del mismo no es 
            //"imagenes " ---> "imgenes1"
            imagen = ImageIO.read(new File("src/imagenes/azul.jpg"));
        } catch (IOException e) {
            System.out.println("la imagen no se encunetra ");
            
        }
        if(imagen==null){
            g.drawString("no podemos cargar la imagen ", 10, 10);
        }else{
        int anchuraimagen = imagen.getWidth(this);
        int alturaimagen = imagen.getHeight(this);
        
        g.drawImage(imagen,0, 0,null);
        for(int i=0; i<300;i++){
            for(int j=0; j<200;j++){
                g.copyArea(0, 0, anchuraimagen, alturaimagen, anchuraimagen*i, alturaimagen*j);
            }
        }
        }
    }
  private Image imagen;  
}








