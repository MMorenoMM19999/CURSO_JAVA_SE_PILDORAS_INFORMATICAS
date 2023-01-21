
package Programacion_Orientada_A_Objectos;

/**
 *
 * @author Angel
 */
public class coche {
private int ruedas;
private int largo;
private int ancho;
private int motor;
private int peso;


String color;
int peso_total;
boolean asientos_cuero,climatizador;


public coche(){
  
    ruedas =4;
    largo=2000;
    ancho=300;
    motor=1600;
    peso=500;
    
}
 public String dime_datos_generales(){
     return "la plataforma del vehiculo tiene " +ruedas + " ruedas " 
             +"mide " + largo/1000 + " metros con un ancho de " + ancho
             + " cm y un peso de plataforma de " + peso + " KG ";
 } 

public void esteble_color (String color_coche){
    color=color_coche;
}
    public String dime_color(){
     return "el color del coche es :" +color;
 } 

public void configura_Asientos(String asientos_cuero){
    
    if(asientos_cuero.equalsIgnoreCase("si")){
        this.asientos_cuero=true;
    }else{
        this.asientos_cuero=false;
    }
}
    public String dime_asientos(){
        if(asientos_cuero==true){
            return "el coche tiene asientos de cuero";
        }else{
            return "el coche tiene asientos de serie";
        }
    }
    public void configura_climatizador(String climatizador){
    
    if(climatizador.equalsIgnoreCase("si")){
        this.climatizador=true;
    }else{
        this.climatizador=false;
    }
}
    public String dime_climatizador(){
        if(climatizador==true){
            return "el coche incorpora climatizador";
        }else{
            return "el coche lleva aire acondicionado";
        }
    }  
    
      public String dime_peso_coche(){
          int peso_carroceria=500;
          peso_total=peso_total+peso_carroceria;
          
        if(asientos_cuero==true){
            peso_total=peso_total+50;
           
        }if(climatizador==true){
             peso_total=peso_total+20;
        }
        
    return "el peso del coche es " + peso_total;
   
    }    
       public int precio_coche(){
          int precio_final=10000;
         
          
        if(asientos_cuero==true){
            precio_final+=2000;
           
        }if(climatizador==true){
            precio_final+=1500;
        }
        
    return precio_final;
   
    }    
      
    
}
