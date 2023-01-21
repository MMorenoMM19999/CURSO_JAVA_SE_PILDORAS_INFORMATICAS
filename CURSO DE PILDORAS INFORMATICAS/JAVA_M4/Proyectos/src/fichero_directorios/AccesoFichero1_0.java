
package fichero_directorios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Angel
 */
public class AccesoFichero1_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException  {
  
        leer_fichero v = new leer_fichero();
       
        v.leer();
    
    
    
    }
    
}
class leer_fichero{
    public void leer() throws FileNotFoundException, IOException{
        try {
             entrada = new FileReader("texto_1_0.txt");
             
             BufferedReader mibuffer = new BufferedReader(entrada);
             
             String linea = "";
             
             while(linea !=null){
               
                 linea = mibuffer.readLine();
                
                if(linea!=null){
                
                    System.out.println(linea);
                 
                }
             }
        } catch (IOException e) {
            System.out.println("no se ha encontrado el archivo compa ");
        }finally{
            try {
                
                 entrada.close();
                 
            } catch (Exception e) {
                
                e.printStackTrace();
                
            }
 
           
        }
  
       
    }
    FileReader entrada;
}