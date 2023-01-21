
package Programacion_Orientada_A_Objectos;

/**
 *
 * @author Angel
 */
public class pruebas {

  
    public static void main(String[] args) {
        // TODO code application logic here
   Empleados trabjador1 = new Empleados("Paco");
   Empleados trabjador2 = new Empleados("Ana");
   Empleados trabjador3 = new Empleados("Antonio");
   Empleados trabjador4 = new Empleados("Maria");
   
   trabjador1.cambiaSeccion("RRHH");
  
   
        System.out.println(trabjador1.devuelveDatos() + "\n" + trabjador2.devuelveDatos()+ "\n" + trabjador3.devuelveDatos()
        + "\n" + trabjador4.devuelveDatos());
        
        System.out.println(Empleados.dameIdSiguiente()); 
       
    }
    
    
}
 class Empleados{
     public Empleados(String nom){
         nombre = nom;
         seccion = "administracion";
         id= idSiguiente;
         idSiguiente++;
     }
  public void cambiaSeccion (String seccion ){
      this.seccion=seccion;
  }   
    
  public String devuelveDatos(){
      return "el nombre es : "+nombre + " y la seccion es :  " + seccion + " y el id es: " + id;
  }   
     
   public static String dameIdSiguiente(){
       return "el IdSiguiente es: "+ idSiguiente;
   }  
     
     private final String nombre;
     private String seccion;
     private int id;
     private static int idSiguiente=1;
 }  