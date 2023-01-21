

package fichero_directorios;

import java.io.File;

/**
 *
 * @author Angel
 */
public class Pruebas_Rutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    File ruta = new File("C:\\Users\\Angel\\Documents\\CURSO_JAVA\\JAVA_M4");
    
        System.out.println(ruta.getAbsolutePath());
        
        String[] nombres_archivos =ruta.list();
        
        for(int i=0;i<nombres_archivos.length;i++){
            
            System.out.println(nombres_archivos[i]);
            
            File f= new File(ruta.getAbsolutePath(),nombres_archivos[i]);
            
            if(f.isDirectory()){
                
                String [] archivos_subcarpeta = f.list();
                
                for(int j=0;j<archivos_subcarpeta.length;j++){
                    
                    System.out.println(archivos_subcarpeta[j]);
                    
                }
                
            }
            
            
        }
    
    }
    
}
