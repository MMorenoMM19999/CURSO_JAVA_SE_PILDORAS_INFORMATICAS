
package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 *
 * @author Angel
 */
public class lesctura_escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int contador=0;
   int datos_entrada[]=new int[74130];
        try {
            
            FileInputStream archivo_lectura = new FileInputStream("src/imagenes/amarillo.jpg");
            
            boolean final_ar = false;
            
            while(!final_ar){
                int byte_entrada = archivo_lectura.read();
                
                 if(byte_entrada!=-1){
                     datos_entrada[contador]=byte_entrada;
                 }
                
                   else{
                    
                    final_ar=true;
                    
                    System.out.println(datos_entrada[contador]);
                    contador++;
                    }
            }
            archivo_lectura.close(); 
            
        } catch (Exception e) {
            System.out.println("error al encontrar la imagen ");
        }
        
         System.out.println(contador);
         
         crea_fichero(datos_entrada);
         
         
    }
    static void crea_fichero(int datos_nuevo_fichero[]){
        
        try {
            
            FileOutputStream fichero_nuevo = new FileOutputStream("src/imagenes/amarillo.jpg");
            
            for(int i=0; i< datos_nuevo_fichero.length;i++){
                
                fichero_nuevo.write(datos_nuevo_fichero[i]);
                
                
            }
            
            fichero_nuevo.close();
            
        } catch (Exception e) {
            System.out.println("Error al crear el archivo ");
        }
        
        
    }
    
}
