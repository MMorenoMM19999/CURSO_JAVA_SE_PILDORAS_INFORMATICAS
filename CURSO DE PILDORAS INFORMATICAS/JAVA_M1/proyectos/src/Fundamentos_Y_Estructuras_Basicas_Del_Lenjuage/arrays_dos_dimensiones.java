
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

/**
 *
 * @author Angel
 */
public class arrays_dos_dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   double acumulado;
   double intereses =0.10;
   
   double [][]saldo= new double[6][5];
   
   for(int i=0;i<6;i++){
       saldo[i][0]=10000;
       acumulado=10000;
       
       for(int j=0;j<5;j++){
           acumulado=acumulado+(acumulado*intereses);
           saldo[i][j]=acumulado;
       
    
       }
   intereses=intereses+0.10;
   
   }
   
   for(int z=0;z<6;z++){
       System.out.println();
       for(int h=0;h<5;h++){
           System.out.printf("%1.2f",saldo[z][h]);
           System.out.print(" ");
       }
   }
    
    }
    
}
