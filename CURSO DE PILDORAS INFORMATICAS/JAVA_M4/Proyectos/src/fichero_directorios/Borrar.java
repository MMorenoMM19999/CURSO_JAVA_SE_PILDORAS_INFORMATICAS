

package fichero_directorios;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Angel
 */
public class Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    File ruta = new File("C:"+ File.separator+ "Users"+ File.separator+"Angel"+ File.separator+"Documents" + File.separator +"CURSO_JAVA" + File.separator+ "JAVA_M4"+ File.separator + " Prueba_de_texto.txt" );
    
    ruta.delete();
    

            
   }
 }
 



