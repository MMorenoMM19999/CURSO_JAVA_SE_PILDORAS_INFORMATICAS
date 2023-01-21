
package Programacion_Orientada_A_Objectos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Angel
 */
public class Uso_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    persona []lasPersonas = new persona[7];
    
     lasPersonas[0] = new Empleado1("Paco Gomez", 85000,1990, 12, 17);
     lasPersonas[1]= new alumno("Ana Lopez", "bilogicas");
     
    
      for(persona p: lasPersonas){
          System.out.println(p.dameNombre()+ p.dameDescripcion());
      }
     
    }
    
}
abstract class persona{
    
    public persona(String nom){
        nombre = nom;
    }
    
    public String dameNombre(){
        
     return nombre;
     
 }
 public abstract String dameDescripcion();
    
    private String nombre;
}

class Empleado1 extends persona{
    
 public Empleado1(String nom, double  sue,int agno, int mes,int dia) {
   super(nom);
   sueldo=sue;
  
     GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
   altaContrato=calendario.getTime(); 
   ++idSiguiente;
    id= idSiguiente;
   
 }  
 
 public String dameDescripcion(){
     return "este empleado tiene un Id :"+ id + " con un sueldo " + sueldo;
 }
 
 
  public double dameSueldo(){
     return sueldo;
 }
   public Date dameFechaContrato(){
     return altaContrato;
 } 

public void  subeSueldo(double porcentaje){
     double aumento=sueldo*porcentaje/100;
     sueldo+=aumento;
 } 
 public static String dameIdSiguiente(){
       return "el IdSiguiente es: "+ idSiguiente;
   }

private double sueldo;
private Date altaContrato;
private int id;
private static int idSiguiente=1;
    




}

class alumno extends persona{
    public alumno(String nom, String car ){
        super(nom);
        carrera = car;
    }
    public String dameDescripcion(){
        
        return "este alumno esta estudiando la carrera de : " + carrera;
     }
    
   
private String carrera;
}
