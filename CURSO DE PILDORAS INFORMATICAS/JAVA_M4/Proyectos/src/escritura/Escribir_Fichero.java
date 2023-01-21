

package escritura;

import java.io.FileWriter;

/**
 *
 * @author Angel
 */
public class Escribir_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    escribiendo b = new escribiendo();
    b.escribir();
    
    }
    
}
class escribiendo{
    
    public void escribir() {
    
        //este texto si se guarda en en archvio de .txt solo que no lo muestra 
        //en consola por ende debes de revisar el archivo donde este el String "frase"
        //se registra con exito 
        String frase ="esto es una prueba de escritura";
        try {
            FileWriter escritura = new FileWriter("texto_nuevo.txt");
            
            for(int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
                
            }
            escritura.close();
            
            
        } catch (Exception e) {
        
            e.printStackTrace();
            
        }
    
}
    
}