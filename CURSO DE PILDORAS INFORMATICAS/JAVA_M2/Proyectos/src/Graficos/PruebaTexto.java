


package Graficos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




/**
 *
 * @author Angel
 */
public class PruebaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MArcoTexto dg = new MArcoTexto();
    
    dg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dg.setVisible(true);
    
    }
    
}

class MArcoTexto extends JFrame{
    
    public MArcoTexto(){
        
        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);
       
         
        
        LaminaTexto hf = new LaminaTexto();
      
        add(hf);
    }
    
    
}

class  LaminaTexto extends JPanel{
    
    public LaminaTexto(){
        
        setLayout(new BorderLayout());
        
        JPanel milamina2 = new JPanel();
        
        milamina2.setLayout(new FlowLayout());
        
        resultado= new JLabel("",JLabel.CENTER);
        
        
      JLabel texto1 = new JLabel("email : ");
      
      milamina2.add(texto1); 
      
      campo1 = new JTextField(20);
      
      milamina2.add(campo1);
      
      add(resultado,BorderLayout.CENTER);
      
      miboton = new JButton("comprobar");
       
      DameTexto mievento = new DameTexto();
      
      miboton.addActionListener(mievento);
      
      milamina2.add(miboton);
      
      add(milamina2,BorderLayout.NORTH);
      
          
    }
    
    
  private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
      
            int correcto =0;
            
            String email = campo1.getText().trim();
            
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    correcto++;
                    
                }
            }
            if(correcto!=1){
                resultado.setText("incorrecto");
                
            }else{
                
                resultado.setText("correcto");
                
            }
            
        }
      
      
      
  }
    
    
    
    
    private JTextField campo1;
    private JButton miboton;
    private JLabel resultado;
    
    
    
    
    
}






