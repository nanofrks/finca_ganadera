package finca_ganadera;

import javax.swing.JOptionPane;

/**
 *
 * @author ARBOLEDA ARBOLEDA NATALIA
 */
public class Finca_ganadera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            login formulario=new login();
            formulario.setVisible(true);
            
        }catch(Exception error){
         JOptionPane.showMessageDialog(null, "Error" + error);
        }
    }
    
}
