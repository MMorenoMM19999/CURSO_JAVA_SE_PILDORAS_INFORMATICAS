
package Fundamentos_Y_Estructuras_Basicas_Del_Lenjuage;

/**
 *
 * @author Angel
 */
public class arrays_bidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [][]matriz = new int [4][5];
    
    matriz[0][0]=15;
    matriz[0][1]=21;
    matriz[0][2]=22;
    matriz[0][3]=143;
    matriz[0][4]=14;
            
    matriz[1][0]=1523;
    matriz[1][1]=2132;
    matriz[1][2]=222;
    matriz[1][3]=1413;
    matriz[1][4]=114;    
    
    matriz[2][0]=5;
    matriz[2][1]=1;
    matriz[2][2]=2;
    matriz[2][3]=43;
    matriz[2][4]=4;
    
     matriz[3][0]=156;
    matriz[3][1]=235;
    matriz[3][2]=232;
    matriz[3][3]=13;
    matriz[3][4]=145;
    
    for(int i= 0; i<4;i++){
        System.out.println();
        for(int j=0;j<5;j++){
            System.out.println(matriz[i][j]+"  ");            
        }
    }
    
    }
    
}
