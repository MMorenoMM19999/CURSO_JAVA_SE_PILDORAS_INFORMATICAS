
package Programacion_Orientada_A_Objectos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Angel
 */
public class Uso_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // Jefatura jefe_rrhh= new Jefatura("Juan",55000, 2006, 9, 25);
   // jefe_rrhh.estableciendoIncentivo(2570);
        
    Empleado []misEmpleados = new Empleado[7];
    
     misEmpleados[0] = new Empleado("Paco Gomez", 85000,1990, 12, 17);
     misEmpleados[1]= new Empleado("Ana Lopez", 95000,1995, 06, 02);
     misEmpleados[2] = new Empleado("Maria Martin", 105000,2002, 03, 15);
     misEmpleados[3] = new Empleado(" Martin", 10500,2002, 03, 19);
    // misEmpleados[4]=jefe_rrhh;//polimosfirmo en accion . principio de sustitucion 
   //  misEmpleados[4] = new Empleado("Mariano", 1000,2002, 05, 10); 
    
     for(Empleado e: misEmpleados){
        //  e.subeSueldo(5);
      }
      for(Empleado e: misEmpleados){
          System.out.println("Nombre :" +e.dameNombre()
          + " sueldo :" + e.dameSueldo()+ " fecha de alta :" + e.dameFechaContrato());
      }
     System.out.println(Empleado.dameIdSiguiente()); 
    }
    
}


class Empleado{
    
 public Empleado(String nom, double  sue,int agno, int mes,int dia) {
   nombre = nom;
   sueldo=sue;
  
     GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
   altaContrato=calendario.getTime();  
    id= idSiguiente;
   idSiguiente++;
 }  
 public String dameNombre(){
     return nombre;
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
private String nombre;
private double sueldo;
private Date altaContrato;
private int id;
private static int idSiguiente=1;
    
}
/*
class Jefatura extends Empleado{
    public Jefatura(String nom,double sue, int agno, int mes, int dia){
        super(nom,sue,agno,mes,dia);
    }
    
   public void estableciendoIncentivo (double b){
  incentivo = b;
} 
 public double dameSueldo(){
     double sueldoJefe= super.dameSueldo();
     return sueldoJefe + incentivo;
 }  
      
private double incentivo;    
    
}
*/


