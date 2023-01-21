
package Programacion_Orientada_A_Objectos;

/**
 *
 * @author Angel
 */
public class furgoneta extends coche {

    /**
     * @param args the command line arguments
     */
   private int capacidad_carga;
   private int plazas_extra;
   public furgoneta(int plazas_extra, int capacidad_carga){
     super();//lamamos al contructor de la clase padre 
     
     this.capacidad_carga= capacidad_carga;
     this.plazas_extra=plazas_extra;
     
   
   
   }
   public String dimeDatosFurgoneta(){
       return " la capacidad de carga es : "+ capacidad_carga+ " y las plazas son : " + plazas_extra;
   }
    
}
