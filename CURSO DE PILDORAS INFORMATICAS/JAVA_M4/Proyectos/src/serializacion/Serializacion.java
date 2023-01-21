


package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Angel
 */
public class Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Administrador jefe = new Administrador ("Juan" , 80000,2005,12,15);
        jefe.setIncentivo(5000);
        
        Empleado[] personal = new Empleado[3];
        
        personal[0]=jefe;
        
        personal[1]=new Empleado("Anna ",25000,2008,10,1);
        
        personal[2]= new Empleado("Luis", 18000,2012,9,15);
        try {
            
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Angel\\Documents\\CURSO_JAVA\\JAVA_M4\\Proyectos/empleado.dat"));
            
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();
            
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:\\Users\\Angel\\Documents\\CURSO_JAVA\\JAVA_M4\\Proyectos/empleado.dat"));
             
            Empleado[]personal_recuperado=(Empleado[])recuperando_fichero.readObject();
        
            recuperando_fichero.close();
            
            for(Empleado e: personal_recuperado){
                System.out.println(e);
            }
            
        } catch (Exception e) {
        
        
        }
    }
    
}
//---------------------------------------------------------------------

class Empleado implements Serializable{
    
    private static  final long serialVersionUID =1l;
    
    public Empleado(String n, double s , int agno, int mes , int dia ){
        
        nombre=n;
        sueldo=s;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        fechaContrato=calendario.getTime();
        
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Date getFechaContrato(){
        return fechaContrato;
    }
    
    public void subirSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    public String toString(){
        return "El Nombre  es = "+ nombre + ",su  sueldo es ="+ sueldo + ",fecha de contrato =" + fechaContrato;
    }
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    
}
class Administrador extends Empleado{
    
      private static  final long serialVersionUID =12l;
    
    public Administrador (String n , double s, int agno, int mes, int dia){
        super(n, s, agno, mes, dia);
        incentivo=0;
    }
    public double getSueldo(){
        double sueldoBase=super.getSueldo();
        return sueldoBase + incentivo;
    }
    public void setIncentivo(double b){
        incentivo=b;
    }
    public String toString(){
        return super.toString()+"Incentivo = "+incentivo;
    }
    
    private double incentivo;
    
}