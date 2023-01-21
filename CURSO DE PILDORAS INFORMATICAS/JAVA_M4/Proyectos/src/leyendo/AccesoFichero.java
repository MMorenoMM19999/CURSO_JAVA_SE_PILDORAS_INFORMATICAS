
package leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Angel
 */
public class AccesoFichero {

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
             entrada = new FileReader("texto.txt");
             int c=0;
             while(c!=-1){
                 c=entrada.read();
                 //System.out.println(c);

                
                char letra =(char)c;
                 System.out.print(letra);
}
        } catch (IOException e) {
            System.out.println("no se ha encontrado el archivo compa ");
        }finally{
            
            entrada.close();
        }
  
       
    }
    FileReader entrada;
}