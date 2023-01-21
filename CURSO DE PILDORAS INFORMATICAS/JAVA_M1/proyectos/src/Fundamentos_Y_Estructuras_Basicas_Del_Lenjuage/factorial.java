/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        long resultado= 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero "));
        
        for(int i=numero;i>0;i++){
            resultado=resultado*i;
        }
        System.out.println("el fatorial de " + numero + "  es " + resultado);
    }
    
}
