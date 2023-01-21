

package fichero_directorios;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Angel
 */
public class crear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    File ruta = new File("C:"+ File.separator+ "Users"+ File.separator+"Angel"+ File.separator+"Documents" + File.separator +"CURSO_JAVA" + File.separator+ "JAVA_M4"+ File.separator + " Prueba_de_texto.txt" );
    
    //ruta.mkdir();
    
    String archivo_destino =ruta.getAbsolutePath();
    
        try {
            
            ruta.createNewFile();
            
            
        } catch (Exception e) {
        
            e.printStackTrace();
        }
    
    Escribiendo accede_es = new Escribiendo();
    accede_es.ecribir(archivo_destino);

    }
            
 }
 
class Escribiendo{
    
    public void ecribir (String ruta_archivo){
        String frase ="Esto es un ejemplo. Espero que salga ";
        
        try {
            
            FileWriter escritura = new FileWriter(ruta_archivo);
            
            for(int i=0; i<frase.length();i++){
                
                escritura.write(frase.charAt(i));
                
            }
            escritura.close();
        } catch (Exception e) {
        }
        
    }
    
}


