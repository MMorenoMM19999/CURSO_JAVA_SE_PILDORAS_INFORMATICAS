/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

/**
 *
 * @author Angel
 */
public class uso_arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int []matriz_aleatoria=new int [150];
    
    for (int i=0;i<matriz_aleatoria.length;i++){
        matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
    }
    for(int numeros:matriz_aleatoria){
        System.out.println(numeros + " ");
    }
   String [] paises ={"españa","mexico","colombia","puerto rico"}; 
   
   for(String elemento:paises){
       System.out.println("Pais :" + elemento);
   }
    
    }
    
}
